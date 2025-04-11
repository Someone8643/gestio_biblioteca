import java.time.LocalDate;
import java.util.ArrayList;

public class GestorBiblioteca {
	// Propietats
	private ArrayList<Prestec> prestecs = new ArrayList();

	// Constructors
	public GestorBiblioteca(ArrayList<Prestec> prestecs) {
		super();
		this.prestecs = prestecs;
	}

	// Getters i Setters
	public ArrayList<Prestec> getPrestecs() {
		return prestecs;
	}

	public void setPrestecs(ArrayList<Prestec> prestecs) {
		this.prestecs = prestecs;
	}

	// Metodes
	/**
	 * Funció que genera un prèstec i s'ho dona a l'usuari.
	 * @param usuari
	 * @param llibre
	 */
	public void prestarLlibre(Usuari usuari, Llibre llibre) {
		if (!llibre.esPrestat()) {
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
	public int donarEstoc(Biblioteca biblioteca) {
		int estoc = 0;
		for (Llibre llibre : biblioteca.getLlibres()) {
			if (!(llibre.isPrestat())) {
				estoc++;
			}
		}

	}

}


