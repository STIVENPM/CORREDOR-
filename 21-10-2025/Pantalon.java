public class Pantalon {
    public String tipo;
    public String color;
    public String talla;

    public Pantalon(String tipo, String color, String talla) {
        this.tipo = tipo;
        this.color = color;
        this.talla = talla;
    }

    public Pantalon() {
    }

    public void mostrar() {
        System.out.println("prenda para cubrir las piernas");
    }
}