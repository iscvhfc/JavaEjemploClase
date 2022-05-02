package com.vhfc.pro2;

import java.util.Scanner;

public class MainFactura {
    public static void main(String[] args) {
        Factura c=new Factura();
        Scanner sc = new Scanner(System.in);
        int res = 0;

        do {
            System.out.println("1; Compra de articulos_");
            System.out.println("2: Obtener factura_ ");
            System.out.println("3: salir_ ");
            System.out.print("Compra de 1artículos: ");
            res = sc.nextInt();
            switch(res) {
                case 1: {
                    System.out.print("Descripcion del articulo: ");
                    c.setDescripcion(sc.next());
                    System.out.print("Ingrese la cantidad de articulo: ");
                    c.setCant_comp(sc.nextInt());
                    System.out.print("ingerse el precio de articulo: ");
                    c.setPrecio(sc.nextDouble());
                    c.getArtPrecio();
                    break;
                }
                case 2: {
                    System.out.println("total factura: 2f"+c.getTotalFatura());
                    break;
                }
                case 3: {
                    System.out.println("....Gracias por su compra regrese... ");
                    break;
                }
                default:
                    System.out.println("continuar");
            }
        } while ( res != 3);
    }
}
