package src;

import java.util.ArrayList;
import java.util.Collections;

public class Biblioteca  {
	// Propietats
	private ArrayList<Llibre> llibres = new ArrayList();

	// Constructors
	public Biblioteca() {

	}

	public Biblioteca (ArrayList<Llibre> llibres) {
		this.llibres = llibres;
	}

	// Getters i Setters
	public ArrayList<Llibre> getLlibres() {
		return llibres;
	}

	// Mètodes
	/**
	 * Funció que afegeix un llibre
	 * @param llibre
	 */
	public void afegirLlibre(Llibre llibre) {
		this.llibres.add(llibre);
	}
	
	/**
	 * Funció que busca un llibre pel seu títol.
	 * @param titol
	 * @return
	 */
	public Llibre buscarLlibre(String titol) {
		for (Llibre llibre : llibres) {
			if (llibre.getTitol().equals(titol)) {
				return llibre;
			}
		}
		System.out.println("No s'ha trobat cap llibre");
		return null;
	}
	
	/**
	 * Funció que retorna el llibre que tingui major nombre de lletres en concordança amb el títol.
	 * @return
	 */
	public Llibre buscarLlibreSimilitud(String titol) {
		int semblançaActual = Integer.MIN_VALUE;
		Llibre llibreActual = null;
		if (this.llibres.size() == 0) {
			return null;
		}
		for (Llibre llibre : llibres) {
			int similitud = retornarSemblanca(llibre, titol);
			if (similitud > semblançaActual) {
					semblançaActual = similitud;
					llibreActual = llibre;
			}
		}
		return llibreActual;
	}

	/**
	 * Funció que busca un llibre pel seu títol.
	 * @param titol
	 * @return
	 */
	public Llibre buscarLlibreAccents(String titol) {
		for (Llibre llibre : llibres) {
			if (llibre.getTitol().equalsIgnoreCase(titol)) {
				return llibre;
			}
		}
		System.out.println("No s'ha trobat cap llibre");
		return null;
	}

	/**
	 * Funció que llista els llibres amb numeració.
	 */
	public void llistarLlibres() {
		for (int i=0;i<this.llibres.size();i++) {
			System.out.println((i + 1) + " " + this.llibres.get(i));
		}

	}

	/**
	 * Funció que llista els llibres d'un autor.
	 * @param autor
	 */
	public void llistarLlibresAutor(String autor) {
		int numeracio = 1;
		for (Llibre llibre : llibres) {
			if (llibre.getAutor().equalsIgnoreCase(autor)) {
				System.out.println("Llibres de l'autor " + autor);
				System.out.println(numeracio + " | " + llibre.getTitol());
				numeracio++;
			}
		}

	}
	
	/**
	 * Funció que retorna el nombre de lletres que concorden amb la comparació.
	 * @param llibre
	 * @param comparacio
	 * @return
	 */
	private int retornarSemblanca(Llibre llibre, String comparacio) {
		// Necesitem el que tingui menor longitud entre la comparació i el títol.
		int longitud = Math.min(llibre.getTitol().length(), comparacio.length());;
		int similitud = 0;
		for(int i=0;i< longitud;i++) {
			if (llibre.getTitol().charAt(i) == comparacio.charAt(i)) {
				similitud++;
			} else {
				return similitud;
			}
		}
		return similitud;
	}
	


}
