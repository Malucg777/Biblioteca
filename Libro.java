import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Libro extends Material {
    private String autor;
    private int numPaginas;

    public Libro(String codigo, String titulo, LocalDate fechaPrestamo, boolean prestado, String autor,
            int numPaginas) {
        super(codigo, titulo, fechaPrestamo, prestado);
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    double calcularMulta() {
        long diasTranscurridos = ChronoUnit.DAYS.between(getFechaPrestamo(), LocalDate.now());
        if (diasTranscurridos > 15) {
            long diasRetraso = diasTranscurridos - 15;
            return diasRetraso * 2000;
        }
    return 0;    
    }
}
