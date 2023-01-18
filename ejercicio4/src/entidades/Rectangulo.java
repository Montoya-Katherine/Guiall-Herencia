package entidades;

public class Rectangulo extends FiguraGeometrica{
    public Rectangulo() {
    }

    @Override
    public void pedirDatos() {
        super.pedirDatos();
    }

    @Override
    public void calcularArea() {
        area = base * altura;
        System.out.println("El area del " + nombre + " es: " + area
                + '\n'+ "Altura: " + altura + "cm/ Base:" + base + "cm.");


    }
}
