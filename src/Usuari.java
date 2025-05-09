import java.util.ArrayList;

public class Usuari {

	// Propietats
	private String nom;
	private ArrayList<Llibre> llibresPrestats;
	
	


	// Constructors
	public Usuari(String nom) {
		this.nom = nom;
		this.llibresPrestats = new ArrayList<>();
	}
	
	public Usuari(String nom, ArrayList<Llibre> llibresPrestats) {
		this.nom = nom;
		this.llibresPrestats = new ArrayList<>();
		
	}

	// Getters i Setters
	
	public ArrayList<Llibre> getLlibresPrestats() { 
		return llibresPrestats; 
	}

	// Mètodes
	
	@Override
	public String toString() {
		return (nom + ": libros por devolver: " + llibresPrestats);
	}

	
	/**
	 * Mètode per agafar un llibre prestat.
	 * @param afegir llibre
	 */
	public void afegirLlibre(Llibre llibre) {
		llibresPrestats.add(llibre);
		
	}

	/**
	 * Funció que retorna un llibre.
	 * @param llibre
	 */
	public void retornarLlibre(Llibre llibre) { 
		llibresPrestats.remove(llibre);

	}

	// Setters i Getters
	public String getNom() { return nom; }
	
	

	public void setNom(String nom) {
		this.nom = nom;
	}

	


}