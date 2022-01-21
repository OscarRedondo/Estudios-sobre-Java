package _2_String;

public class _14_ObtenerExtensionArchivo {

    public static void main (String[] args){

        // En este codigo se muestra como obtener la extensión de un archivo de forma dinamica, 
        // como pdf, png, jpg, etc.

        String archivo = "algun_archivo.docx";

        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring(archivo.length()-4) = " + archivo.substring(archivo.length()-4));

        // El ejemplo anterior funciona cuando el formato está conformado por cuatro letras, pero no si esa cantidad cambia. No es dinamico.{

        int i = archivo.lastIndexOf(".") + 1; // Creamos una variable que almacene la ubicación exacta de la separación entre el nombre y el formato del archivoi
                                            // Queremos saber donde esta el último punto, pues es el que separa nombre y formato
                                            // Sumamos uno al valor porque queremos el formato sin el punto.

        System.out.println("archivo.substring(i) = " + archivo.substring(i));        

    }

}