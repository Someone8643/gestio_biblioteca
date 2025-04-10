public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        // Llibres
        Llibre llibre1 = new Llibre("1984", "George Orwell");
        Llibre llibre2 = new Llibre("El petit príncep", "Antoine de Saint-Exupéry");

        biblioteca.afegirLlibre(llibre1);
        biblioteca.afegirLlibre(llibre2);

        // Usuaris
        Usuari usuari = new Usuari("Carla");

        // Crear el gestor
        GestorBiblioteca gestor = new GestorBiblioteca();

        // Fer préstecs
        gestor.prestarLlibre(usuari, llibre1);
    }
}