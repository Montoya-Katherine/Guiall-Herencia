package entidades;

public class Caballo extends Animal{
    public Caballo() {
    }

    public Caballo(String nombre, String comida,
                   int edad, String razaAnimal) {
        super(nombre, comida, edad, razaAnimal);
    }

    @Override
    public void Alimentarse() {
        System.out.println("Se alimenta de " + comida );
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Caballo=" + '\'' +
                "nombre:" + nombre + '\'' +
                ", comida:" + comida + '\'' +
                ", edad: " + edad +
                ", raza: " + razaAnimal );


    }
}
