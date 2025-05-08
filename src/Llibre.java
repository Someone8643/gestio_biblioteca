public class Llibre {

    // Propieades
    
    private String titol;
    private String autor;
    private boolean prestat;
    
    // Constructores
    public Llibre() {
    	
    }
    
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
    
    public void prestar(){
    this.prestat = true;
    if (!prestat) {
        System.out.println("El llibre no s'ha prestat.");
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
    
    public String toString() {

        String llibrePrestar="";
        if(!prestat){
            llibrePrestar = "El llibre no està prestat";
        } else {
            llibrePrestar = "El llibre està prestat";
        }

        return "Títol: " + titol + ", Autor: " + autor + ", Prestat: " + llibrePrestar + ".";
    }
    
    }