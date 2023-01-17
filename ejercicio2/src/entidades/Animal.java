package entidades;

import java.util.Scanner;

public abstract class Animal {
    protected String animal;
    protected boolean peligro = false;
    protected int edad;

    protected char aux;

    public Animal() {
    }

    public Animal(String animal, boolean peligro, int edad) {
        this.animal = animal;
        this.peligro = peligro;
        this.edad = edad;
    }

    public void crearAnimal(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qué animal es?");
        animal = scanner.nextLine();

        System.out.println("Su edad?");
        edad = scanner.nextByte();

        System.out.println("Alimentacion: c = Carnivoro , h = Herbivoro ");
        aux = scanner.next().charAt(0);

        if (aux == 'c'){
            peligro = true;
            System.out.println("CUIDADO - ANIMAL PELIGROSO");
        } else if (aux == 'h') {
            System.out.println("Este animal no es peligroso");

        }


    }

    public abstract void tipoAnimal();

    public abstract void alimentacion();

    public abstract void imprimirDatos();

}
