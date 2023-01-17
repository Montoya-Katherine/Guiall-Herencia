package entidades;

public abstract class Persona {
    protected String name;
    protected String apellido;
    protected int edad;

    public Persona() {
    }

    public Persona(String name, String apellido, int edad) {
        this.name = name;
        this.apellido = apellido;
        this.edad = edad;
    }

    public abstract void accion();

    public abstract void mostrarDatos();
}
