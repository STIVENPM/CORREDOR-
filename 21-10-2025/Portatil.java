
public class Portatil {
    public String marca;
    public String tamaño;
    public String procesador;

    public Portatil(String marca, String tamaño, String procesador) {
        this.marca = marca;
        this.tamaño = tamaño;
        this.procesador = procesador;
    }

    public Portatil() {
    }

    public void mostrar() {
        System.out.println("dispositivo portátil para trabajar");
    }
}
