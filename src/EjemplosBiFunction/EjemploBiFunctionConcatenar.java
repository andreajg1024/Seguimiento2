package EjemplosBiFunction;

import java.util.function.BiFunction;

public class EjemploBiFunctionConcatenar {
    public static void main(String[] args) {
        // Definir una BiFunction para concatenar dos cadenas con un separador
        BiFunction<String, String, String> concatenarConSeparador = (s1, s2) -> s1 + " | " + s2;

        // Llamada a la BiFunction con dos cadenas
        String resultado = concatenarConSeparador.apply("Hola", "Mundo");

        // Imprimir el resultado
        System.out.println("El resultado de la concatenación es: " + resultado);
    }
}
