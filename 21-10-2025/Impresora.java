

public class Impresora {
    public String marca;
    public String tipo;
    public String modelo;

    public Impresora(String marca, String tipo, String modelo) {
        this.marca = marca;
        this.tipo = tipo;
        this.modelo = modelo;
    }

    public Impresora() {
    }

    public void mostrar() {
        System.out.println("imprime documentos");
    }
}
