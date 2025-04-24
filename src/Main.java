import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Llibre llibre1 = new Llibre();
		
		ArrayList<Llibre> llibres = new ArrayList();
		
		llibres.add(llibre1);
		
		Biblioteca biblioteca = new Biblioteca(llibres);
		
		biblioteca.llistarLlibres();
	}

}
