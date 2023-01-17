package entidades;

public abstract class Alimento {
    protected String nombre;
    protected String marca;
    protected String rango;

    public Alimento() {
    }

    public Alimento(String nombre, String marca, String rango) {
        this.nombre = nombre;
        this.marca = marca;
        this.rango = rango;
    }

    public abstract void pedirDatos();

    public abstract  void tipoAlimento();
}
