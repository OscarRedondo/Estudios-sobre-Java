package _1_Variables;
public class _05_StringYPrimitivos{
    public static void main(String[] args){
        /* En esta clase vamos a convertir valores primitivos a String y visceversa.
            La idea es conocer y jugar con los diferentes métodos que se nos ofrecen para llevar a cabo esta tarea. */
        
        String numeroStr = "10";        
        int numeroInt = Integer.parseInt(numeroStr);

        String realStr = "45.96e-3";
        double realDouble = Double.parseDouble(realStr);

        String logicoStr = "true";
        String intentoLogicoStr = "1";
        boolean logicoBool = Boolean.parseBoolean(logicoStr);
        boolean intentoLogicoBool = Boolean.parseBoolean(intentoLogicoStr);
            /* Notese que a pesar de que el valor "1" equivale a "true", en este caso no es posible hacer ese cambio de valor.
                
                No importa si el texto de "logicoStr" posee mayúsculas o mínisculas en alguna parte, el cambio de tipo de valor se efectuará correctamente.
                Si oprimes la tecla "Ctrl" de tu teclado y luego pones el mouse encima del método "parseBolean*, verás que este método resalta del resto del código.
                    Si das click sobre el método se abríra el código que lo contiene y podrás leerlo.
                    Allí verás que el método hace uso de otro método conocido como "equalIsIgnoreCase". Este se encarga de ignorar toda diferencia entre mayúsculas y minusculas.
                    Más adelante veremos más sobre este tipo de métodos y sus diferencias con los operadores de comparación, de los que también hablaremos más adelante.
                    De momento vale que tengas en cuenta que si usas los operadores en realidad estarias comparando un valor con la instancia del objeto y no con el valor que 
                    contiene, es por eso que se hace uso de estos otros tipos de métodos.
                    
                    Los operadores de comparación deben usarse nada más que con primitivos. */

        System.out.println(numeroStr);
        System.out.println(numeroInt);
        System.out.println(realStr);
        System.out.println(realDouble);
        System.out.println(logicoStr);
        System.out.println(intentoLogicoStr);
        System.out.println(logicoBool);
        System.out.println(intentoLogicoBool);        
//----------------------------------------------------------------------------------------------------------------------

        var dinamicoNumeroStr = "10";        
        var dinamicoNumeroInt = Integer.parseInt(dinamicoNumeroStr);

        var dinamicoRealStr = "45.96e-3";
        var dinamicoRealDouble = Double.parseDouble(dinamicoRealStr);

        var dinamicoLogicoStr = "true";
        var dinamicoIntentoLogicoStr = "1";
        var dinamicoLogicoBool = Boolean.parseBoolean(dinamicoLogicoStr);
        var dinamicoIntentoLogicoBool = Boolean.parseBoolean(dinamicoIntentoLogicoStr);

            /* En estas líneas de código podemos ver que se hace uso del tipo de variable dinamica, var.
                
                Este tipo de variable fue agregada desde la versión 10 de Java, y en ella lo que define el tipo de variable que se almacena es la literal.  */

        System.out.println("\n" + dinamicoNumeroStr);
        System.out.println(dinamicoNumeroInt);
        System.out.println(dinamicoRealStr);
        System.out.println(dinamicoRealDouble);
        System.out.println(dinamicoLogicoStr);
        System.out.println(dinamicoIntentoLogicoStr);
        System.out.println(dinamicoLogicoBool);
        System.out.println(dinamicoIntentoLogicoBool + "\n");
//----------------------------------------------------------------------------------------------------------------------
        /* En los códigos anteriores nos centramos en convertir variables de tipo String a variables primitivas.
            A continuación, haremos lo opuesto. Nos concentraremos en convertir variables primitivas a variables tipo String.
            Fijese como el método que usamos en esta sección, "toString", es distinto a los utilizados en las anteriores, "parseInt" por ejemplo.
            
            Vale mencionar de una vez que en ambas transformaciones debemos usar la clase Wrapper de la variable para poder ejecutarla con exito.
            Aunque vamos a mostrar una excepción que no requiere de la clase Wrapper. */

        int otroNumeroInt = 100;
        String otroNumeroStr = Integer.toString(otroNumeroInt);

        System.out.println(otroNumeroInt);
        System.out.println(otroNumeroStr + "\n");

        otroNumeroStr = String.valueOf(otroNumeroInt + 10);
            /* ** FIJEMONOS EN ESTA L�?NEA QUE NO USA LA CLASE WRAPPER. EN SU LUGAR, USAR UN MÉTODO DE LA CLASE STRING.
                    CON ESTE MÉTODO EN ESPECIFICO DEBEMOS TENER CUIDADO, PORQUE ACEPTA M�?S DE UN TIPO DE ARGUMENTO.
                    SI NOS EQUIVOCAMOS CON EL TIPO DE ARGUMENTO QUE ENVIAMOS PODEMOS TENER RESULTADOS INESPERADOS. ** */

        System.out.println(otroNumeroStr);
            /* En este ejemplo vemos una transformación exitosa.
                La variable "otroNumeroStr" sumada por 10 ha sido correctamente transformada a un texto. */
        
        otroNumeroStr = String.valueOf(otroNumeroStr + 10); // Variable equivocada
        System.out.println(otroNumeroStr + "\n");
            /* Sin embargo, vemos que en este otro ejemplo pasamos una variable erronea.
                Pasamos un tipo String en lugar de un tipo int, por lo que el operador de suma en este caso toma el rol de operador de concatenación.
                Vemos como a pesar de que se imprimen los valores, estos no se han sumado sino que se han unido. */

        /* Podemos seguir usando lo que ya vimos en esta clase para mostrarte como se transforman el resto de tipos variables usadas, pero dejaremos que lo explores y juegues 
            con ello por tu cuenta. */
    }
}