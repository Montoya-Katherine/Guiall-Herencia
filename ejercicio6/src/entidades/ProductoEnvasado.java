package entidades;

public class ProductoEnvasado extends Producto{
    protected String clase;


    public ProductoEnvasado() {
    }

    public ProductoEnvasado(int stock, String marca, int ventas, String clase) {
        super(stock, marca, ventas);
        this.clase = clase;
    }

    @Override
    public void informacion() {
        System.out.println("   - Este Producto es Envasado -" + '\n' +
                " Marca= " + marca + '\n' +
                " Clase= " + clase + '\n' +
                " Stock= " + stock + '\n' +
                " Ventas= " + ventas );
    }
}
