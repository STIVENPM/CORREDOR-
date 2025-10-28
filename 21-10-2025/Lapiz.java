
public class Lapiz {
    public String color;
    public String tipo;
    public String material;

    public Lapiz(String color, String tipo, String material) {
        this.color = color;
        this.tipo = tipo;
        this.material = material;
    }

    public Lapiz() {
    }

    public void mostrar() {
        System.out.println("sirve para escribir");
    }
}
