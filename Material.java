import java.time.LocalDate;

abstract class Material {
    private String codigo;
    private String titulo;
    private LocalDate fechaPrestamo;
    private boolean prestado;

    public Material(String codigo, String titulo, LocalDate fechaPrestamo, boolean prestado) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.fechaPrestamo = fechaPrestamo;
        this.prestado = prestado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public boolean getPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public void prestar(boolean prestado) {
        if (prestado == true) {
            this.prestado = true;
            System.out.println("Libro en estado de prestamo");
        } else {
            prestado = false;
            System.out.println("Libro disponible");
        }
    }

    public void devolver() {
        if (getPrestado()) {
            setPrestado(false);
            System.out.println("Libro debe ser devuelto. Ahora esta libre");
        } else {
            System.out.println("El libro se encuentra prestado debe ser devuelto");
        }
    }

    abstract double calcularMulta();
}
