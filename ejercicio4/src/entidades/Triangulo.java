package entidades;

public class Triangulo extends FiguraGeometrica{

    public Triangulo() {
    }

    @Override
    public void pedirDatos() {
        super.pedirDatos();
    }

    @Override
    public void calcularArea() {
        area = (base * altura)/2;

        System.out.println("El area del " + nombre + " es: " + area
        + '\n'+ "Altura: " + altura + "cm/ Base:" + base + "cm.");

    }
}
