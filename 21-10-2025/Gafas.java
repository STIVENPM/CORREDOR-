
public class Gafas {
    public String marca;
    public String color;
    public String tipo;

    public Gafas(String marca, String color, String tipo) {
        this.marca = marca;
        this.color = color;
        this.tipo = tipo;
    }

    public Gafas() {
    }

    public void mostrar() {
        System.out.println("protegen o corrigen la visión");
    }
}
