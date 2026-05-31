package org.example.ventas;

import org.example.menu.Menu;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Facturas {
    private final int idFactura;
    private int numeroToPay;
    private LocalDate fecha;
    private List<Producto> producto = new ArrayList<>();
    ;
    private static int contadorFacturas;

    Scanner sc = new Scanner(System.in);

    public Facturas() {
        this.idFactura = ++Facturas.contadorFacturas;
    }

    public void agregarproducto() {
        var opcion = 1;

        System.out.println("*** agregar producto ***");

        do {
            producto.add(Menu.menuProducto());
            System.out.println("desea agregar otro producto?");
            opcion = Integer.parseInt(sc.nextLine());

        } while (opcion == 1);
        System.out.print("digite numero de to pay:");
        numeroToPay = Integer.parseInt(sc.nextLine());
        DateTimeFormatter formato =
                DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Digite la fecha \"30/05/2026\"");
        fecha = LocalDate.parse(sc.nextLine(), formato);

    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < producto.size(); i++) {
            total += producto.get(i).getTotal();
        }
        return total;
    }

public void mostrarFactura (){
    System.out.println("*** Mostrar facturas ***");
    System.out.println("Id factura: " + idFactura);
    System.out.println("Numero to pay: " + numeroToPay);
    System.out.println("Fecha: " + fecha);
    System.out.println("Total de productos: " + calcularTotal());
    mostrarListaProductos();

}

    public void mostrarListaProductos() {
        System.out.println("*** Lista productos ***");

        for (int i = 0; i < producto.size(); i++) {
            System.out.println(producto.get(i).getReferencia() + " referencia");
            System.out.println(producto.get(i).getCantidad() + " valor");
            System.out.println(producto.get(i).getReferencia() + " cantidad");
            System.out.println("\n");
        }


    }

}

class Prueba {
    public static void main(String[] args) {
        Facturas factura = new Facturas();
        factura.agregarproducto();
        factura.mostrarFactura();

        Facturas factura2 = new Facturas();
        factura2.agregarproducto();
        factura2.mostrarFactura();

        Facturas factura3 = new Facturas();
        factura3.agregarproducto();
        factura3.mostrarFactura();

    }
}
