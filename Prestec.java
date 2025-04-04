import java.time.LocalDate;

public class Prestec {

    // // Propietats

    private Usuari usuari;
    private Llibre llibre;
    private LocalDate dataPrestec;
    private LocalDate dataRetorn;


    // // Constructors

    public Prestec(Usuari usuari, Llibre llibre, LocalDate dataPrestec) {
        this.usuari = usuari;
        this.llibre = llibre;
        this.dataPrestec = dataPrestec;

        // De normal hi ha dues setmanes en un préstec
        this.dataRetorn = dataPrestec.plusWeeks(2);
    }


    // // Mètodes

    // Mètode per retornar el llibre del préstec (amb posar una data de retorn, el llibre està retornat)
    public void retornarLlibre() {

        dataRetorn = LocalDate.now();
    }

    // // Getters i Setters

    public Usuari getUsuari() {
        return usuari;
    }

    public Llibre getLlibre() {
        return llibre;
    }

    public LocalDate getDataRetorn() {
        return dataRetorn;
    }
}
