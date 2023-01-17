package entidades;

public class Alumno extends Persona{
    private int anioAcademico;

    public Alumno() {
    }

    public Alumno(int anioAcademico) {
        this.anioAcademico = anioAcademico;
    }

    public Alumno(String name, String apellido, int edad, int anioAcademico) {
        super(name, apellido, edad);
        this.anioAcademico = anioAcademico;
    }

    @Override
    public void accion() {
        System.out.println("Alumno aprende");

    }

    @Override
    public void mostrarDatos() {
        System.out.println("El alumno es: " + name + " " + apellido +
                '\n' + "Edad: " + edad +
                '\n' + "Año academico: " + anioAcademico);

    }
}
