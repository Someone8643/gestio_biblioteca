package src;

import java.time.LocalDate;
import java.util.ArrayList;

public class GestorBiblioteca {
	// Propietats
	private ArrayList<Prestec> prestecs = new ArrayList();
	private Biblioteca biblioteca;
	private ArrayList<Usuari> usuaris = new ArrayList();

	// Constructors
	public GestorBiblioteca(Biblioteca biblioteca) {
		this.biblioteca = biblioteca;
	}

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
	public void prestarLlibre(Llibre llibre, Usuari usuari) {
		if (!(llibre.isPrestat())) {
			llibre.prestar(usuari);
			Prestec prestec = new Prestec(usuari, llibre, LocalDate.now());
			prestecs.add(prestec);
			System.out.println(usuari.getNom() + " ha agafat el llibre: " + llibre.getTitol());
		} else {
			System.out.println("Aquest llibre ja està prestat.");
		}

	}
	
	/**
	 * Funció que genera un prèstec i s'ho dona a l'usuari.
	 * @param nomLlibre
	 * @param nomUsuari
	 */
	public void prestarLlibre(String nomLlibre, String nomUsuari) {
		Llibre llibre = this.buscarLlibreAccents(nomLlibre);
		Usuari usuari = this.buscarUsuari(nomUsuari);
		if (llibre != null && !(llibre.isPrestat()) && usuari != null) {
			llibre.prestar(usuari);
			Prestec prestec = new Prestec(usuari, llibre, LocalDate.now());
			prestecs.add(prestec);
			System.out.println(usuari.getNom() + " ha agafat el llibre: " + llibre.getTitol());
			
		} else {
			System.out.println("No s'han trobat alguna de les dades o ja està prestat.");
		}
		
	}

	/**
	 * Funció que calcula l'estoc actual.
	 * @param biblioteca
	 * @return
	 */
	public int donarEstoc() {
		int estoc = 0;
		for (Llibre llibre : biblioteca.getLlibres()) {
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
	public void crearLlibre(String titol, String autor) {
		this.biblioteca.getLlibres().add(new Llibre(titol, autor));
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
	public Llibre buscarLlibreAccents(String titol) {
		return this.biblioteca.buscarLlibreAccents(titol);
	}

	/**
	 * Funció que busca el llibre més similar a la comparació donada.
	 * @param titol
	 * @return
	 */
	public Llibre buscarLlibreSimilitud(String titol) {
		return this.biblioteca.buscarLlibreSimilitud(titol);
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
	public void crearUsuari(String nom) {
		this.usuaris.add(new Usuari(nom));
		System.out.println("S'ha afegit un nou usuari.");
	}


	/**
	 * Funció que modifica l'usuari seleccionat per el nom.
	 * @param nom 
	 * @param nouNom
	 */
	public void modificarUsuari(String nom, String nouNom) {
		boolean trobat = false;
		for (Usuari usuari : usuaris) {
			if (usuari.getNom().equalsIgnoreCase(nom)) {
				usuari.setNom(nouNom);  // Aquí es modifica el nom de l'usuari.
				trobat = true;
				System.out.println("Usuari modificat correctament");

			}
		}
		// Comentari si no existeix l'usuari.
		if (!trobat) {
			System.out.println("Usuari no trobat");
		}
	}

	/**
	 * Funció que mostra a tots els usuaris.
	 */
	public void llistarUsuaris() {
		
		// Recorreix la matriu i genera un llistat que mostra tots els usuaris.
		System.out.println("Llistat de tots els usuaris registrats:");
		for (int i = 0; i < usuaris.size(); i++) {
			Usuari usuari = usuaris.get(i);
			System.out.println((i + 1) + " | " + usuari.getNom() + " " + usuari.getLlibresPrestats());
			
		}
	}
	
	/**
	 * Funció que busca un usuari a partir del seu nom i el retorna.
	 * @param 
	 * @return 
	 */
	public Usuari buscarUsuari(String nom) {
		
		// Recorreix l'array i si el nom equival al donat en la variable ho mostra.
	    for (Usuari usuari : usuaris) {
	        if (usuari.getNom().equalsIgnoreCase(nom)) {
	            return usuari;
	            
	        }
	    }
	    // Si no troba res retorna un missatge.
	    System.out.println("Usuari no trobat.");
	    return null;
	}


}






