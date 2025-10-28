
public class Audifonos {
    public String marca;
    public String tipo;
    public String color;

    public Audifonos(String marca, String tipo, String color) {
        this.marca = marca;
        this.tipo = tipo;
        this.color = color;
    }

    public Audifonos() {
    }

    public void mostrar() {
        System.out.println("sirven para escuchar sonido");
    }
}
