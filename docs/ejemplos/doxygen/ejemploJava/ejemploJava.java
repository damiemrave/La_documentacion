/**
 * Clase Ejemplo para demostrar Doxygen.
 *
 * Esta clase contiene métodos simples de cálculo y ejemplos de comentarios
 * que Doxygen puede procesar para generar documentación.
 *
 * @author Damiem Rave
 * @version 1.0
 * @since 2025-10-27
 */
public class ejemploJava {

    /**
     * Suma dos enteros.
     *
     * @param a Primer número
     * @param b Segundo número
     * @return La suma de a y b
     */
    public int sumar(int a, int b) {
        return a + b;
    }

    /**
     * Resta dos enteros.
     *
     * @param a Minuendo
     * @param b Sustraendo
     * @return La resta de a y b
     */
    public int restar(int a, int b) {
        return a - b;
    }

    /**
     * Calcula el factorial de un número de forma recursiva.
     *
     * @param n Número entero no negativo
     * @return Factorial de n
     * @throws IllegalArgumentException Si n es negativo
     */
    public int factorial(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo.");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    /**
     * Método principal para probar la clase Ejemplo.
     *
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        ejemploJava ejemplo = new ejemploJava();
        System.out.println("Suma: " + ejemplo.sumar(3, 4));
        System.out.println("Resta: " + ejemplo.restar(10, 5));
        System.out.println("Factorial de 5: " + ejemplo.factorial(5));
    }
}
