import entidades.Circulo;
import entidades.FiguraGeometrica;
import entidades.Rectangulo;
import entidades.Triangulo;

public class Main {
    public  static  void main (String [] args){
      /* FiguraGeometrica triangilo = new Triangulo();
       triangilo.pedirDatos();
       triangilo.calcularArea();

     FiguraGeometrica rectangulo = new Rectangulo();
       rectangulo.pedirDatos();
       rectangulo.calcularArea();*/

        FiguraGeometrica circulo = new Circulo();
        circulo.pedirDatos();
        circulo.calcularArea();



    }
}
