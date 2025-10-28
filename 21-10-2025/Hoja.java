
public class Hoja {
    public String color;
    public String tamaño;
    public String tipo;

    public Hoja(String color, String tamaño, String tipo) {
        this.color = color;
        this.tamaño = tamaño;
        this.tipo = tipo;
    }

    public Hoja() {
    }

    public void mostrar() {
        System.out.println("sirve para escribir o imprimir");
    }
}
