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
	 * Funció que busca un llibre pel seu títol
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
	 * Funció que busca un llibre pel seu títol
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
	 * Funció que llista els llibres amb numeració
	 */
	public void llistarLlibres() {
		for (int i=0;i<this.llibres.size();i++) {
			System.out.println((i + 1) + " " + this.llibres.get(i));
		}

	}

	
	public void llistarLlibresAutor(Llibre autor) {
		

	}
	
	/**
	 * Funció que retorna el nombre de lletres que concorden amb la comparació
	 * @param llibre
	 * @param comparacio
	 * @return
	 */
	private int retornarSemblanca(Llibre llibre, String comparacio) {
		int similitud = 0;
		for(int i=0;i< comparacio.length();i++) {
			if (llibre.getAutor().charAt(i) == comparacio.charAt(i)) {
				similitud++;
			} else {
				return similitud;
			}
		}
		return similitud;
	}
	


}
