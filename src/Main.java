package src;

import java.util.Scanner;

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
            System.out.println("1. Gestions de llibres.");
            System.out.println("2. Gestions d'usuaris.");
            System.out.print("Introdueix un número d'opció (-1 per sortir): ");
            opcio = entrada.nextInt();

            // Posar codi (cridar funcions per exemple) de cada opció
            switch (opcio) {
                case 1: {

                    while (opcio != -1) {

                        // Es mostra un menú, editar segons les necessitats
                        System.out.println("Opcions:");
                        System.out.println("1. Afegir llibre.");
                        System.out.println("2. Modificar llibre.");
                        System.out.println("3. Eliminar llibre.");
                        System.out.print("Introdueix un número d'opció (-1 per tornar enrere): ");
                        opcio = entrada.nextInt();

                        // Posar codi (cridar funcions per exemple) de cada opció
                        switch (opcio) {
                            case 1: {

                                System.out.println("Introdueix les dades per crear un nou llibre i afegir-lo a la biblioteca:");

                                System.out.println("Títol:");
                                String titol = entrada.nextLine();

                                System.out.println("Autor:");
                                String autor = entrada.nextLine();

                                Llibre llibreAfegir = new Llibre(titol, autor, false);

                                gestor.afegirLlibre(llibreAfegir);
                            }
                            case 2: {

                                System.out.println("Introdueix el títol del llibre per editar:");
                                String titolABuscar = entrada.nextLine();

                                // TODO
                                Llibre llibreAModificar = gestor.buscarLlibreAccents(titolABuscar);

                                System.out.println("Introdueix les dades que tindrà el llibre:");

                                System.out.println("Títol:");
                                String titol = entrada.nextLine();

                                System.out.println("Autor:");
                                String autor = entrada.nextLine();

                                Llibre llibreAfegir = new Llibre(titol, autor, false);

                                gestor.afegirLlibre(llibreAfegir);
                            }
                            case 3: {

                                System.out.println("Eliminar llibre:");

                                System.out.println("Introdueix el títol del llibre a ser eliminat:");
                                gestor.eliminarLlibreNom(entrada.nextLine());
                            }
                            case -1: {

                                System.out.println("Tornant al menú general...");
                            }

                            default:
                                System.out.println("Opció incorrecta!");
                        }
                    }




                }
                case 2: {


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