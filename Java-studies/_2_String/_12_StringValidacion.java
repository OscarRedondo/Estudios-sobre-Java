package _2_String;
public class _12_StringValidacion{
    public static void main (String[] args){
        /* A veces puede que queramos validar algún String. Es decir: saber si es null, si tiene alguna referencia, si tiene un largo y cuál sería este,
            , cuál es su contenido, si quizás tiene un solo espacio vacío e incluso podemos querer validar si el supuesto String es un String de verdad.

            Esto puede ser requerido, por ejemplo, al momento de hacerle un cuestionario al usuario.
            
            Para cumplir con este propósito hay diferentes formas y mecánismos que podemos usar. */

        String nulo = null; // El valor de null equivale a un valor sin referencia, sin instancia alguna. Un valor vacío.

        boolean esNulo = nulo == null; /* Creamos un boolean, falso o verdadero, que nos dice si el valor de la variable de tipo String nulo es igual o no a null.
                                            Este tipo de expresiones se pueden usar facilmente en los llamados flujos de control, que veremos más adelante. */        

        System.out.println("La variable \"nulo\" es equivalente a: " + nulo + "\n"); /* Ya mencionamos que en casos como este, donde no hay muchos valores a concatenar,
                                                                                        es más eficiente usar el método concat.
                                                                                    Pero debido al valor que le asignamos a nulo, null, este método no se puede usar. */

        // System.out.println(nulo.toUpperCase()); 
                                                    /* La línea anterior de código se encuentra comentada porque, si bien la variable nulo es un String, esta no puede
                                                            usar el método toUpperCase, y no es el único método que no puede utilizar.
                                                        Esto se debe al valor que posee la variable.
                                                        En este caso, toUpperCase no puede recibir ningún carácter porque no existen dentro de la variable en sí.
                                                        Específicamente, el fallo, o mejor dicho: la excepción, generada en este caso es:
                                                            java.lang.NullPointerException
                                                        Es importante tener esto en cuenta, pues luego podremos hacer uso de esto para controlar las excepciones con el try-catch. */

        /* Sin embargo, podemos intentar evitar el try-catch haciendo una comprobación correcta de los datos.
            Tal y como se muestra a continuación:  */

        if (esNulo == false){
            System.out.println(nulo.toUpperCase()); /* Aquí repetimos exactamente la línea de código antes comentada, pero ahora está en un flujo de control if.
                                                        Hacemos uso además de la variable con valor booleano que creamos antes, esNulo.
                                                        esNulo compara si el valor de nulo es igual a null, en caso de serlo el valor que adquiere es true y el 
                                                            bloque if se ejecutará.
                                                        Sin embargo, en este if volvemos a comparar ese valor. Si el valor de esNulo es false, debido a que nulo 
                                                            no es igual a null, entonces el bloque de código dentro de if se ejecutará.
                                                        En otras palabras, la comparación que rige si este bloque if se ejecuta o no, es:
                                                            esNulo == false
                                                        Si esNulo es true el bloque no se ejecutará, porque esta comparación sería false.
                                                        Si esNulo fuera false entonces esta comparación sería true y se ejecutaría el bloque. */
                                            
            nulo = "Este valor es dado por el if.";
            System.out.println(nulo);
        }
        else {
            /* En caso de que el bloque if no se ejecute, se saltará a la línea siguiente a este.
                Aún así, podemos añadirle un bloque else el cual se ejecutará si el if no logra hacerlo.
                También, podemos añadir un bloque else if para poder hacer otra comparación que ejecute otro bloque de código en caso de que la anterior haya sido fallida. */

            nulo = "Este valor es dado por el else";
            System.out.println(nulo);
        }


        boolean estaVacio = nulo.length() == 0; /* El método lenght de un tipo String nos indica cuán largo es el valor que posee.
                                                    
                                                    En este caso debemos poner la variable aquí, una vez se le ha asignado un valor a nulo.
                                                    Esto es porque la función length no va a fucionar con un valor null. */

        if (esNulo == false){
            /* En esta ocasión, este bloque if, aunque podriamos decir que cumple con la condición para ejecutarse,
                    está haciendo su comparación en base a la variable que ya creamos antes y que no hemos vuelto a reevaluar.
                esNulo es una variable cuyo valor sigue siendo true, a pesar de que ahora nulo ya no está vacío.

                Si decidieramos que este bloque funcionase en base a los cambios que va sufriendo la variable nulo
                    y no a una variable que permanece igual todo el código, deberíamos poner una comparación como la siguiente:
                        (nulo == null) == false 
                Pero siempre hay varias formas de escribir las cosas, otra forma por ejemplo de escribir
                    esta misma comparación, sería:
                        nulo != null                        
                El símbolo "!" al comienzo hace que el valor que le sigue sea comparado con un false.
                    Por ejemplo, si esNulo es true, entonces !esNulo es igual esNulo == false,
                        si esNulo es false, entonces !esNulo es igual a esNulo == false.
                    
                En este caso, lo usamos para cambiamr el operador de igualdad "==", por el operador de desigualdad "!=".
                    Este operador devuelve true si los valores que compara son diferentes. */

            nulo = "Este valor es dado por el if.";

            System.out.println(nulo.toUpperCase());
            System.out.println(nulo);
        }
        else if(!estaVacio){
            /* Fijate en el cómo está escrita la condición en este bloque else if.               
                "!estaVacio" es equivalente a la comparación "estaVacio == false".
                
                De igual manera, otra forma de escribir esta comparación sería, por ejemplo:
                    "nulo.length() > 0"
                lo cual haría que, al igual que ahora, el bloque solo se ejecutara si nulo posee algún valor dentro. */

            nulo = "Este valor es dado por el else if.";
            System.out.println(nulo);
        }
//----------------------------------------------------------------------------------------------------------------------
        /* Ahora, si queremos saber si algo está vacío podemos hacerlo mucho más sencillo y óptimo que usando este tipo de comparaciones.
            Podemos hacer uso de un método: isEmpty().
            Este método retorna true o false dependiendo de si el valor que lo llama está vacío o no. */

        String vacio = "";

        System.out.println("\nvacio está vacío? operadores de comparación con null: " + (vacio == null));
        System.out.println("vacio está vacío? método length comparado con 0: " + (vacio.length() == 0));
        System.out.println("vacio está vacío? método isEmpty(): " + (vacio.isEmpty()));

        /* El método isEmpty() evalúa si el largo del valor dado es igual a 0.
            En caso de serlo, el método retorna un true.
            
            Fijate en como la comparació con null ahora es falsa. No son iguales.
            El valor de blanco no es null, pero tampoco posee nada así que sí está vacía.
            
            Este método fue implementado desde el JDK 6. */

        /* También hay otro método que es muy parecido a isEmpty, pero es mucho más estricto. isBlank().
            Esta también es la forma más segura de hacer este tipo de comprobaciones.
            Este método fue implementado desde el JDK 11, así que no puede usarse en versiones anteriores a esa.  */

        String blanco = " ";

        System.out.println("\nblanco está vacío? operadores de comparación con null: " + (blanco == null));
        System.out.println("blanco está vacío? método isEmpty(): " + (blanco.isEmpty()));
        System.out.println("blanco está vacío? método isBlank(): " + (blanco.isBlank()));
        System.out.println("\nvacio está vacío? método isBlank(): " + (vacio.isBlank()) + "\n");
        System.out.println("\nnulo está vacío? método isBlank(): " + (nulo.isBlank()) + "\n");

        /* isBlank no solo nos dice si el valor del String está vacío o no, sino además también nos dice si lo único que posee son espacios en blanco.
            Podemos ver que isBlank no retorna true en caso de compararlo con valores tipo null. */
    }
}