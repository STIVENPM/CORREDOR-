

public class Lampara {
    public String color;
    public String tamaño;
    public String peso;

    public Lampara(String color, String tamaño, String peso) {
        this.color = color;
        this.tamaño = tamaño;
        this.peso = peso;
    }

    public Lampara() {
    }

    public void mostrar() {
        System.out.println("ilumina espacios");
    }
}
