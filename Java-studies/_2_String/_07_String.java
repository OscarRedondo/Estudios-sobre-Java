package _2_String;
public class _07_String{
    public static void main(String[] args){
        /* El String es un objeto de java del tipo de referencia, no primitivo.
            Hay que tener en cuenta que una definición valida para los tipo String es que son un "arreglo de carácteres", y todo arreglo en Java es un objeto.

            Sin embargo, puede confundirse con un primitivo debido la comodidad que ofrece a la hora de la sintaxis: */
        
        String nombre = new String(" Nombre ");
        String apellido = "Apellido apellido";
        String pruebaNombre = " Nombre ";
        String pruebaApellido = "Apellido apellido";
            /* Aquí podemos ver como una variable de Tipo String puede ser definida con la sintaxis de un objeto, "tipo nombreObjeto = new NombreClase(valor)"".
                Y también con la sintaxis de un primitivo, "tipo nombre = valor".
                Esto está hecho para que este tipo de variables tengan una forma más cómoda de ser asignadas.
                
                Recuerde que los caracteres de un String se codifican con Unicode y son inmutables, es decir que no pueden ser cambiados.
                Es por el hecho de que son inmutables que a pesar de que usemos metodos como "replace", para reemplazar una parte de la variable,
                o "substring", para obtener una subcadena a partir de la original, siempre vamos a recibir un String nuevo, no una modificación del que ya se pasó.  */
        
        System.out.println("Operador ==: " + (nombre == " Nombre ")); // En esta línea es importante encerrar la comparación en parentesís para que se ejecuté correctamente        
        System.out.println("Método equals(): " + nombre.equals(" Nombre "));
        System.out.println("Método equalIsIgnoreCase(): " + nombre.equalsIgnoreCase("nOMbRe"));
        System.out.println();
            /* Fijemonos en como el operador de igualdad, "==", y el metodo "equals" se encargan de hacer un trabajo muy similar. Comparar la igualdad de dos valores.
                Aún así, estas dos formas de comparación funcionan de manera ligeramente distintna con los String que con los primitivos, esto debido a que son valores de referencia.
                El operador "==" compara si ambos valores son el mismo objeto.
                Mientras que el método "equals" compara si ambos valores son equivalentes.
                
                Es por eso que la primera línea va a devolver "false", y la segunda "true".
                
                También podemos ver en uso una vez más el método "equalIsIgnoreCase", el cual va a ignorar toda diferencia de mayúsculas y minúsculas. */

        System.out.println("\"nombre\" es igual a \"pruebaNombre\": " + (nombre == pruebaNombre));
        System.out.println("\"apellido\" es igual a \"pruebaApellido\": " + (apellido == pruebaApellido));
            /* Fijese en como las dos líneas anteriores devuelven los valores booleanos "false" y "true", respectivamente. A pesar de que ambos son muy similares y usan
                el operador comparativo de igualdad.
                Esto sucede por la forma en que se han decladaro el valor de las variables "nombre" y "apellido", que luego se comparan con "pruebaNombre" y "pruebaApellido".
                
                Cuando se comparan las variables "apellido" y "pruebaApellido", el resultado es un true debido a que el programa identifica que ambos objetos poseen el mismo valor, 
                por lo que en lugar de asignarle un objeto distinto a la variable "pruebaApellido" lo que hace es asignarle la referencia del valor de "apellido", haciendo que 
                ambas variables hagan referencia al mismo objeto.
                Es decir, que el programa primero busca si hay una variable con el mismo valor para asignar la misma referencia. En caso de no encontrarla generará un nuevo objeto.
                
                Por otra parte, cuando se comparan las variables "nombre" y "pruebaNombre" el resultado es un false.
                Esto se debe a que, aunque se le asigne el mismo valor a "pruebaNombre" que a "nombre", "nombre" está asignadao usando la sintaxis de "new".
                Lo que esto provoca es que el programa no encuentre este valor cuando se haga una busqueda al definir una variable con sintaxis carente de "new". Tampoco
                hara la busqueda de otras variables iguales en caso de que la variable se defina con la sintaxis "new", sino que de una vez generará un nuevo objeto. */
//----------------------------------------------------------------------------------------------------------------------
        /* A continuación vamos a ver unos métodos bastante comunes de la clase String */
            System.out.println("length(): " + nombre.length()); // Devuelve un int con el largo del String
            System.out.println("equals(): " + apellido.equals("Apellido apellido")); // Compara si el valor de ambas variables es el mismo
            System.out.println("equalIsIgnoreCase(): " + nombre.equalsIgnoreCase("nOMbRe")); // Compara si el valor de ambas variables es el mismo, independientemente de las mayúsculas y las minúsculas
            System.out.println("compareTo(): " + "abc".compareTo("def")); /* Devuelve un valor negativo si la cadena de texto es anterior a  la cadena de texto pasada como argumento
                                                            Devuelve 0 si ambas cadenas son equivalentes
                                                            Devuelve un valor positivo si la cadena de texto es posterior la cadena de texto pasada como argumento. 
                                                            
                                                            Esta comparación se basa en el ordenamiento que tienen los símbolosos en unicode. */
            System.out.println("trim(): " + nombre.trim()); // Crea un nuevo objeto con el mismo valor del String, pero elimina todo espacio en blanco que hubiese al principio y final
            System.out.println("charAt(): " + apellido.charAt(5)); // Devuelve el carácter encontrado en el indice especificado del String
            System.out.println("toCharArray(): \r");
            System.out.println(nombre.toCharArray()); /* Convierte la cadena en un arreglo de carácteres
                                                        Veamos como separamos el texto anterior de la instrucción del método "toCharArray".
                                                        Esto es debido a los problemas que esto pudiese generar,ya que se devuelve un arreglo de char's. */
            System.out.println("substring(): " + apellido.substring(0, 5)); // Extrae una subcadena de la cadena dada, desde el indice dado hasta el otro indice dado
            System.out.println("substring(): " + nombre.substring(5)); // Extrae una subcadena de la cadena dada, desde el indice dado hasta el final del String
            System.out.println("indexOf(): " + apellido.indexOf("lli")); // Devuelve un int que indica en qué posición se encuentra el carácter o cadena suministrado
                                                                        // Solo funciona con la primera copia del carácter o cadena
            System.out.println("lastIndexOf(): " + nombre.lastIndexOf("lli")); // Devuelve un int que indica en qué posición se encuentra el carácter o cadena suministrado
                                                                            // Solo funciona con la última copia del carácter o cadena
            System.out.println("startsWith(): " + apellido.startsWith("Nom")); // Dice si es verdad que la cadena empieza con el valor dado o no.
            System.out.println("endsWith(): " + nombre.endsWith("bre")); // Dice si es verdad que la cadena termina con el valor dado o no.
            System.out.println("split(): " + apellido.split(" ")); // Divide la cadena en varias subcadenas, utilizando como separador el valor dado

            System.out.println(nombre);
            System.out.println(apellido);
    }
}