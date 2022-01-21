package _2_String;

import java.util.Scanner;

public class _02_Tarea_nombresFamiliares {

    public static void main (String[] args){

        // Se requiere desarrollar un programa que reciba los nombres de los integrantes de tu familia y formatearlos.
        // 10 minutos para finalizar

        /* La tarea consiste en crear una clase llamada ProgramaManejoDeNombres de la siguiente manera:
        Se requiere desarrollar un programa que reciba los nombres de 3 integrantes de tu familia o amigos como argumentos de línea de comandos.
        Se pide por cada nombre de la persona una nueva variable del tipo String al tomar el segundo carácter pero convertido en mayúscula y se le concatena un punto y los 
        dos últimos caracteres de la persona. Por ejemplo para Andres debe quedar como N.es
        Debe imprimir como resultado los tres nuevos nombres separado con guion bajo (como una única variable).
        Ejemplo, un resultado final esperado para los nombres Andres, Maria y Pepe podría ser:
        N.es_A.ia_E.pe */

         try (Scanner entrada = new Scanner(System.in)) {
            String[] nombresFamiliares = {"0", "1", "2"};

            // Ingreso y formato del nombre de tres familiares
            for(int i=0 ; i<3 ; i++){
                System.out.print("Ingrese el nombre de uno de sus familiares (" + (i+1) + "/3): ");
                nombresFamiliares[i] = entrada.nextLine().trim(); // Ingresa el valor y se asegura que no tiene espacios a los lados

                nombresFamiliares[i] = nombresFamiliares[i].substring(1, 2).toUpperCase()
                                        + "."
                                        + nombresFamiliares[i].substring(nombresFamiliares[i].length()-2).toLowerCase();
            }

            // Impresión de los nombres.
            for(int i=0 ; i<3 ; i++){
                System.out.print(nombresFamiliares[i]);
                if(i!=2){ // Separacion entre nombres
                    System.out.print("_");
                }

            }
        }

    }

}