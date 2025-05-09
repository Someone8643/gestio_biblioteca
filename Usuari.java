import java.util.ArrayList;

public class Usuari {

	//propietats
	private String nom;
	private ArrayList<Llibre> llibresPrestats;
	
	


	//constructor
	public Usuari(String nom) {
		this.nom = nom;
		this.llibresPrestats = new ArrayList<>();
	}
	
	public Usuari(String nom, ArrayList<Llibre> llibresPrestats) {
		this.nom = nom;
		this.llibresPrestats = new ArrayList<>();
		
	}


	//metodes
	
	
	


	@Override
	public String toString() {
		return (nom + ": libros por devolver: " + llibresPrestats);
	}

	
	/**
	 * metode per agafar un llibre prestat
	 * @param afegir llibre
	 */
	public void afegirLlibre(Llibre llibre) {
		llibresPrestats.add(llibre);
		
	}

	public void retornarLlibre(Llibre llibre) { 
		llibresPrestats.remove(llibre);

	}

	//setters y getters
	public String getNom() { return nom; }
	
	

	public void setNom(String nom) {
		this.nom = nom;
	}

	public ArrayList<Llibre> getLlibresPrestats() { return llibresPrestats; }


}
