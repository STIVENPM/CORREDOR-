

public class Tomacorriente {
    public String color;
    public String tipo;
    public String capacidad;

    public Tomacorriente(String color, String tipo, String capacidad) {
        this.color = color;
        this.tipo = tipo;
        this.capacidad = capacidad;
    }

    public Tomacorriente() {
    }

    public void mostrar() {
        System.out.println("permite conectar aparatos eléctricos");
    }
}
