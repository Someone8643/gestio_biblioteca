import java.time.LocalDate;
import java.util.ArrayList;

public class GestorBiblioteca {
	// Propietats
	private ArrayList<Prestec> prestecs = new ArrayList();
	private ArrayList<Llibre> biblioteca;
	
	// Constructors
	public GestorBiblioteca(ArrayList<Prestec> prestecs , Biblioteca biblioteca) {
		this.prestecs = prestecs;
		this.biblioteca = biblioteca.getLlibres();
	}

	// Getters i Setters
	public ArrayList<Prestec> getPrestecs() {
		return prestecs;
	}

	public void setPrestecs(ArrayList<Prestec> prestecs) {
		this.prestecs = prestecs;
	}
	
	public ArrayList<Llibre> getBiblioteca() {
		return biblioteca;
	}
	
	// Mètodes
	/**
	 * Funció que genera un prèstec i s'ho dona a l'usuari.
	 * @param usuari
	 * @param llibre
	 */
	public void prestarLlibre(Usuari usuari, Llibre llibre) {
		if (!(llibre.esPrestat())) {
			llibre.prestar();
			Prestec prestec = new Prestec(usuari, llibre, LocalDate.now());
			prestecs.add(prestec);
			usuari.afegirLlibre(llibre);
			System.out.println(usuari.getNom() + " ha agafat el llibre: " + llibre.getTitol());
		} else {
			System.out.println("Aquest llibre ja està prestat.");
		}

	}
	
	/**
	 * Funció que calcula l'estoc actual.
	 * @param biblioteca
	 * @return
	 */
	public int donarEstoc() {
		int estoc = 0;
		for (Llibre llibre : biblioteca) {
			if (!(llibre.isPrestat())) {
				estoc++;
			}
		}
		return estoc;
	}

}


