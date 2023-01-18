package entidades;

public abstract class Animal {
    protected String nombre;
    protected String comida;
    protected int edad;
    protected  String razaAnimal;

    public Animal() {
    }

    public Animal(String nombre,
                  String comida, int edad, String razaAnimal) {
        this.nombre = nombre;
        this.comida = comida;
        this.edad = edad;
        this.razaAnimal = razaAnimal;
    }

    public abstract void Alimentarse();
    public abstract void mostrarDatos();

}
