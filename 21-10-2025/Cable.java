

public class Cable {
    public String tipo;
    public String longitud;
    public String color;

    public Cable(String tipo, String longitud, String color) {
        this.tipo = tipo;
        this.longitud = longitud;
        this.color = color;
    }

    public Cable() {
    }

    public void mostrar() {
        System.out.println("transmite energía o datos");
    }
}
