import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Revista extends Material {
    private int numeroEdicion;
    private String mesPublicacion;

    public Revista(String codigo, String titulo, LocalDate fechaPrestamo, boolean prestado, int numeroEdicion,
            String mesPublicacion) {
        super(codigo, titulo, fechaPrestamo, prestado);
        this.numeroEdicion = numeroEdicion;
        this.mesPublicacion = mesPublicacion;
    }

    public int getNumeroEdicion() {
        return numeroEdicion;
    }

    public void setNumeroEdicio(int numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }

    public String getMesPublicacion() {
        return mesPublicacion;
    }

    public void setMesPublicacion(String mesPublicacion) {
        this.mesPublicacion = mesPublicacion;
    }

    @Override
    double calcularMulta() {
        long diasTranscurridos = ChronoUnit.DAYS.between(getFechaPrestamo(), LocalDate.now());
        if (diasTranscurridos > 7) {
            long diasRetraso = diasTranscurridos - 7;
            return diasRetraso * 1000;
        }
        return 0;

    }
}