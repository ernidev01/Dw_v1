package org.example.ventas;

public class Producto {
    private final int id;
    private static int contador;
    private int referencia;
    private double precio;
    private int cantidad;
    private final double total;

    public Producto(int referencia, double precio, int cantidad) {
        this.id = ++Producto.contador;
        this.referencia = referencia;
        this.precio = precio;
        this.cantidad = cantidad;
        this.total = precio * cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Producto.contador = contador;
    }

    public int getReferencia() {
        return referencia;
    }

    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", referencia=" + referencia +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                ", total=" + total +
                '}';
    }
}
