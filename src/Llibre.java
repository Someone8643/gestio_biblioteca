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
public boolean isPrestat() {
    return prestat;
}

// Métodos

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

    ToString() {

        if(prestat == false){
            prestat = "El llibre no està prestat";
        } else {
            prestat = "El llibre ja està prestat";
        }
        
        return "Títol: " + titol + ", Autor: " + autor + ", Prestat: " + prestat;
    }

}