public class Camisa {
    public String marca;
    public String color;
    public String talla;

    public Camisa(String marca, String color, String talla) {
        this.marca = marca;
        this.color = color;
        this.talla = talla;
    }

    public Camisa() {
    }

    public void mostrar() {
        System.out.println("prenda para la parte superior del cuerpo");
    }
}