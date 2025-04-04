public class Llibre {

// Propieades

private String titol;
private String autor;
private boolean prestat;

// Constructores

public Llibre(String titol, String autor, boolean prestat){

    this.titol = titol;
    this.autor = autor;
    this.prestat = false;
}


// getters y setters

public String getTitol() {
    return titol;
}
public String getAutor() {
    return autor;
}



}