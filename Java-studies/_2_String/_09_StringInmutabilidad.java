package _2_String;
public class _09_StringInmutabilidad{
    public static void main (String[] args){
        /* Hemos mencionado muchas veces la inmutabilidad de los String, pero ahora vamos a dedicarle un tiempo a este tema en exclusivo.
            Los String no pueden alterarse, eso es lo que significa ser inmutable.
            Sin embargo, las variables con un valor de este tipo pueden cambiar su referencia para así poder cambiar el valor que poseen. */

        String nombre = "Luxanna" ;
        String apellido = "Crownguard" ;

        nombre.concat(" " + apellido);
        System.out.println(nombre);

        /* En el ejemplo anterior vemos que concatenamos un espacio y el valor de la variable apellido a la variable nombre.
            Esto no altera el valor de nombre pues, como dijimos, los String no son alterables.
            En su lugar, esa concatenación devuelve un valor equivalente al valor de nombre más un espacio vacío y más el valor de apellido.
            El valor devuelto ocupa una nueva instancia, no la misma de la variable empleada.
            Ese valor no lo podemos ver, porque no se está haciendo nada con él. Se está perdiendo. */

        String nombreCompleto = nombre.concat(" " + apellido);
        System.out.println(nombreCompleto);

        /* Con las líneas de arriba podemos comprobar que efectivamente el valor de la variable nombreCompleto equivale a la concatenación antes mencioanda. */

        String otroNombreCompleto = nombre.transform(n -> {
            return n + " " + apellido;
        });

        System.out.println(nombre);
        System.out.println(otroNombreCompleto);

        /* Este ejemplo es otra manera de cambiar, transformar, un String.
            Esta manera es mucho más funcional ya que hace uso de funciones, o expresiones, lambda; también conocidas como funciones flecha.
            Las funciones lambda son funciones anonimas, pues carecen de un nombre.            
            Este método recibe una función lambda,un bloque de código.
            En ese bloque se va a recibir el valor del String y se va a devolver el nuevo valor a asignarle.
            
            Nuevamente podemos ser testigos de que el valor de nombre no cambia, pues el método devuelve una nueva instancia con un valor más no cambia el valor de la variable. */

        String mayusOtroNombreCompleto = otroNombreCompleto.replace("a", "A");        

        System.out.println(otroNombreCompleto);
        System.out.println(mayusOtroNombreCompleto);

        /* El método replace nos permite reemplazar carácteres o cadenas de carácteres dentro del valor que llama a esta función por otros.
            En este caso, nuevamente, el valor que llama al método permanece intacto a la vez que un nuevo valor en una neuva instancia es generado y devuelto por el método.
            otroNombreCompleto sigue poseyendo su mismo valor, mientras que la nueva variable mayusOtroNombreCompleto adquiere el valor devuelto por el método. */
    }
}