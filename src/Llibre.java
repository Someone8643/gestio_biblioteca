package src;

public class Llibre {

	// Propietats

	private String titol;
	private String autor;
	private boolean prestat;

	// Constructors
	public Llibre() {

	}

	public Llibre(String titol, String autor){
		this.titol = titol;
		this.autor = autor;
		this.prestat = false;
	}


	// Getters i Setters

	public String getTitol() {
		return titol;
	}
	public String getAutor() {
		return autor;
	}
	public boolean isPrestat() {
		return prestat;
	}
	public void setTitol(String titol) {
		this.titol = titol;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}

	// Mètodes

	/**
	 * Funció que genera un prèstec a un usuari.
	 */
	public void prestar(Usuari usuari){
		if (!prestat) {
			this.prestat = true;
			usuari.afegirLlibre(this);
			System.out.println();

		} else {
			System.out.println("El llibre ja està prestat.");
		}
	}

	public void retornar(Usuari usuari) {
		if (prestat == true) {

			usuari.retornarLlibre(this);
			prestat = false;

		} else {

			System.out.println("El llibre ja està retornat.");
		}
	}

	public String toString() {

		String llibrePrestar="";
		if(!prestat){
			llibrePrestar = "El llibre no està prestat";
		} else {
			llibrePrestar = "El llibre està prestat";
		}

		return "Títol: " + titol + ", Autor: " + autor + ", Prestat: " + llibrePrestar + ".";
	}

}