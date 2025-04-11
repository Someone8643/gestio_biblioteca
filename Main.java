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


        /*
         * Bloc de codi per a copiar que mostra un menu i segons el número d'opció es fa un cas o altre.
         * Pensat per a un ús general. Inclou Scanner.
         */
        Scanner entrada = new Scanner(System.in);

        System.out.println("Benvingut al sistema!");

        int opcio = 0;
        while (opcio != -1) {

            // Es mostra un menú, editar segons les necessitats
            System.out.println("Opcions:");
            System.out.println("1. .");
            System.out.println("2. .");
            System.out.println("3. .");
            System.out.print("Introdueix un número d'opció (-1 per sortir): ");
            opcio = entrada.nextInt();

            // Posar codi (cridar funcions per exemple) de cada opció
            switch (opcio) {
                case 1: {


                }
                case 2: {


                }
                case 3: {


                }
                case -1: {

                    System.out.println("Sortint del sistema...");
                }

                default:
                    System.out.println("Opció incorrecta!");
            }
        } // Fí bucle
    }
}