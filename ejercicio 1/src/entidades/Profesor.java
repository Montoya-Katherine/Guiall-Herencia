package entidades;

public class Profesor extends Persona{
    private String materia;

    public Profesor(){

    }

    public Profesor(String materia) {
        this.materia = materia;
    }

    public Profesor(String name, String apellido, int edad, String materia) {
        super(name, apellido, edad);
        this.materia = materia;
    }

    @Override
    public void accion() {
        System.out.println("El enseña programación");

    }

    @Override
    public void mostrarDatos() {
        System.out.println("El profesor es: " + name + apellido +
                '\n' + "Edad: " + edad +
                '\n' + "Materia: " + materia );

    }
}
