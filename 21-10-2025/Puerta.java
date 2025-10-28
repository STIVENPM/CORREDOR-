public class Puerta {
    public String material;
    public String color;
    public String tamaño;

    public Puerta(String material, String color, String tamaño) {
        this.material = material;
        this.color = color;
        this.tamaño = tamaño;
    }

    public Puerta() {
    }

    public void mostrar() {
        System.out.println("sirve para entrar o salir");
    }
}