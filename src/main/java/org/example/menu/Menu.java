package org.example.menu;

import org.example.ventas.Producto;

import java.util.Scanner;

public class Menu {
    int nuevoProducto = 0;

    public static Producto menuProducto() {
        Scanner sc = new Scanner(System.in);

        System.out.print("digite la referencia del producto: ");
        var referencia = Integer.parseInt(sc.nextLine());
        System.out.print("digite el valor del producto: ");
        var valor  = Double.parseDouble(sc.nextLine());
        System.out.print("digite la cantidad del producto: ");
        var cantidad = Integer.parseInt(sc.nextLine());

        Producto producto = new Producto(referencia, valor, cantidad);

        return producto;
    }
}
