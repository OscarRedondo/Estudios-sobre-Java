package _2_String;

public class _13_StringMetodos {
	
	public static void main (String[] args){
		/* En este documento se muestran los metodos mas utilizados, los principales, de la clase String */
        
		String nombre = "Andres";
		
		// length()
		// Este metodo nos devuelve un valor numerico, referente al largo del String que lo la llama.		
		System.out.println("nombre.length() = " + nombre.length());

		// toUpperCase()
		// Devuelve una cadena identica, pero con todos los caracteres en mayuscula
		System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());

		// toLowerCase()
		// Devuelve una cadena identica, pero con todos los caracteres en minusccula
		System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());

		// equals(String)
		// Compara el valor del String con otro, más no la instancia de estos
		System.out.println("nombre.equals(\"Andres\") = " + nombre.equals("Andres")); // Es positivo, porque el valor es el mismo
		System.out.println("nombre.equals(\"andres\") = " + nombre.equals("andres")); // Es negativo, porque el valor es distinto

		// equalsIgnoreCase(String)
		// Cumple la misma función que el método anterior, pero ignora la diferencia entre minusculas y mayusculas
		System.out.println("nombre.equalsIgnoreCase(\"andres\") = " + nombre.equalsIgnoreCase("andres")); // Es positivo, por la diferencia ente minusculas y mayusculas se ignora

		// compareTo(String)
		// Compara los caracteres a nivel de orden lexicografico, lo cual esta basado en relacion de orden definida sobre la tabla Unicode
		// En otras palabras, realiza una comparación sobre el orden numerico de cada codigo que esta en la tabla
		// Compara estos valores y los ordena. Orden lexicografico, se llama.
		System.out.println("nombre.compareTo(\"Andres\") = " + nombre.compareTo("Andres")); // El valor devuelto es 0, porque los valores comparados coinciden

			// Recordemos que el valor 0 y el valor True son equivalentes, por lo que tanto el equals como el compareTo devolverian un valor equivalente

		System.out.println("nombre.compareTo(\"Aaron\") = " + nombre.compareTo("Aaron")); // El valor devuelto cambia, porque los valores comparados no coinciden
																							// El valor es un ordenamiento asignado de acuerdo a la tabla Unicode

		// charAt(Integer)
		// Obtiene un caracter de un string
		System.out.println("nombre.charAt(0) = " + nombre.charAt(0)); // Al pasar el indice 0 nos devuelve el primer caracter de la cadena
		System.out.println("nombre.charAt(1) = " + nombre.charAt(1)); // Al pasar el indice 1 nos devuelve el segundo caracter de la cadena
		System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1)); // Podemos usar el método length para, de forma dinamica, referirnos al 
																						// final de cualquier string
																						// Recuerda que debes restarle 1 al valor si quieres obtener el último indice,
																						// ya que length devuelve el largo total del string, empezando por 1,
																						// pero los índices empiezan en 0.

		// substring(Integer, Integer*)
		// Devuelve una subcadena. Una cadena que deriva de otra. 
		// A partir del índice que se le envie el método devuelve la misma cadena, excluyendo los valores que hay en indices anteriores
		System.out.println("nombre.substring(1) = " + nombre.substring(1)); // Devuelve el mismo valor del String, pero omite el primer indice, el 0, empieza desde el segundo, el 1
		System.out.println("nombre.substring(1, 4) = " + nombre.substring(1, 4)); // Se le puede enviar un segundo argumento que dicte en que indice va a parar la subcadena
																				// Este segundo indice no se va a incluir en el valor devuelto,
																				// asi que este ejemplo devuelve una subcadena desde el indice 1 hasta el indice 3
		System.out.println("nombre.substring(4, nombre.length()) = " + nombre.substring(4, nombre.length())); // El largo del String, a pesar de ser un indice que no existe, 
																												// aun sirve como parametro secundario de este metodo
		System.out.println("nombre.substring(nombre.length(), nombre.length()) = " + nombre.substring(nombre.length()-1, nombre.length()));

		/* ======================================================================================= */

		String trabalenguas = "trabalenguas";

		// replace(String, String)
		// Devuelve una cadena identica, pero con todos los valores iguales al primer parametro reemplazados por el segundo.
		System.out.println("trabalenguas.replace(\"a\", \"-\") = trabalenguas: " + trabalenguas.replace("a", "-")); // Se reemplazan todas las "a" de la cadena por un "-"
		
		// indexOf(String)
		// Devuelve el primer indice del parametro que le demos, si es que dicho parametro existe dentro de la cadena.
		// Si el parametro no se encuentra el metodo devovlera un -1
		// El parametro puede ser tanto un Character como un String
		System.out.println("trabalenguas.indexOf(\'a\') = " + trabalenguas.indexOf('a'));
		System.out.println("trabalenguas.indexOf(\"lenguas\") = " + trabalenguas.indexOf("lenguas"));

		// lastIndexOf(String || Char)
		// Hace lo mismo que el metodo anterior, pero esta vez devuelve el ultimo indice en el que se encuentra el parametro.
		System.out.println("trabalenguas.lastIndexOf(\"a\") = " + trabalenguas.lastIndexOf("a"));

		// contains(String)
		// Devuelve True si el parametro esta dentro de la cadena. En caso contrario devuelve False.
		// A diferencia del metodo anterior, este solo recibe una secuencia de caracteres: un String
		System.out.println("trabalenguas.contains(\"lenguas\") = " + trabalenguas.contains("lenguas"));

		// starstWith(String)
		// Devuelve True si la cadena empieza con el parametro dado
		// Solo recibe String
		System.out.println("trabalenguas.startsWith(\"lenguas\") = " + trabalenguas.startsWith("lenguas"));
		System.out.println("trabalenguas.startsWith(\"t\") = " + trabalenguas.startsWith("t"));

		// endsWith(String)
		// Devuelve True si la cadena termina con el parametro dado
		// Solo recibe String
		System.out.println("trabalenguas.endsWith(\"lenguas\") = " + trabalenguas.endsWith("lenguas"));
		System.out.println("trabalenguas.endsWith(\"t\") = " + trabalenguas.endsWith("t"));

		// trim()
		// Remueve espacios en blanco de la cadena. Tanto a izquierda como a derecha.
		System.out.println("       trabalenguas.trim() Este texto tenia espacios a izquierda y derecha. Con trim() se eliminan       ".trim());

    }

}
    