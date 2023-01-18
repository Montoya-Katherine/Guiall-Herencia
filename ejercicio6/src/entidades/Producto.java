package entidades;

public abstract class Producto {
    protected int stock;
    protected String marca;
    protected int ventas;

    public Producto() {
    }

    public Producto(int stock, String marca, int ventas) {
        this.stock = stock;
        this.marca = marca;
        this.ventas = ventas;
    }

    public abstract void informacion();
}
