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
    }

    public void buscarMaterialPorCodigo(String codigo) {
    }

    public void listarMaterialesDisponibles() {
    }

    public void listarMaterialesPrestados() {
    }

}
