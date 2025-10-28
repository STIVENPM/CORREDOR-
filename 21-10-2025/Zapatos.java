public class Zapatos {
    public String marca;
    public String talla;
    public String color;

    public Zapatos(String marca, String talla, String color) {
        this.marca = marca;
        this.talla = talla;
        this.color = color;
    }

    public Zapatos() {
    }

    public void mostrar() {
        System.out.println("protegen los pies");
    }
}