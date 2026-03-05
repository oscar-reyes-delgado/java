package ProyectoFinal;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Clase principal con Menú Interactivo.
 * Realizamos la integración de Scanner para controlar el flujo de la biblioteca.
 */
public class Main {
    public static void main(String[] args) {
        Biblioteca tecmiLibrary = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cargando base de datos del sistema...");

        // 1. Precarga de materiales y usuario (Lo que ya realizamos antes)
        Material libro1 = new Libro("Clean Code", 101, 5, "Robert C. Martin");
        Material libro2 = new Libro("Java POO", 102, 3, "Deitel");
        Material libro3 = new Libro("Design Patterns", 103, 2, "Gang of Four");
        Material revista1 = new Revista("National Geographic", 201, 10, 255);

        tecmiLibrary.registrarMaterial(libro1);
        tecmiLibrary.registrarMaterial(libro2);
        tecmiLibrary.registrarMaterial(libro3);
        tecmiLibrary.registrarMaterial(revista1);
        
        Usuario oscar = new Usuario("Oscar Reyes", 7163611);
        tecmiLibrary.registrarUsuario(oscar);

        int opcion = 0;

        // 2. Ciclo del Menú Principal
        do {
            System.out.println("\n=== SMART LIBRARY SYSTEM ===");
            System.out.println("1. Mostrar todos los detalles (Prueba Polimorfismo)");
            System.out.println("2. Procesar un Préstamo");
            System.out.println("3. Buscar Autor de Libro (Prueba Casting)");
            System.out.println("4. Salir del Sistema");
            System.out.print("Selecciona una opción: ");

            try {
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("\n--- Catálogo Actual ---");
                        libro1.mostrarDetalles();
                        libro2.mostrarDetalles();
                        libro3.mostrarDetalles();
                        revista1.mostrarDetalles();
                        break;

                    case 2:
                        System.out.println("\n--- Módulo de Préstamos ---");
                        System.out.print("Ingresa el ID del material (ej. 101, 102, 103, 201): ");
                        int idMat = scanner.nextInt();
                        // Usamos directamente tu ID para hacer la prueba más ágil
                        System.out.println("Procesando para el usuario ID: 7163611...");
                        tecmiLibrary.procesarPrestamo(idMat, 7163611);
                        
                        // Lógica sencilla para asignar el material en memoria si el ID coincide
                        if(idMat == 101) oscar.recibirMaterial(libro1);
                        else if(idMat == 102) oscar.recibirMaterial(libro2);
                        else if(idMat == 103) oscar.recibirMaterial(libro3);
                        else if(idMat == 201) oscar.recibirMaterial(revista1);
                        break;

                    case 3:
                        System.out.println("\n--- Módulo de Búsqueda Avanzada ---");
                        System.out.print("Ingresa el ID del libro para extraer su autor: ");
                        int idLibro = scanner.nextInt();
                        tecmiLibrary.realizarCastingDeLibro(idLibro);
                        break;

                    case 4:
                        System.out.println("\nCerrando sistema... ¡Hasta luego, " + oscar.getNombre() + "!");
                        break;

                    default:
                        System.out.println("\n[!] Opción no válida. Intenta de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("\n[!] Error: Debes ingresar un número entero.");
                scanner.next(); // Limpiamos el error del teclado para que no se cicle
            }

        } while (opcion != 4);

        scanner.close(); // Siempre es buena práctica cerrar el Scanner al final
    }
}