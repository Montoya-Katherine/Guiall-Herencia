import entidades.Alimento;
import entidades.NoPerecedero;
import entidades.Perecedero;

public class Main {
    public static void  main (String [] args){
        Alimento percedero = new Perecedero();
        percedero.pedirDatos();
        percedero.tipoAlimento();

        System.out.println(" ");

        Alimento noperecedero = new NoPerecedero("arroz", "tres arrollos", "bajo");
        noperecedero.tipoAlimento();
    }
}
