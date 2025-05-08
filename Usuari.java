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


	//metodes

	//añadir, modificar y eliminar usuarios



	@Override
	public String toString() {
		return (nom + ": libros por devolver: " + llibresPrestats);
	}

	//metodo de añadir libro, que debe tomar los libros de la libreria que hay y devolverlo o tomarlo
	//TOMAR UN LIBRO PRESTADO
	public void afegirLlibre(Llibre llibre) {
		llibresPrestats.add(llibre);
		
	}

	public void retornarLlibre(Llibre llibre) { 
		llibresPrestats.remove(llibre);

	}

	//settars y getters
	public String getNom() { return nom; }

	public ArrayList<Llibre> getLlibresPrestats() { return llibresPrestats; }


}
