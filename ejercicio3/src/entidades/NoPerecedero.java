package entidades;

import java.util.Scanner;

public class NoPerecedero extends Alimento{
    public NoPerecedero() {
    }

    public NoPerecedero(String nombre, String marca, String rango) {
        super(nombre, marca, rango);
    }

    @Override
    public void pedirDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nombre del alimento: ");
        nombre = scanner.nextLine();

        System.out.println("Marca: ");
        marca = scanner.nextLine();

        System.out.println("Rango de precio (BAJO, ACCESIBLE, ALTO) :");
        rango = scanner.nextLine();

    }

    @Override
    public void tipoAlimento() {
        System.out.println("Alimento = " + nombre + '\n' +
                "Marca: " + marca + '\n' +
                "Rango Precio: " + rango);
        System.out.println("- ESTE ES UN ALIMENTO NO PERECEDERO -");


    }
}
