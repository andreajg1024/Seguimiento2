package EjemplosFunction;

public class ParImpar {
    // Definición de la función para verificar si un número es par
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    // Método principal para probar la función
    public static void main(String[] args) {
        // Llamada a la función para verificar si un número es par
        int numero = 10;
        if (esPar(numero)) {
            System.out.println(numero + " es un número par.");
        } else {
            System.out.println(numero + " es un número impar.");
        }
    }
}

