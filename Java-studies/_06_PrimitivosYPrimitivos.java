public class _06_PrimitivosYPrimitivos {
    public static void main(String[] args) {
        /* En la anterior clase vimos como pasar el tipo de una variable desde los primitivos hacia los String, y visceversa.
            En esta pequeña clase ahora mostraremos como transformar una variable primitiva en otro tipo de variable primitiva. */

        int numeroInt = 10000;
        short numeroShort = (short)numeroInt; // "(short)" es el cast. Esto forza la conversión del tipo de la variable.
        long numeroLong = numeroInt;
            /* Aquí vemos un intento de convertir una variable de tipo int a una variable de tipo short.
                Recordemos que ambas variables tienen sus limites, y en este caso el valor de "numeroInt" sobrepasa los limites de "numeroShort".
                Esto se nos marca como un error, pero más sin embargo lo podemos forzar con el cast y el programa funcionará.                
                Tengamos en cuenta que en estos casos, obviamente, la conversión no podrá realizarse completa y tendremos una perdida de información en la conversión.

                En el ejemplo expuesto, donde "numeroInt" equivale a "10000", la conversión sucede con éxito; pero solo porque el valor en sí no sobrepasa los límites de short.
                
                Podemos apreciar que si hacemos la conversión a long no nos hace falta el cast.
                Esto debido a que el valor de int cabe dentro de los limites de long, por lo que no hay que forzar nada. */
            
        System.out.println("\nLa variable \"numeroInt\" equivale a: " + numeroInt);
        System.out.println("La variable \"numeroShort\" equivale a: " + numeroShort);
        System.out.println("La variable \"numeroLong\" equivale a: " + numeroLong);
//----------------------------------------------------------------------------------------------------------------------
        int otroInt = 32768;
        short otroShort = (short)otroInt;
            /* Fijemonos ahora en este ejemplo en donde el int que buscamos convertir a short sobrepasa ahora sí los limites de ese tipo de variable. */

        System.out.println("La variable \"otroInt\" equivale a: " + otroInt);
        System.out.println("La variable \"otroShort\" equivale a: " + otroShort + "\n");
//----------------------------------------------------------------------------------------------------------------------
        int otroMasInt = 42768;
        short otroMasShort = (short)otroMasInt;
            /* Fijese ahora en la ambiguedad que da este otro ejemplo, con un número más grande. */        
        
        System.out.println("La variable \"otroMasInt\" equivale a: " + otroMasInt);
        System.out.println("La variable \"otroMasShort\" equivale a: " + otroMasShort + "\n");
//----------------------------------------------------------------------------------------------------------------------
        int numeroAChar = (char)numeroInt;
            /* También podemos forzar la conversión de un valor número a un tipo char.
                Pero recordemos que los valores tipo char también pueden recibir valores numéricos e identificarlos con un símbolo unicode, y eso es lo que va a suceder.
                No vamos a obtener el número. */
        
        System.out.println("La variable \"numeroAChar\" equivale a: " + numeroAChar + "\n");
//----------------------------------------------------------------------------------------------------------------------
        float numeroFloat = (float)numeroInt;
        float otroNumeroFloat = (float)otroInt;
        float otroMasNumeroFloat = (float)otroMasInt;
            /* Notese que el cambio de float a int también es posible.
            De esta forma, el valor suministrado adquiere un decimal igual a 0. */

        System.out.println("La variable \"numeroFloat\" equivale a: " + numeroFloat);
        System.out.println("La variable \"otroNumeroFloat\" equivale a: " + otroNumeroFloat);
        System.out.println("La variable \"otroMasNumeroFloat\" equivale a: " + otroMasNumeroFloat + "\n");
//----------------------------------------------------------------------------------------------------------------------
        /* Ningún valor númerico puede ser convertido a un valor booleano, aunque sea un "1"o un "0". */
    }    
}
