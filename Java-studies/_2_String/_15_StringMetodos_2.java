package _2_String;

public class _15_StringMetodos_2 {

    public static void main (String[] args){

        // En esta sección de metodos, vamos a ver metodos utiles para convertir un String en un Arreglo
        
        String trabalenguas = "trabalenguas";

        // toCharArray()
        // Convierte el String en una Array cuyos valores es cada uno de los caracteres que lo conforman
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        char[] arreglo_toCharArray = trabalenguas.toCharArray(); // Almacenamos el valor devuelto en una variable para usarlo más adelante
        int largo_toCharArray = arreglo_toCharArray.length; // *Hay que notar que este length no lleva los parentesis

        for(int i=0; i<largo_toCharArray ; i++){ // Recorremos cada uno de los valores dentro del array
            System.out.println("arreglo = " + arreglo_toCharArray[i]); // Imprimimos el valor del indice actual
                                                            // Si usaramos un  print en lugar de un println, el texto aparecería todo junto y no separado por lineas
        }

        // Split(String)
        // Lo que hace este metodo es hacer un arreglo a partir del String, separando los valores por el parametro otorgado
        System.out.println("trabalenguas.split = " + trabalenguas.split("a")); // Va a separar los valores usando la "a" como separador

        String[] arreglo_split = trabalenguas.split("a");
        int largo_split = arreglo_split.length;

        System.out.print("arreglo = ");
        for(int i=0; i<largo_split ; i++){
            System.out.print(arreglo_split[i]);
        }

        System.out.println("");
        
        /* ======================================================================================= */

        String archivo = "alguna.imagen.pdf";

        String[] archivoArr = archivo.split("\\."); // Si dejamos el punto a secas, esto no va a funcionar.
                                                    // Esto se debe a que es un caracter especial, propio de expresiones regulares.
                                                    // Las expresiones regulares son todo un tema aparte, que ahora solo usaremos este detalle.
                                                    // Podemos escapar de esa expresión regular usando un doble BackSlash antes del punto, especificando que se trata del caracter publico.
                                                    // Tambien se puede encerrar entre corchetes con el mismo proposito: "[.]"
        int largo_archivoArr = archivoArr.length;

        for(int i=0; i<largo_archivoArr ;i++){
            System.out.println(archivoArr[i]);
        }

        System.out.println("extension = " + archivoArr[largo_archivoArr-1]);

    }

}