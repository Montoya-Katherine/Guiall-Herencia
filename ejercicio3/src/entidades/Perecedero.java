package entidades;

import java.util.Scanner;

public class Perecedero  extends Alimento{
    private String tipo;

    public Perecedero() {
    }

    public Perecedero(String tipo) {
        this.tipo = tipo;
    }

    public Perecedero(String nombre, String marca, String rango, String tipo) {
        super(nombre, marca, rango);
        this.tipo = tipo;
    }

    @Override
    public void pedirDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nombre del alimento: ");
        nombre = scanner.nextLine();

        System.out.println("Tipo de percedero (lacteos , carnes , vegetales) :");
        tipo = scanner.nextLine();

        System.out.println("Marca: ");
        marca = scanner.nextLine();

        System.out.println("Rango de precio (BAJO, ACCESIBLE, ALTO) :");
        rango = scanner.nextLine();


    }

    @Override
    public void tipoAlimento() {
        System.out.println("Alimento = " + nombre + '\n' +
                "Tipo: " + tipo + '\n' +
                "Marca: " + marca + '\n' +
                "Rango Precio: " + rango);
        System.out.println("- ESTE ES UN ALIMENTO PERECEDERO -");

    }
}
