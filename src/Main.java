package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        // Llibres
        //Llibre llibre1 = new Llibre("1984", "George Orwell");
        //Llibre llibre2 = new Llibre("El petit príncep", "Antoine de Saint-Exupéry");

        //biblioteca.afegirLlibre(llibre1);
        //biblioteca.afegirLlibre(llibre2);

        // Usuaris
        //Usuari usuari = new Usuari("Carla");

        // Crear el gestor
        GestorBiblioteca gestor = new GestorBiblioteca(biblioteca);

        // Fer préstecs
        //gestor.prestarLlibre(usuari, llibre1);


        /*
         * Bloc de codi per a copiar que mostra un menu i segons el número d'opció es fa un cas o altre.
         * Pensat per a un ús general. Inclou Scanner.
         */
        Scanner entrada = new Scanner(System.in);

        System.out.println("Benvingut al sistema!");

        // Menú general
        int opcioMenuGeneral = 0;
        while (opcioMenuGeneral != -1) {

            // Es mostra un menú, editar segons les necessitats
            System.out.println("Opcions:");
            System.out.println("1. Gestions de llibres.");
            System.out.println("2. Gestions d'usuaris.");
            System.out.print("Introdueix un número d'opció (-1 per sortir): ");
            opcioMenuGeneral = entrada.nextInt();
            entrada.nextLine();
            System.out.println();

            switch (opcioMenuGeneral) {

                // // OP 1
                case 1: {

                    int opcio = 0;

                    while (opcio != -1) {

                        // Es mostra un menú, editar segons les necessitats
                        System.out.println("Opcions:");
                        System.out.println("1. Afegir llibre.");
                        System.out.println("2. Modificar llibre.");
                        System.out.println("3. Eliminar llibre.");
                        System.out.print("Introdueix un número d'opció (-1 per tornar enrere): ");
                        opcio = entrada.nextInt();
                        entrada.nextLine();
                        System.out.println();

                        // Posar codi (cridar funcions per exemple) de cada opció
                        switch (opcio) {
                            case 1: {

                                System.out.println("Introdueix les dades per crear un nou llibre i afegir-lo a la biblioteca:");

                                System.out.println("Títol:");
                                String titol = entrada.nextLine();

                                System.out.println("Autor:");
                                String autor = entrada.nextLine();

                                Llibre llibreAfegir = new Llibre(titol, autor);

                                gestor.afegirLlibre(llibreAfegir);

                                System.out.println();
                                break;

                            }
                            case 2: {

                                System.out.println("Introdueix el títol del llibre per editar:");
                                String titolABuscar = entrada.nextLine();

                                // TODO
                                System.out.println("FALTA FUNCIÓ");
                                Llibre llibreAModificar = gestor.buscarLlibreAccents(titolABuscar);

                                System.out.println("Introdueix les dades que tindrà el llibre:");

                                System.out.println("Títol:");
                                String titol = entrada.nextLine();

                                System.out.println("Autor:");
                                String autor = entrada.nextLine();

                                Llibre llibreAfegir = new Llibre(titol, autor);

                                gestor.afegirLlibre(llibreAfegir);

                                System.out.println();
                                break;

                            }
                            case 3: {

                                System.out.println("Eliminar llibre:");

                                System.out.println("Introdueix el títol del llibre a ser eliminat:");
                                gestor.eliminarLlibreNom(entrada.nextLine());

                                System.out.println();
                                break;

                            }
                            case -1: {
                                System.out.println("Tornant al menú general...");
                                System.out.println();
                                break;
                            }
                            default: {
                                System.out.println("Opció incorrecta!");
                                System.out.println();
                                break;
                            }
                        }
                    }

                    break;
                }
                // // OP 2
                case 2: {

                    int opcio = 0;

                    while (opcio != -1) {

                        // Es mostra un menú, editar segons les necessitats
                        System.out.println("Opcions:");
                        System.out.println("1. Afegir usuari.");
                        System.out.println("2. Modificar usuari.");
                        System.out.println("3. Eliminar usuari.");
                        System.out.println("4. Llistar usuaris.");
                        System.out.println("5. Cercar usuari.");
                        System.out.print("Introdueix un número d'opció (-1 per tornar enrere): ");
                        opcio = entrada.nextInt();
                        entrada.nextLine();
                        System.out.println();

                        // Posar codi (cridar funcions per exemple) de cada opció
                        switch (opcio) {
                            case 1: {

                                System.out.println("Introdueix les dades per crear un nou usuari:");

                                System.out.println("Nom:");
                                String nom = entrada.nextLine();

                                gestor.crearUsuari(nom);

                                System.out.println();
                                break;

                            }
                            case 2: {

                                System.out.println("Introdueix el nom del usuari per editar:");
                                String usuariABuscar = entrada.nextLine();

                                System.out.println("Introdueix les dades que tindrà l'usuari:");

                                System.out.println("Nom:");
                                String nom = entrada.nextLine();

                                gestor.modificarUsuari(usuariABuscar, nom);

                                System.out.println();
                                break;

                            }
                            case 3: {

                                System.out.println("Eliminar usuari:");

                                System.out.println("Introdueix el nom del usuari a ser eliminat:");
                                String nomUsuari = entrada.nextLine();

                                gestor.eliminarUsuariNom(nomUsuari);

                                System.out.println();
                                break;

                            }
                            case 4: {

                                System.out.println("Llistar usuaris:");
                                gestor.llistarUsuaris();

                                System.out.println();
                                break;

                            }
                            case 5: {

                                System.out.println("Cercar usuari:");

                                System.out.println("Introdueix el nom del usuari a ser cercat:");
                                String usuariACercar = entrada.nextLine();

                                System.out.println(gestor.buscarUsuari(usuariACercar));

                                System.out.println();
                                break;

                            }
                            case -1: {
                                System.out.println("Tornant al menú general...");
                                System.out.println();
                                break;
                            }
                            default: {
                                System.out.println("Opció incorrecta!");
                                System.out.println();
                                break;
                            }
                        }
                    }

                    break;
                }
                case -1: {
                    System.out.println("Sortint del sistema...");
                    System.out.println();
                    break;
                }
                default: {
                    System.out.println("Opció incorrecta!");
                    System.out.println();
                    break;
                }
            }
        } // Fí bucle
    }
}

