public class Division {
    public static void main(String[] args) {
        int numero = 10;
        int zero = 0;

        try{
            int resultado = numero/zero;
            System.out.println("El resultado es: "+ resultado);
        }
        catch(ArithmeticException e){
            System.out.println("Error: No se puede dividir entre 0");
        }
        // Este codigo es para demostrar el uso del manejo de excepciones
    }
}
