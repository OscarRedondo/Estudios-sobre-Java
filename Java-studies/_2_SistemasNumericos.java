public class _2_SistemasNumericos{
    public static void main(String[] args) {
        short numeroDecimal = 503; /* El valor numérico que contiene esta variable se encuentra en el sistema decimal.
                                        Java interpreta por defecto que los números que se le suministran están en el sistema decimal.
                                        El sistema decimal posee números desde el 0 hasta el 9.
                                        Este sistema es el que solemos usar habitualmente y el mismo que se nos enseña desde pequeños. */

         short numeroBinario = 0b111110110; /* El valor de esta variable se encuentra en el sistema binario
                                                Para que Java entienda que el valor que ingresamos corresponde al sistema binario, debemos poner un cero y una b al inicio del valor.
                                                    "0b"
                                                El sistema binario posee solo dos número, el uno y el cero.
                                                Este sistema es el que usan las maquinas como las computadoras para poder trabajar. */
                                            
        short numeroOctal = 0745; /* Este valor se encuentra en el sitema octal
                                        Para hacer que Java interprete que el número dado es del sistema octal, se debe poner un cero al comienzo del valor.
                                            "0"
                                        El sistema octal posee números del 0 al 7. */

        short numeroHexadecimal = 0x1f8; /* El valor de esta variable se encuentra en el sistema hexadecimal.
                                        Para que Java entienda que este valor es del sistema hexadecimal, se debe poner un cero y una equix al comienzo del valor.
                                            "0x"
                                        El sistema hexadecimal posee 16 números. Sin embargo, como nosotros usamos el sistema decimal, carecemos de símbolos suficientes.
                                        Es por eso que los últimos 6 números del sistema hexadecimal se representan con letras: A, B, C, D, E, F. */

        System.out.println("La variable \"numeroDecimal\" equivale a: " + numeroDecimal);
        System.out.println("La variable \"numeroBinario\" equivale a: " + numeroBinario);
        System.out.println("La variable \"numeroOctal\" equivale a: " + numeroOctal);
        System.out.println("La variable \"numeroHexadecimal\" equivale a: " + numeroHexadecimal);
        System.out.println("\n");

            // Usando el siguiente método podemos mostrar los equivalentes de un sistema en otro, pero en valor String.

        System.out.println("La variable \"numeroDecimal\", en decimal, equivale a: " + Integer.toString(numeroDecimal));
        System.out.println("La variable \"numeroDecimal\", en binario, equivale a: " + Integer.toBinaryString(numeroDecimal));
        System.out.println("La variable \"numeroDecimal\", en octal, equivale a: " + Integer.toOctalString(numeroDecimal));
        System.out.println("La variable \"numeroDecimal\", en hexadecimal, equivale a: " + Integer.toHexString(numeroDecimal));
        System.out.println("\n");

            /* Fijemonos como en la terminal se hace un doble espaciado cuando solo hemos puesto un salto de línea.
                Esto se debe a que la instrucción "System.out.println()" ya imprime una línea vacía por si misma, asi que especificarle
                un salto de línea provocará que se generen dos. */
    }
}