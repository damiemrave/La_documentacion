/**
 * La clase {@code CuentaBancaria} representa una cuenta bancaria básica
 * con funcionalidades para depositar, retirar y consultar el saldo.
 * <p>
 * Esta clase asegura que no se pueda retirar más dinero del disponible
 * y que los depósitos sean siempre positivos.
 * </p>
 * 
 * <b>Ejemplo de uso:</b>
 * <pre>
 *     CuentaBancaria cuenta = new CuentaBancaria("Juan Pérez", 1000);
 *     cuenta.depositar(500);
 *     cuenta.retirar(200);
 *     System.out.println(cuenta.getSaldo()); // Imprime 1300
 * </pre>
 * 
 * @author Juan Pérez
 * @version 1.0
 */
public class CuentaBancaria {

    /** El nombre del titular de la cuenta */
    private String titular;

    /** El saldo actual de la cuenta */
    private double saldo;

    /**
     * Crea una nueva cuenta bancaria con un titular y saldo inicial.
     * 
     * @param titular el nombre del titular de la cuenta
     * @param saldoInicial el saldo inicial de la cuenta, debe ser >= 0
     */
    public CuentaBancaria(String titular, double saldoInicial) {
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("El saldo inicial no puede ser negativo");
        }
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    /**
     * Deposita una cantidad en la cuenta.
     * 
     * @param cantidad la cantidad a depositar; debe ser mayor que 0
     * @throws IllegalArgumentException si la cantidad es negativa o cero
     */
    public void depositar(double cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad a depositar debe ser mayor que cero");
        }
        saldo += cantidad;
    }

    /**
     * Retira una cantidad de la cuenta.
     * 
     * @param cantidad la cantidad a retirar; debe ser mayor que 0 y menor o igual al saldo
     * @throws IllegalArgumentException si la cantidad es negativa o excede el saldo
     */
    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad a retirar debe ser mayor que cero");
        }
        if (cantidad > saldo) {
            throw new IllegalArgumentException("Fondos insuficientes");
        }
        saldo -= cantidad;
    }

    /**
     * Devuelve el saldo actual de la cuenta.
     * 
     * @return el saldo actual
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Devuelve el nombre del titular de la cuenta.
     * 
     * @return el nombre del titular
     */
    public String getTitular() {
        return titular;
    }
}
