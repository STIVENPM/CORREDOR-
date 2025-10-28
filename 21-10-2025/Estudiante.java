
public class Estudiante {
    public String nombre;
    public String edad;
    public String curso;

    public Estudiante(String nombre, String edad, String curso) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
    }

    public Estudiante() {
    }

    public void mostrar() {
        System.out.println("persona que estudia");
    }
}
