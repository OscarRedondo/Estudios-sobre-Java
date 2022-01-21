package _1_Variables;
public class _01_HolaMundo {
    public static void main(String[] args) {
        String saludo = "Hola mundo, desde Java.\n";
        System.out.println(saludo);
        
        // Tipos de datos primitivos
            /*  Números enteros: byte, short, int, long
                Números flotantes (con decimal): float, double
                */
        
            // Numeros enteros - Primitivos
            
            byte numeroByte = 127; // byte puede tener valores entre -128 y 127
            short numeroShort = 32767; // short puede tener valores entre -32768 y 32767
            int numeroInt = 2147483647; // int puede tener valores entre -2147483648 y 2147483647
                                        // Si se le asigna a una variable "var" un número, este será por defecto de tipo "int"
            long numeroLong = 9223372036854775807L; /* long puede tener valores entre -9223372036854775808 y 9223372036854775807
                                                        A los valores de tipo "long" se les debe agregar una "l" o una "L" al final.
                                                        Se recomienda usar la mayúscula para diferenciar el carácter del número uno.
                                                        De no colocarse ese último carácter aparecerá un error, pues el programa lo interpretará como si fuese un int.
                                                        
                                                        Si se requiere un número más grande se pueden usar números flotantes. */

            System.out.println("La variable \"numeroByte\" equivale a: " + numeroByte);
            System.out.println("El tipo de dato \"byte\" equivale a " + Byte.BYTES + " bytes.");
            System.out.println("El tipo de dato \"byte\" equivale a " + Byte.SIZE + " bits.");
            System.out.println("El valor máximo que puede recibir \"byte\" equivale a " + Byte.MAX_VALUE + ".");
            System.out.println("El valor mínimo que puede recibir \"byte\" equivale a " + Byte.MIN_VALUE + ".\n");
            
            System.out.println("La variable \"numeroShort\" equivale a: " + numeroShort);
            System.out.println("El tipo de dato \"Short\" equivale a " + Short.BYTES + " bytes.");
            System.out.println("El tipo de dato \"Short\" equivale a " + Short.SIZE + " bits.");
            System.out.println("El valor máximo que puede recibir \"Short\" equivale a " + Short.MAX_VALUE + ".");
            System.out.println("El valor mínimo que puede recibir \"Short\" equivale a " + Short.MIN_VALUE + ".\n");
            
            System.out.println("La variable \"numeroInt\" equivale a: " + numeroInt);
            System.out.println("El tipo de dato \"int\" equivale a " + Integer.BYTES + " bytes.");
            System.out.println("El tipo de dato \"int\" equivale a " + Integer.SIZE + " bits.");
            System.out.println("El valor máximo que puede recibir \"int\" equivale a " + Integer.MAX_VALUE + ".");
            System.out.println("El valor mínimo que puede recibir \"int\" equivale a " + Integer.MIN_VALUE + ".\n");
            
            System.out.println("La variable \"numeroLong\" equivale a: " + numeroLong);
            System.out.println("El tipo de dato \"long\" equivale a " + Long.BYTES + " bytes.");
            System.out.println("El tipo de dato \"long\" equivale a " + Long.SIZE + " bits.");
            System.out.println("El valor máximo que puede recibir \"long\" equivale a " + Long.MAX_VALUE + ".");
            System.out.println("El valor mínimo que puede recibir \"long\" equivale a " + Long.MIN_VALUE + ".\n");

            // Números flotantes - Primitivos
                /*  Números decimales simples: float
                    Números decimales dobles: double
                    
                    La parte fraccionaria de un número es conocida como la "mantisa". Esta es la parte que va antes del
                    carácter "e" o "E", y después del punto que le sigue a la aparte entera.
                    Los números que le siguen al carácter "e" o "E" son el "exponente". */
                    
            float numeroFloat = 3.4028235e38F; /* float puede tener valores entre 1.4e-45 y 3.4028235e38
                                        A los valores de tipo "float" se les debe agregar una "f" o una "F" al final.
                                        De no colocarse ese último carácter aparecerá un error, pues el programa lo interpretará como si fuese un double.
                                        Puede usarse el carácter "e" o "E" para multiplicar por diez el valor dado.
                                        Se debe poner un número después del carácter "e" para determinar por cuál número se eleva a diez antes de la operación. */
           double numeroDouble = 1.7976931348623157e308; /* double puede tener valores entre 4.9e-324 y 1.7976931348623157e308
                                                            Puede usarse un carácter "d" o "D" al final para definir el valor como un double.
                                                            En caso de colocar un punto no es necesario agregar la "d" o la "D", ya que estos valores son double por defecto. */
                                                            
           System.out.println("La variable \"numeroFloat\" equivale a: " + numeroFloat);
           System.out.println("El tipo de dato \"float\" equivale a " + Float.BYTES + " bytes.");
           System.out.println("El tipo de dato \"float\" equivale a " + Float.SIZE + " bits.");
           System.out.println("El valor máximo que puede recibir \"float\" equivale a " + Float.MAX_VALUE + ".");
           System.out.println("El valor mínimo que puede recibir \"float\" equivale a " + Float.MIN_VALUE + ".\n");

           System.out.println("La variable \"numeroDouble\" equivale a: " + numeroDouble);
           System.out.println("El tipo de dato \"double\" equivale a " + Double.BYTES + " bytes.");
           System.out.println("El tipo de dato \"double\" equivale a " + Double.SIZE + " bits.");
           System.out.println("El valor máximo que puede recibir \"double\" equivale a " + Double.MAX_VALUE + ".");
           System.out.println("El valor mínimo que puede recibir \"double\" equivale a " + Double.MIN_VALUE + ".\n");

           // Carácteres solitarios - Primitivos
            /* Se definen con la palabra reservada "char".

                A diferencia del String, que es un valor de referencia hacia un objeto, el char es un valor primitivo.
                Recordemos que String puede tener cadenas de texto, mientras que char solo puede almacenar un único carácter.                
                Notese que se escribe en minísculas 'char' y no hay ninguna mayúscula, como en el caso del 'String'.
                Notese también que en el String el valor otorgado se encierra en comillas dobles (""), mientras que en el char se encierra en comillas simples ('')
                El caracter que almacena una variable char puede estar en código unicode.
                Si se encuentra en el sistema operativo Windows, puede buscar en el inicio el "Mapa de caracteres" para ver un glosario de los símbolos disponibles en unicode.
                    Puede obtener el mismo glosario buscando "unicode characters table" en algún buscador de internet.
                También es posible asignarle valor a un char con un código decimal. En estos casos recuerda que si usas 'var' en lugar de 'char' el valor será un número int.
                
                Podemos ver que el tamaño de un char es equivalente al de un short, a pesar de que contiene un único carácter.
                Esto se debe a que sí bien muestra un único carácter, el valor que puede almacenar puede ser mayor. Como en el caso de usar código unicode. */

           char caracter = 'C';
           char caracterDecimal = '1';
           char decimal = 64; // Si pusieramos var en lugar de char el valor de esta variable sería de tipo int, puesto que es un número.
           char unicode = '\u0040';

           System.out.println("La variable \"caracter\" equivale a: " + caracter);
           System.out.println("La variable \"caracterDecimal\" equivale a: " + caracterDecimal);
           System.out.println("La variable \"decimal\" equivale a: " + decimal);
           System.out.println("La variable \"unicode\" equivale a: " + unicode);
           
           System.out.println("El tipo de dato \"caracter\" equivale a " + Character.BYTES + " bytes.");
           System.out.println("El tipo de dato \"caracter\" equivale a " + Character.SIZE + " bits.");
           System.out.println("El valor máximo que puede recibir \"caracter\" equivale a " + Character.MAX_VALUE + ".");
           System.out.println("El valor mínimo que puede recibir \"caracter\" equivale a " + Character.MIN_VALUE + ".\n");

           // Carácteres especiales
            /* Los carácteres especiales son aquellos que cumplen un función especial, tales como espacios, tabulaciones o borrar otro carácter.
                A continuación no están todos, pero si se destacan algunos muy importantes. 
                
                Notese que se hace uso de un "\" al comienzo de cada carácter especial, o al menos de la mayoría.
                Esto es porque este símbolo es leído por el programa como un "escape" de los valores habituales.
                Este símbolo, junto con el caracter que se le ponga en frente, puede devolver un carácter especial en su lugar. */

            /*  Diagonal invertida (backslash): En caso de que se quiera poner una diagonal invertida en el texto esta debe ser invocada luego del caracter especial "\".
                                                Esto debido a que ambos simbolos son iguales y el programa no puede saber a cuál nos referimos.
                                                Por eso, una sola diagonal invertida siempre es tomada conmo el carácter de escape y no como el carácter en sí.
                    '\\'
                Comillas dobles: Debido a que las comillas dobles son las encargadas de encerrar el texto de un objeto String, poner alguna dentro del texto generará error.
                                Es por eso que es necesario usar el carácter de escape y que el programa entienda que esas comillas no son ni de apertura ni de cierre.
                    '\"'
                ----------------------------------------------------------
                Espacio (space): Un espacio vacio.
                    ' ', '\u0020'
                Retroceso (back): Borra el último carácter de la cadena.
                    '\b'
                Tabulador (tabulator): Una tabulación. Las tabulaciones son espacios vacios que tienen un fin ya predeterminado.
                            Esto quiere decir que su inicio puede variar, y por ende su tamaño, pero todas terminan en lugares ya establecidos.
                            Estos lugares se encuentran seguidos y alineados con los otros espacios que tengan arriba y abajo.
                    '\t'
                Nueva línea (new line): Hace un salto desde la línea actual hacía la siguiente.
                    '\n'
                Retorno de carro: Funciona muy similar a "\n", pero su funcionamiento varía según el sistema operativo que la ejecute.
                                    Unix, macintosh moderna: No se usa, en su lugar se utiliza el "\n".
                                    Windows, macintosh vieja: Borra la línea que haya detrás de ella y la reemplaza con los valores que tenga al frente.

                                    En caso de que no estés muy seguro sobre cuál sistema operativo va a correr el programa, puedes usar la siguiente propiedad de la clase System:
                                        System.getProperty("line.separator")
                                    Esta propiedad es una variable de ambiente perteneicnete a la máquina virtual de Java, por lo que ya viene predefinida.
                                    Su valor será igual a \n, \r o \r\n, según el programa lo vea necesario según el sistema operativo donde corra.
                                    Tambén existe un método que cumple la misma función, y sirve como un atajo a la propiedad anterior:
                                        System.lineSeparator()
                    '\r'
            */
        
            // Booleanos (Valores lógicos) - Primitivos
            /* Se definen con la palabra reservada "boolean". Si se pusiese la palabra reservada"Boolean" se crearía una instancia.
                
                Solo pueden contener uno de dos valores: "true" (verdadero) o "false" (falso).

                Al momento de usar comparaciones, como en los flujos de control, el valor devuelto siempre será un valor booleano.

                También se les puede asignar una instancia de la clase "Boolean" de la siguiente manera.
                    boolean ejemplo = Boolean.TRUE
                    boolean ejemplo = Boolean.FALSE
                A esta forma de asignación también se le puede agregar el método "booleanValue()", aunqueno es necesario porque ya se ejecuta de forma automatica sin colocarlo.
                    boolean ejemplo = Boolean.TRUE.booleanValue()
                    boolean ejemplo = Boolean.FALSE.booleanValue()
                Estas instancias devuelven a su vez el correspondiente valor primitivo.
                Si bien, estas dos formas son correctas, no es muy común que se les necesito, por lo que asignar estos valores con "true" o "false" suele ser suficiente.
                Esto forma parte de lo denominado como "Clases Wrapper", de las que hablaremos más adelante en otro documento. */

            boolean datoLogico = false;
            boolean segundoDatoLogico = true;

            boolean instanciaVerdadera = Boolean.TRUE;
            boolean instanciaFalsa = Boolean.FALSE;

            byte valorDePruebaUno = 1;
            byte valorDePruebaDos = 2;

            System.out.println(datoLogico);
            System.out.println(segundoDatoLogico);
            System.out.println(instanciaVerdadera);
            System.out.println(instanciaFalsa + "\n");

                /* A continuación se muestra un ejemplo de los valores booleanos y su uso en los flujo de control.
                    Sin embargo, este  tema será retomado y profundizado más adelante en otro documento. */

            if (valorDePruebaUno < valorDePruebaDos)    {
                System.out.println("Esta línea se muestra si valorDePruebaUno es menor a valorDePruebaDos\n");
            } else {
                System.out.println("Esta línea se muestra si valorDePruebaDos es menor a valorDePruebaUno\n");
            }


    }
}