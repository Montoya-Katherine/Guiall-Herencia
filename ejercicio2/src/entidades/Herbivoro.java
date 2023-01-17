package entidades;

public class Herbivoro extends Animal{
    public Herbivoro() {
    }

    public Herbivoro(String animal, boolean peligro, int edad) {
        super(animal, peligro, edad);
    }

    @Override
    public void crearAnimal() {
        super.crearAnimal();
    }

    @Override
    public void tipoAnimal() {
        System.out.println("Animal Herbivoro");

    }

    @Override
    public void alimentacion() {
        System.out.println("Animal que come plantas");
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Animal es: " + animal + '\n' +
                "EDAD: " + edad + '\n' +
                "Peligroso: " + peligro);
    }
}
