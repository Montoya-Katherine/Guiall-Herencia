package entidades;

public class Gato extends Animal{
    public Gato() {
    }

    public Gato(String nombre, String comida,
                int edad, String razaAnimal) {
        super(nombre, comida, edad, razaAnimal);
    }

    @Override
    public void Alimentarse() {
        System.out.println("Se alimenta con "+ comida);
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Gato =" + '\'' +
                "nombre:" + nombre + '\'' +
                ", comida:" + comida + '\'' +
                ", edad: " + edad +
                ", raza: " + razaAnimal );


    }
}
