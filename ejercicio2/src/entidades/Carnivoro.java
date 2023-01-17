package entidades;

public class Carnivoro extends Animal {
    public Carnivoro() {
    }

    public Carnivoro(String animal, boolean peligro,int edad) {
        super(animal, peligro, edad);
    }

    @Override
    public void crearAnimal() {
        super.crearAnimal();
    }

    @Override
    public void tipoAnimal() {
        System.out.println("Animal Carnivoro");

    }

    @Override
    public void alimentacion() {
        System.out.println("Se alimenta de de otros animales.");

    }

    @Override
    public void imprimirDatos() {
        System.out.println("Animal es: " + animal + '\n' +
                "EDAD: " + edad + '\n' +
                "Peligroso: " + peligro);

    }
}
