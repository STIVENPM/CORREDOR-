public class Escoba {
    public String color;
    public String material;
    public String tamaño;

    public Escoba(String color, String material, String tamaño) {
        this.color = color;
        this.material = material;
        this.tamaño = tamaño;
    }

    public Escoba() {
    }

    public void mostrar() {
        System.out.println("sirve para barrer");
    }
}