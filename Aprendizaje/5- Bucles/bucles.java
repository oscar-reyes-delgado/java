import java.util.Scanner;
public class bucles {
    public static void main(String[] args) {
        // Bucle while
        System.out.println("Bucle while");
        System.out.print("Ingesa un numero limite: ");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int inicio = 0;
        while (inicio < (numero + 1)){
            System.out.println("Vuelta: "+ inicio);
            inicio += 1;
        }
        System.out.println("Final del programa");

        // Bucle do-while
        System.out.println("\n================================================================");
        System.out.println("                    Bucle do-while");
        
        String fina;
        String texto;
        sc.nextLine();
        System.out.println("================================================================");
        do{
            fina = "Nariz";
            System.out.println("\nEste bucle no va a parar hasta que escribas la palabra: Nariz\n");
            System.out.print("Escribe: ");
            texto = sc.nextLine();
            
        } while(!fina.equals(texto));
        System.out.println("Has escrito la palabra correcta, fin del programa.");
        System.out.println("================================================================");
        sc.close();
    }
}


