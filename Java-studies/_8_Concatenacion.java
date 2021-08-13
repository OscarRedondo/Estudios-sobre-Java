public class _8_Concatenacion {
    public static void main(String[] args){
        /* Ya hemos hablado bastante sobre los operadores, y es un tema que tocaremos más a profundidad muy pronto.
            Lo que nos incumbe sobre el tema ahora mismo es el operador de "concatenación", "+".
            Fijese como es el mismo operador de "suma", pero usandose en un contexto fuera del numérico. */

        String uno = "parte uno";
        String dos = "parte dos";
        String concatenacion = "Esta variable concatena la " + uno + " y la " + dos;

        System.out.println(concatenacion);

        /* Hasta acá,la concatenación funciona como se esperaría.
            ¿Pero qué pasaría si los valores enviados a imprimir no son de tipo String sino int? */

        int numeroUno = 10;
        int numeroDos = 35;

        System.out.println(numeroUno + numeroDos);

        /* Vemos que, efectivamente, los dos valores son sumados ya que son números.
            Pero esto no sucede en el siguiente caso: */         

        System.out.println("Lo siguiente NO es una suma: " + numeroUno + numeroDos);

        /* Lo que pasa aquí es que la instrucción detecta el argumento con mayor prioridad , siendo en este caso y por defecto el primero de izquierda a derecha.
            Al encontrarse con un valor de tipo cadena de texto lo que hace imprimir ese valor y el resto como si de cadenas de texto se tratase.
            En este caso, lo números son transformados a String antes de que se efectue la formula. */
        
        System.out.println("Lo siguiente SÍ es una suma: " + (numeroUno + numeroDos));

        /* Una forma de cambiar ese comportamiento es aumentando la prioridad de la operación numérica.
            Al usar los paréntesis le decimos al programa que ese argumento, en este caso una suma numérica, es el que tiene mayor prioridad.            
            Siendo así, la suma se efecutará antes de la impresión y se imprimirá junto al texto sin problemas. */

        System.out.println(numeroUno + numeroDos + " es el resultado entre " + numeroUno + " y " + numeroDos + ", pero " + numeroUno + numeroDos + " no lo es.");

        /* Como se decía anteriormente, la prioridad por defecto es el primer elemento de la izquierda.
            Aquí vemos que al poner la suma de primeras, antes que el texto, esta se ejecuta normalmente.
            Sin embargo, la suma colocada después del primer valor recibido de tipo cadena de texto no logra ser llevada a cabo y en su lugar sus valores se concatenan. */

        System.out.println(numeroUno + numeroDos + " es el resultado entre " + numeroUno + " y " + numeroDos + ", y " + (numeroUno + numeroDos) + " también lo es.");
        System.out.println(" al igual que " + (numeroUno + numeroDos) + " y " + (numeroUno + numeroDos) + " también lo son.");

        /* Aquí podemos ver un poco de experimentación con el tema de usar los paréntesis para aumentar la prioridad de los argumentos. */

//----------------------------------------------------------------------------------------------------------------------

        /* La clase String también posee otra forma para concatenar los datos.
            Un método llamado "concat", que recibe como argumento otro String para concatenarlo al String que lo llama.
            Hay que recalcar una vez más que los String no son mutables, son inmutables. Por lo que este método no modífica el valor actual del argumento sino devuelve uno distinto. */

        String nombre = "Luxanna";
        String apellido = "Crownguard";

        System.out.print("Método concat: ");
        System.out.println(nombre.concat(apellido));

        /* Vemos que el método puede concatenar sin problemas anmbos String.
            Sin embargo, estos no poseen separación alguna.
            El método concat, acepta dentro de él concatenaciones, por lo que podemos solucionarlo de las siguientes maneras: */

        System.out.print("Operador de concatenación dentro del método concat: ");
        System.out.println(nombre.concat(" " + apellido));

        System.out.print("Método concat dentro del método concat: ");
        System.out.println(nombre.concat(" ".concat(apellido)));

        System.out.print("Método concat fuera del método concat: ");
        System.out.println(nombre.concat(" ").concat(apellido));

        /* En terminos generales, usar el método concat es más eficiente que el operador de concatenación.
            Esto se debe a que el operador concatena a través de la instacia de un objeto que se crea para ese propósito.
            La instancia de este objeto es StringBuilder. */

    }
}
