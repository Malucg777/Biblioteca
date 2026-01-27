import java.util.ArrayList;

public class Biblioteca {
    private String material;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    ArrayList<Material> Materiales = new ArrayList<>();

    public void agregarMaterial(Material material) {
        Materiales.add(material);
    }

    public void prestarMaterial(String codigo) {
        for (Material material : Materiales) {
            if (material.getCodigo().equals(codigo)) {
                if (!material.getPrestado()) {
                    material.prestar(true);
                    System.out.println("Material prestao exitosamente chaval.");
                    return;
                }
            } else {
                System.out.println("Chaval has llegado tarde, para la proxima tal vez!!");
                return;
            }
        }
        System.out.println("Chaval no se que buscas no encuentro nada de lo decis... Intenta con otro codigo");
    }

    public void devolverMaterial(String codigo) {
        for (Material material : Materiales) {
            if (material.getCodigo().equals(codigo)) {
                if (material.getPrestado()) {
                    material.devolver();
                    double multa = material.calcularMulta();
                    if (multa > 0) {
                        System.out.println("Chaval has devulto el material con una multda de: " + multa);
                        return;
                    } else {
                        System.out.println("Material devuelto sin multa, gracias chaval!");
                        return;
                    }
                }
            }
        }
        return;
    }

    public void buscarMaterialPorCodigo(String codigo) {
        for (Material material : Materiales) {
            if (material.getCodigo().equals(codigo)) {
                System.out.println("Material encontrado: " + material.getTitulo());
                return;
            }
        }
        System.out.println("No se ha encontrado ningun material con ese codigo chaval");
        return;
    }

    public void listarMaterialesDisponibles() {
        for (Material material : Materiales) {
            if (!material.getPrestado()) {
                System.out.println("Material disponible: " + material.getTitulo());
            }
        }
        return;
    }

    public void listarMaterialesPrestados() {
        for (Material material : Materiales) {
            if (material.getPrestado()) {
                System.out.println("Material prestado: " + material.getTitulo());
            }
        }
        return;
    }

}
