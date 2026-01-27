import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DVD extends Material {
    private String director;
    private int duracion;

    public DVD(String codigo, String titulo, LocalDate fechaPrestamo, boolean prestado, String director, int duracion) {
        super(codigo, titulo, fechaPrestamo, prestado);
        this.director = director;
        this.duracion = duracion;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    double calcularMulta() {
        long diasTranscurridos = ChronoUnit.DAYS.between(getFechaPrestamo(), LocalDate.now());
        if (diasTranscurridos > 3) {
            long deudaTotal = diasTranscurridos - 3;
            return deudaTotal * 3000;
        }
        return 0;
    }

}