public class Televisor {
    public String marca;
    public String tamaño;
    public String resolucion;

    public Televisor(String marca, String tamaño, String resolucion) {
        this.marca = marca;
        this.tamaño = tamaño;
        this.resolucion = resolucion;
    }

    public Televisor() {
    }

    public void mostrar() {
        System.out.println("muestra contenido audiovisual");
    }
}