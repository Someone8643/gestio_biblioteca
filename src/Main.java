import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Llibre llibre1 = new Llibre("El Amanecer Blanco", "Samuel Luque");
		Llibre llibre2 = new Llibre("El", "Samuel Luque");
		ArrayList<Llibre> llibres = new ArrayList();
		
		llibres.add(llibre1);
		llibres.add(llibre2);
		Biblioteca biblioteca = new Biblioteca(llibres);
		GestorBiblioteca gestor = new GestorBiblioteca(biblioteca);
		

		biblioteca.llistarLlibres();
		
		System.out.println(llibre1);
		
		gestor.buscarLlibreAccents("El Amanecer Blanco");
		
		System.out.println(gestor.donarEstoc());
		
		System.out.println(gestor.buscarLlibreSimilitud("El"));
		
		gestor.mostrarBiblioteca();
		
		gestor.crearUsuari("Samuel");
		
		gestor.buscarUsuari("Samuel");
		
		
		gestor.llistarUsuaris();
	}

}
