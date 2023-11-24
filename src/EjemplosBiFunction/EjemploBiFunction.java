package EjemplosBiFunction;

import java.util.function.BiFunction;

public class EjemploBiFunction {
    public static void main(String[] args) {
        // Definir una BiFunction para sumar dos números y multiplicar el resultado por un tercer número
        BiFunction<Integer, Integer, Integer> sumaYMultiplica = (a, b) -> (a + b) * 2;

        // Llamada a la BiFunction con los valores 3 y 4
        int resultado = sumaYMultiplica.apply(3, 4);

        // Imprimir el resultado
        System.out.println("El resultado es: " + resultado);
    }
}

