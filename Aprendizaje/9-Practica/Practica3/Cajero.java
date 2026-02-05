import java.util.Scanner;
import com.sun.source.tree.SwitchTree;

public class Cajero {
    static double saldo = 1000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do{
            mostrarMenu();
            System.out.print("Ingresaa una opcion: ");
            opcion = sc.nextInt();

            switch(opcion){
                case 1 -> consultarSaldo();
                case 2 -> depositar(sc);
                case 3 -> retirar(sc);
                case 4 -> System.out.println("\nGracias por usar el cajero. Hasta luego!\n");
                default -> System.out.println("\nOpcion invalida. Intente de nuevo.\n");
            }
        } while (opcion!= 4);
    }

    public static void mostrarMenu(){
        System.out.println("======================");
        System.out.println("  CAJERO AUTOMATICO");
        System.out.println("======================");
        System.out.println("1. Consultar Saldo");
        System.out.println("2. Depositar dinero");
        System.out.println("3. Retirar Dinero");
        System.out.println("4. Salir");
        System.out.println("======================");
    }

    public static void consultarSaldo(){
        System.out.println("\nSu saldo actual es: $" + saldo + "\n");
    }

    public static void depositar(Scanner lector){
        System.out.print("\nMonto a depositar: $");
        double monto = lector.nextDouble();
        saldo += monto;

        System.out.println("Saldo actual: $" + saldo + "\n");
    }

    public static void retirar(Scanner lector){
        System.out.print("Monto a retirar: $");
        double monto = lector.nextDouble();
        if (monto <= saldo && monto> 0){
            saldo -= monto;
            System.out.println("Saldo actual: $"+ saldo +"\n");
        }
        else{
            System.out.println("\nSaldo insuficiente para realizar el retiro\n");
        }
    }

}

