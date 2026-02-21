import java.util.Scanner;

public class MenuBanco {

    public static void depositar(CuentaBancaria cuenta, double monto) {
        cuenta.setSaldo(cuenta.getSaldo() + monto);
    }

    public static void retirar(CuentaBancaria cuenta, double monto) {
        if (cuenta.getSaldo() >= monto) {
            cuenta.setSaldo(cuenta.getSaldo() - monto);
        } else {
            System.out.println("--- Fondos insuficientes para retirar. ---");
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // Creamos la cuenta inicial
        CuentaBancaria cuenta = new CuentaBancaria("Juan Perez", 1000.0);
        
        int opcion = 0;
        double monto;

        while (opcion != 4) {
            System.out.println("\n--- CAJERO AUTOMÁTICO ---");
            System.out.println("1. Ver saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    cuenta.mostrarDatos();
                    break;
                case 2:
                    System.out.print("Ingresa el monto a depositar: ");
                    monto = teclado.nextDouble();
                    depositar(cuenta, monto);
                    System.out.println("Depósito realizado con éxito.");
                    break;
                case 3:
                    System.out.print("Ingresa el monto a retirar: ");
                    monto = teclado.nextDouble();
                    retirar(cuenta, monto);
                    break;
                case 4:
                    System.out.println("Saliendo del sistema... ¡Adiós!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
        teclado.close();
    }
}