public class OperacionesBanco {
    /*El objeto se recibe como parametro\
    Java usa la referencia del objeto */

    public static void depositar(CuentaBancaria cuenta, double monto) {
        cuenta.setSaldo(cuenta.getSaldo() + monto);
    }

    public static void retirar(CuentaBancaria cuenta, double monto) {
        if (cuenta.getSaldo() >= monto) {
            cuenta.setSaldo(cuenta.getSaldo() - monto);
        } else {
            System.out.println("Fondos insuficientes para retirar.");
        }
    }

    public static void main(String[] args) {
        // Se crea el objeto CuentaBancaria
        CuentaBancaria cuenta = new CuentaBancaria("Juan Perez", 1000.0);
        cuenta.mostrarDatos();
        //Se envia el objeto como parametro a los metodos de OperacionesBanco
        depositar(cuenta, 500.0);
        System.out.println("\nDespués del depósito:");
        cuenta.mostrarDatos();
        retirar(cuenta, 200.0);
        System.out.println("\nDespués del retiro:");
        cuenta.mostrarDatos();
    }
}
