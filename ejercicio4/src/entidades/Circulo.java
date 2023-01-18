package entidades;

import java.util.Scanner;

public class Circulo extends FiguraGeometrica{
    private final double pi = 3.14;
    private double radio;
    @Override
    public void pedirDatos() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese nombre de la figura geometrica: ");
        nombre = scanner.nextLine();

        System.out.println("Ingrese el valor del radio:");
        radio = scanner.nextDouble();
    }

    @Override
    public void calcularArea() {
        area = pi * radio;
        System.out.println("El area del " + nombre + " es: " + area
                + '\n'+ "Valor del radio " + radio + "cm");

    }
}
