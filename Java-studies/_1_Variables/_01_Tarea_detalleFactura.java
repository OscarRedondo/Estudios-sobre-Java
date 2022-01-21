package _1_Variables;

import java.util.Scanner;

public class _01_Tarea_detalleFactura{

    public static void main (String[] args){

        // Se requiere desarrollar un programa que reciba datos de la factura utilizando la clase Scanner
        // 10 minutos para finalizar

        /* La tarea consiste en crear una nueva clase con el método main llamada DetalleDeFactura, se requiere desarrollar un programa que reciba datos de la factura 
        utilizando la clase Scanner de la siguiente manera:

        .Reciba el nombre de la factura o descripción, utilizar método nextLine() para obtener el nombre de la factura con espacios.
        .Reciba 2 precios de productos de tipo double, utilizar método nextDouble() para obtener precios con decimales (,).
        .Calcule el total, sume ambos precios y agregue un valor de impuesto del 19%

        Se pide mostrar en un solo String el nombre de la factura, el monto total bruto (antes de impuesto), el impuesto y el monto total neto incluyendo impuesto.
        Por ejemplo, el resultado podría ser algo así:
            La factura producto de oficina tiene un total bruto de 134.78, con un impuesto de 25.6082 y el monto después de impuesto es de 160.3882. */

        try (Scanner entrada = new Scanner(System.in)) {

            System.out.print("Ingrese el nombre de la factura: ");
                String nombreFactura = entrada.nextLine();
            System.out.print("Ingrese el monto en bruto: ");
                Double totalBruto = entrada.nextDouble();
            System.out.print("Ingrese el total de impuestos: ");
                Double totalImpuestos = entrada.nextDouble();

            System.out.println("La factura " + nombreFactura 
                                + " tiene un total bruto de " + totalBruto 
                                + ", con un impuesto de " + totalImpuestos 
                                + ", y el monto despues de impuestos es de " + (totalBruto+totalImpuestos));

        }

    }

}