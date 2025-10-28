
public class Camisbuzo {
    public String marca;
    public String color;
    public String estilo;

    public Camisbuzo(String marca, String color, String estilo) {
        this.marca = marca;
        this.color = color;
        this.estilo = estilo;
    }

    public Camisbuzo() {
    }

    public void mostrar() {
        System.out.println("abriga y cubre el torso");
    }
}
