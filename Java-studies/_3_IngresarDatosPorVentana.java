import javax.swing.JOptionPane;
    /* Esta línea nos sirve para importar el método "JOptionPane" que vamos a utilizar en este código.
       No todas las herramientas disponibles en Java están accesibles por default, por lo que toca importarlas para poder hacer uso de ellas. */

public class _3_IngresarDatosPorVentana{
    public static void main(String[] args) {
        String numeroTexto = JOptionPane.showInputDialog(null, "Ingrese un número entero: ");
            /* La línea anterior se encarga de mostrar una ventana donde el usuario puede ingresar algún valor.
                El valor recibido es por defecto de tipo "String".
                El primer valor que se le pasa como arguemnto, "null", hace referencia al componente padre. En este caso no hay ninguno, por eso el valor "null".
                El segundo valor es el mensaje con el que se va a presentar la ventana emergente. */
        
        int numeroIngresado = 0;

        try{
            /* El try-catch es una estructura que nos permite *intentar* ejecutar un bloque de código.
                Si el bloque genera algún tipo de error, entonces podemos *atrapar* ese error y ejecutar otro bloque de código en lugar de dejar que el programa colapse.
                
                Notese que definimos la variable "numeroIngresado" por fuera del bloque try-catch, esto es debido al alcance que tienen las variables.
                Una variable definida dentro de un bloque se manteniene exclusivamente dentro del alcance de ese bloque y no fuera de él.
                Definiendo la variable por fuera del bloque permitimos que esta tenga alcance tanto fuera como dentro de él.
                Lo único que se le hace a la variable aquí es *intentar* cambiarle el valor que posee. */

            numeroIngresado = Integer.parseInt(numeroTexto);
                /* Debido a que la primera línea de código devuelve un texto, y como, en este caso ,se le pide el favor al usuario de que sea un número entero, es posible
                    convertir ese texto a un valor numérico como tal.
                    Para eso utilizamos esta segundo línea, que convierte el valor suminsitrado en un valor d tipo "int". */
        } catch(NumberFormatException e){
            /* Dentro del bloque del "catch" ponemos como argumento el error que queremos *capturar*.
                Cuando dicho error ocurra en la ejecución del bloque "try", el programa saltará inmediatamente a ejecutar el codigo dentro de este bloque. */
            JOptionPane.showMessageDialog(null, "ERROR: Debe ingresar un número entero.");
            main(args);
                /* Hay que tener en cuenta que, en este caso, si el valor ingresado no es correcto queremos que el usuario lo vuelva a intentar.
                    Es por eso que este línea hacemos un llamado a la función main(). Es decir, le pedimos que se vuelva a leer el programa desde la primer línea.
                    Este tipo de casos, en los que una función hace un llamado a sí misma, son conocidos como "recursividad". */
            System.exit(0);
                /* El problema es que, una vez el programa continue más alla de este fallo, todos los llamados a la función main() ejecutaran el resto del codigo
                    que les quedase por leer antes de hacer el llamado.
                    Para evitar esto, podemos usar un "return", y, como el retorno que tiene la función main es de tipo "void", todos los llamados ejecutados por catch
                    no retornarán nada.
                    
                    Sin embargo, una mejor manera de evitarlo es por medio de la clase "System" y su método "exit".
                    Al hacerlo de esta manera recordemos agregar un cero como argumento del método, para especificar que todo se ejecutó correctamente. */
        }

        System.out.println("\nEl número ingresado por el usuario es: " + numeroIngresado);
        System.out.println("El número ingresado por el usuario, si estuviese en el sistema binario, sería: " + Integer.toBinaryString(numeroIngresado));
        System.out.println("El número ingresado por el usuario, si estuviese en el sistema octal, sería: " + Integer.toOctalString(numeroIngresado));
        System.out.println("El número ingresado por el usuario, si estuviese en el sistema hexadecimal, sería: " + Integer.toHexString(numeroIngresado) + "\n");
            /* En estas últimas líneas podemos ver como efectivamente el valor ingresado por el usuario se trata ahora de un valor numérico, pues es capaz 
                de participar en operaciones numéricas sin problemas. */

        JOptionPane.showMessageDialog(null, "El programa se ha ejecutado corrrectamente");
            /* La última línea no hace falta, pero nos sirve ahora para exhibir que se puede mostrar un mensaje en una ventana emergente sin solicitar que se ingrese algún valor. */
    }
}