
public class Silla {
    public String color;
    public String material;
    public String tipo;

    public Silla(String color, String material, String tipo) {
        this.color = color;
        this.material = material;
        this.tipo = tipo;
    }

    public Silla() {
    }

    public void mostrar() {
        System.out.println("sirve para sentarse");
    }
}
