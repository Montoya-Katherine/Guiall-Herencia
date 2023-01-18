package entidades;

public class ProductoFresco extends Producto{
    private String tipo;

    public ProductoFresco() {
    }

    public ProductoFresco(String tipo) {
        this.tipo = tipo;
    }

    public ProductoFresco(int stock, String marca, int ventas, String tipo) {
        super(stock, marca, ventas);
        this.tipo = tipo;
    }

    @Override
    public void informacion() {
        System.out.println("   - Este Producto es Fresco -" + '\n' +
                " Marca= " + marca + '\n' +
                " Tipo= " + tipo + '\n' +
                " Stock= " + stock + '\n' +
                " Ventas= " + ventas );
    }


}
