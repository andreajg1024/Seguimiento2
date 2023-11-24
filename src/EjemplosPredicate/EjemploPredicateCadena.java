package EjemplosPredicate;

import java.util.function.Predicate;

public class EjemploPredicateCadena {
    public static void main(String[] args) {
        // Definir un Predicate para verificar si una cadena tiene más de 5 caracteres
        Predicate<String> tieneMasDe5Caracteres = s -> s.length() > 5;

        // Llamada al Predicate con una cadena
        String cadena = "Ejemplo";
        boolean resultado = tieneMasDe5Caracteres.test(cadena);

        // Imprimir el resultado
        if (resultado) {
            System.out.println("La cadena tiene más de 5 caracteres.");
        } else {
            System.out.println("La cadena no tiene más de 5 caracteres.");
        }
    }
}
