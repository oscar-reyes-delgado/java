/* 
Objetivo: Practicar el uso de métodos, entrada de datos con Scanner y control de flujo. Los ejercicios
van de nivel básico a nivel más avanzado. No se deben usar clases ni objetos propios todavía (solo
main y métodos).
Ejercicio 1. Conversión simple
Crea un programa que: - Pida al usuario un número. - Llame a un método que convierta metros a
centímetros. - Muestre el resultado en pantalla. Reglas: - El método debe recibir el valor y regresar el
resultado. - No debe imprimir dentro del método. */

import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Escribe tu cantidad en metros: ");
        double numero = lector.nextDouble();
        System.out.println("Su cantidad son: "+ metrosACentimetros(numero) + " cm");
        lector.close();
    }

    public static double metrosACentimetros(double numero){
        return numero * 100;
    }
}
