public class Llibre {

// Propietats
private String titol;
private String autor;
private boolean prestat;

// Constructors
public Llibre(String titol, String autor, boolean prestat){

    this.titol = titol;
    this.autor = autor;
    this.prestat = false;
}


// Getters i Setters
public String getTitol() {
    return titol;
}
public String getAutor() {
    return autor;
}

// Mètodes
public void prestar();

if (prestat == false) {
    prestat = true;
} else {
    System.out.println("El llibre ja està prestat.");
}
}
public void retornar() {
    if (prestat == true) {
        prestat = false;
    } else {
        System.out.println("El llibre ja està retornat.");
    }

}