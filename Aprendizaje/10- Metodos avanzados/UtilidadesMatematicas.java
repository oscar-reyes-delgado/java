public class UtilidadesMatematicas {
    /* Metodos estaticos:
    - No necesita un objeto para ser invocado
    - Pertenece a la clase, no a una instancia */
    public static int calcularCuadrado(int numero){
        return numero * numero;
    }

    /*Este metodo verifica si un numero es par
    Usamos el operador modulo (%) */
    public static boolean esPar(int numero){
        return numero % 2 == 0;
    }

    /*El metodo ,aom ta,bien es estatico, pero no devuelve nada (void)
    Desde aqui se ejecuta el programa */

    public static void main(String[] args) {
        int n = 5;
        // Se llama directamente, sin crear objetos
        System.out.println("El cuadrado de " + n + " es: " + calcularCuadrado(n));
        System.out.println("¿Es par? " + esPar(n));
    }
}
