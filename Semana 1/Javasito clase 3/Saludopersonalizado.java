import java.util.Scanner;
public class Saludopersonalizado{
    
    public static void main(String[] args) {
        System.out.print("Oye dame tu nombre porfa, escribelo: ");
        Scanner escaner = new Scanner(System.in);
        String texto = escaner.nextLine();
        System.out.println("Hola " + texto);
        escaner.close();
    }
}