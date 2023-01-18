package entidades;

public class Perro extends Animal{
    public Perro() {
    }

    public Perro(String nombre, String comida, int edad, String razaAnimal) {
        super(nombre, comida, edad, razaAnimal);
    }

    @Override
    public void Alimentarse() {
        System.out.println("Se alimenta de " + comida);
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Perro =" + '\'' +
                "nombre:" + nombre + '\'' +
                ", comida:" + comida + '\'' +
                ", edad: " + edad +
                ", raza: " + razaAnimal );

    }
}
