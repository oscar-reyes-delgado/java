import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe tu nombre aqui bro: ");
        String nombre = sc.nextLine();
        System.out.println("Que buen nombre tienes "+nombre);
        int edad = 0;
        edad = edad(sc, edad);
        System.out.println("Bro estas bien viejo, "+ edad + "??");
    }

    public static int edad(Scanner scanner, int edad){
        System.out.println("A continuacion vas a ingresar tu edad,");
        System.out.println("no se va a completar hasta que ingreses");
        System.out.println("un numero valido.");
        do{
            System.out.print("Escribe tu edad: ");
            edad = scanner.nextInt();}
        while(edad >0 & edad <100);
        return edad;
    }

}
