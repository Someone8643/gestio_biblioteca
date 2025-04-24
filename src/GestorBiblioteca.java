import java.time.LocalDate;
import java.util.ArrayList;

public class GestorBiblioteca {
	// Propietats
	private ArrayList<Prestec> prestecs = new ArrayList();
	private Biblioteca biblioteca;
	private ArrayList<Usuari> usuaris;
	
	// Constructors
	public GestorBiblioteca(ArrayList<Prestec> prestecs , Biblioteca biblioteca, ArrayList<Usuari> usuaris) {
		this.prestecs = prestecs;
		this.biblioteca = biblioteca;
		this.usuaris = usuaris;
	}

	// Getters i Setters
	public ArrayList<Prestec> getPrestecs() {
		return prestecs;
	}

	public Biblioteca getBiblioteca() {
		return biblioteca;
	}

	public ArrayList<Usuari> getUsuaris() {
		return usuaris;
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

	// Mètodes d'interacció amb biblioteques
	/**
	 * Funció que permet eliminar un llibre pel seu nom.
	 * @param nom
	 */
	public void eliminarLlibreNom(String nom) {
		for (Llibre llibre : biblioteca.getLlibres()) {
			if (llibre.getTitol().equalsIgnoreCase(nom)) {
				biblioteca.getLlibres().remove(llibre);
			}
		}
	}
	
	/**
	 * Funció que permet la creació d'un nou llibre.
	 * @param titol
	 * @param autor
	 * @param prestat
	 */
	public void crearLlibre(String titol, String autor, boolean prestat) {
		this.biblioteca.add(new Llibre(titol, autor, prestat));
		System.out.println("S'ha afegit un nou llibre.");
	}
	
	/**
	 * Funció que afegeix un llibre existent.
	 * @param llibre
	 */
	public void afegirLlibre(Llibre llibre) {
		this.biblioteca.getLlibres().add(llibre);
	}
	
	/**
	 * Funció que mostra els llibres de la biblioteca.
	 */
	public void mostrarBiblioteca() {
		this.biblioteca.llistarLlibres();
	}
	
	/**
	 * Funció que busca un llibre pel seu títol.
	 * @param titol
	 * @return
	 */
	public void buscarLlibreAccents(String titol) {
		this.biblioteca.buscarLlibreAccents(titol);
	}
	
	// Mètodes d'interacció amb usuaris
	/**
	 * Funció que permet eliminar un usuari pel seu nom.
	 * @param nom
	 */
	public void eliminarUsuariNom(String nom) {
		for (Usuari usuari : usuaris) {
			if (usuari.getNom().equalsIgnoreCase(nom)) {
				usuaris.remove(usuari);
			}
		}
	}
	
	/**
	 * Funció que permet la creació d'un nou usuari.
	 * @param nom
	 * @param llibresPrestats
	 */
	public void crearUsuari(String nom, ArrayList<Llibre> llibresPrestats) {
		this.usuaris.add(new Usuari(nom, llibresPrestats));
		System.out.println("S'ha afegit un nou usuari.");
	}
	
}


