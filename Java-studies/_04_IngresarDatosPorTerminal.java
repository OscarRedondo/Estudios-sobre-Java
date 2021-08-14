import java.util.Scanner;
import java.util.InputMismatchException;
    /* En este codigo vamos a importar dos clases.
        Pon mucha atención en dónde van y para qué se utilizan. */

public class _04_IngresarDatosPorTerminal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
            /* En esta línea se crea una instancia de la clase "Scanner", un objeto.
                El constructor de esta clase espera un argumento. Así que le daremos una entrada de tipo String.
                Cabe resaltar que en esta ocasión usaremos "System.in" para que el usuario ingrese los datos.
                
                Notese que tanto el "JOptionPane" como el "System.in" cumplen funciones similares. Sin embargo, JOptionPane abre una ventana emergente, y 
                System.in pide los valores por la terminal. */
        
        System.out.println("\nIngrese un número entero: ");
            /* A diferencia de utilizar JOptionPane, en esta ocasión debemos colocar el mensaje que solicité el ingreso de datos en una línea aparte. */

        // String numeroStr = scanner.nextLine();
            /* Se crea la variable que va a almacenar el dato que ingrese el usuario, y se le asigna como valor el mismo que tiene la instancia creada: scanner.
            
                El método "nextLine" obtiene el valor que ingresa el usuario por la terminal, siempre y cuando este sea de tipo String.
                Además, obliga al programa a frenarse hasta que el usuario ingrese algún tipo de dato por la terminal.
                
                **ESTA LÍNEA SE ENCUENTRA COMENTADA PORQUE SE BUSCA EXPLICAR LO QUE HACE, PERO NO ES NECESARIA YA QUE A CONTINUACIÓN SE REEMPLAZARÁ
                    POR OTRA LÍNEA DE CÓDIGO MÁS ÓPTIMA.** */
        
        int numeroIngresado = 0;
        try{                   
            // numeroIngresado = Integer.parseInt(numeroStr);
                /* **ESTA LÍNEA SE ENCUENTRA COMENTADA PORQUE SE BUSCA EXPLICAR LO QUE HACE, PERO NO ES NECESARIA YA QUE A CONTINUACIÓN SE REEMPLAZARÁ
                    POR OTRA LÍNEA DE CÓDIGO MÁS ÓPTIMA.** */

            numeroIngresado = scanner.nextInt();
            /* Si has estado leyendo los comentarios, ya te puedes ahcer una ídea de la funcionalidad de está línea.
            
                Al usar esta única línea de código, reemplazamos el tener que asignarle un valor tipo String a una variable y luego tener que convertirlo a un tipo numérico.
                En su lugar, asignamos un valor directamente numérico a una variable.
                
                Aún así, este no es el único cambio que debemos de efectuar si decidimos optar por esta solución.
                La expeción generada por esta línea de código es diferente a la excepción generada cuando queremos convertir un dato de tipo texto a numérico y no se puede. */

        } catch(InputMismatchException e){
            /* Hemos tenido que cambiar el error "NumberFormatException" pues ya no nos es útil en este código.
                En su lugar, hemos tenido que colocar el error "InputMismatchException". Para esto también hemos tenido que importar la clase correspondiente de la excepción.
                
                ** HAY QUE TENER EN CUENTA QUE AL FINAL, TODAS LAS EXCEPCIONES SON OBJETOS DE UNA CLASE MAESTRA LLAMADA "Exception".
                ESTO QUIERO DECIR QUE SI PONEMOS COMO ARGUMENTO LA CLASE "Exception", SE CAPTURARAN TODOS LOS ERRORES DE FORMA GENERAL. ** */

            System.out.println("ERROR: Debe ingresar un número entero.\n");
            main(args);
            System.exit(0);
        }

        String mensaje_1 = "\nEl número ingresado por el usuario es: " + numeroIngresado;
        String mensaje_2 = "El número ingresado por el usuario, si estuviese en el sistema binario, sería: " + Integer.toBinaryString(numeroIngresado);
        String mensaje_3 = "El número ingresado por el usuario, si estuviese en el sistema octal, sería: " + Integer.toOctalString(numeroIngresado);
        String mensaje_4 = "El número ingresado por el usuario, si estuviese en el sistema hexadecimal, sería: " + Integer.toHexString(numeroIngresado) + "\n";
            /* Para intentar hacer el código un poco más legible, acabamos de asignarle una variable a cada texto que se debe imprimir por la consola. */

        String mensaje = mensaje_1 + "\n" + mensaje_2 + "\n" + mensaje_3 + "\n" + mensaje_4;
            /* Ahora todas esas variables se concatenan en una sola, y es esta la que finalmente imprimirá el programa si todo sale bien.
                Fijese en los saltos de línea que se le agregaron. Esto se debe a que antes el salto de línea se daba por defecto por cada impresión, sin embargo
                ahora todo el texto se une en uno solo, por lo que es nuestra labor agregarlos en donde deben ir. */

        System.out.println(mensaje);
    }
}
