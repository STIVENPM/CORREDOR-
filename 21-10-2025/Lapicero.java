
public class Lapicero {
    public String color;
    public String marca;
    public String tipo;

    public Lapicero(String color, String marca, String tipo) {
        this.color = color;
        this.marca = marca;
        this.tipo = tipo;
    }

    public Lapicero() {
    }

    public void mostrar() {
        System.out.println("sirve para escribir con tinta");
    }
}
