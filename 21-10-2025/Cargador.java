
public class Cargador {
    public String tipo;
    public String color;
    public String voltaje;

    public Cargador(String tipo, String color, String voltaje) {
        this.tipo = tipo;
        this.color = color;
        this.voltaje = voltaje;
    }

    public Cargador() {
    }

    public void mostrar() {
        System.out.println("recarga energía de dispositivos");
    }
}
