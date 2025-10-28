

public class Ventana {
    public String material;
    public String tamaño;
    public String color;

    public Ventana(String material, String tamaño, String color) {
        this.material = material;
        this.tamaño = tamaño;
        this.color = color;
    }

    public Ventana() {
    }

    public void mostrar() {
        System.out.println("permite entrada de luz");
    }
}
