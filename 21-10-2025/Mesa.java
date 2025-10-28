

public class Mesa {
    public String color;
    public String forma;
    public String material;

    public Mesa(String color, String forma, String material) {
        this.color = color;
        this.forma = forma;
        this.material = material;
    }

    public Mesa() {
    }

    public void mostrar() {
        System.out.println("sirve para apoyar objetos");
    }
}
