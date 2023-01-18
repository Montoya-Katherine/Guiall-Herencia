package entidades;

import java.util.Scanner;

public abstract class FiguraGeometrica {
    protected String nombre;
    protected double base;
    protected double altura;

    protected double area;

    public void pedirDatos(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese nombre de la figura geometrica: ");
        nombre = scanner.nextLine();

        System.out.println("Ingrese la medida de la base : ");
        base = scanner.nextDouble();

        System.out.println("Ingrese la altura: ");
        altura = scanner.nextDouble();
    }

    public abstract void calcularArea();
}
