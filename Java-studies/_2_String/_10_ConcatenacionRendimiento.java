package _2_String;
public class _10_ConcatenacionRendimiento{
    public static void main (String[] args){
        /* En esta sección veremos el rendimiento de cada uno de los métodos de concatenación que ofrece Java.
            Primero veremos el rendimiento que nos da el método concat, luego el operador de concatenación y por último el StringBuilder. */

        // OPERADOR DE CONCATENACIÓN

        String a = "a";
        String b = "b";
        String c = "c";
        StringBuilder sb = new StringBuilder(a); /* Se crea una instancia de la clase StringBuilder, con un valor inicial igual al valor de la variable a.
                                                    A diferencia de los String, los StringBuilder sí son mutables. */

        long inicio = System.currentTimeMillis(); /* El método currentTimeMillis de la clase System nos permite calcular la cantidad de milisegundos transcurridos.
                                                        El método le agregará el valor correspondiente a la variable según cuántos ms hayan transcurrido desde el comienzo del programa.

                                                        Por esto es que la variable inicio va justo antes del ciclo que vamos a utilizar para comprobar el rendimiento.
                                                        De esta forma tenemos la cantidad de milisegundos con la que empieza la prueba. */        

        for (int i=0 ; i<100000 ; i++){
            /* El for es una estructura de flujo de control que nos permite pasar sobre un bloque de código reiteradas veces, siempre que la condición estipulada sea verdadera.
                En caso de que la condición del for retorne un false se pasará a la línea que le sigue al blqoue.
                
                Los tres valores entre parénteis determinan lo siguiente:
                    1. Se crea la variable local i, con valor numérico 0.
                    2. Se pone la comparación entre el valor de i y el número 500. En este caso, si i es menor a 500 la condición retornará un true.
                    3. Por último, se determina que cada vez que el bloque termine se le sumará un 1 al valor acumulado de i.
                Esto quiere decir que mientras la variable local i se mantenga inferior a 500 el bloque del for se repetirá.
                También, cada vez que el bloque termine, i aumentará su valor en 1. Esto provoca que el ciclo, en esta ocasión, se repita un total de 500. */

            /* Los siguientes comentarios dentro de este bloque retratan las veces que se repitió el ciclo y cuántos ms tardó en completarse.
                La cantidad de ms puede variar en cada ejecución, por lo que se colocará la mínima cantidad y la máxima cantidad obtenidas durante las pruebas efectuadas al momento
                    de escribir este código.
                La cantidad de ms también puede variar según en qué máquina se ejecute. */

            /* Recuerda probar un solo método a la vez, el resto mantenlos comentados.  */

                // c = c.concat(a).concat(b).concat("\n"); // 500 => 0-21 ms; 1000 => 13-44; 10000 => 468-882; 100000 => 31424-36002
                    /* Rápido: Cada vez que concatenada tiene que crear una instancia para asignarle el valor correspondiente.
                        Es decir, en la primera concatenación esta la instancia con el valor de c y otra con el valor de a, y luego una más con el valor de ambas concatenadas. */

                // c +=a + b + "\n"; // 500 => 0-15 ms; 1000 => 6-17; 10000 => 354-384; 100000 => 21559-40582
                    /* Menos rápido: Aunque al comienzo es menos óptimo que concat, entre más concatenaciones se requiera más óptimo se vuelve, hasta el punto que se hace más óptimo que concat.
                        Aquí no hay instancias intermedias en cada concatenación.
                        Por ejemplo, en la primera concatenación solo están la instancia con el valor de c y la instancia con el valor de c y a concatenadas.*/

                // sb.append(a).append(b).append("\n"); // 500 => 0-5 ms; 1000 => 3-5; 10000 => 0-20; 100000 => 31-35
                    // Más rápido: Su forma de funcionar, con buffer, sin sincronización, etc, lo hacen trabajar de una forma muy optimizada.

            /* Notese que a medida que aumenta el número de ciclos, la diferencia de rendimiento entre el operadore de concatenación y el método concat se va reduciendo.
                Incluso, llega el punto donde concat resulta menos eficiente que el operador.
                
                En conclusión, podemos decir que StringBuilder posee la forma más eficiente para concatenar valores.

                El operador de concatenación y el método concat dependen de la cantidad de valores que estemos cocatenando.
                Si vamos a concatenar pocos valores, cocat es más eficiente.
                Pero si vamos a concatenar una gran cantidad de valores, puede que sea mejor plantearnos usar el operador de concatenación. */
        }

        long fin =  System.currentTimeMillis(); /* Una vez acabe el ciclo definimos la varibale fin, también con el valor de los ms.
                                                    El valor de la variable fin luego se puede restar por el de la variable inicio, y así saber cuántos ms tardó el ciclo en completarse. */

        System.out.println("El tiempo conseguido es: " + (fin - inicio));
    }
}