package EjemplosPredicate;

import java.util.function.Predicate;

public class EjemploPredicate {
    public static void main(String[] args) {
        // Definir un Predicate para verificar si un número es mayor que 10
        Predicate<Integer> esMayorQue10 = num -> num > 10;

        // Llamada al Predicate con el valor 15
        boolean resultado = esMayorQue10.test(15);

        // Imprimir el resultado
        if (resultado) {
            System.out.println("El número es mayor que 10.");
        } else {
            System.out.println("El número no es mayor que 10.");
        }
    }
}

