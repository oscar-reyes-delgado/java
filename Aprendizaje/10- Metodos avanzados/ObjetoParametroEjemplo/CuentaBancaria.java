public class CuentaBancaria {
    // Atributos encapsulados
    private String titular;
    private double saldo;

    // Constructor
    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Getter: Permite leer el saldo
    public double getSaldo() {
        return saldo;
    }

    // Setter: Permite modificar el saldo
    public void setSaldo(double Saldo) {
        this.saldo = Saldo;
    }

    // Metodo para mostrar la informacion de la cuenta
    public void mostrarDatos() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: $" + saldo);
    }
}