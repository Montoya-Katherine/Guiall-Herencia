import entidades.Producto;
import entidades.ProductoEnvasado;
import entidades.ProductoFresco;

public class Main {
    public static void main ( String[] args){
        Producto producto1 = new ProductoEnvasado(200,"Natura",99, "Aceite");
        producto1.informacion();
        System.out.println("");
        Producto producto2 = new ProductoFresco(148,"Paulina",22,"Pastas");
        producto2.informacion();
    }
}
