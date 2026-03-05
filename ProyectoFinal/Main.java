package ProyectoFinal;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Clase principal con Menú Interactivo Avanzado.
 * Realizamos la gestión dinámica de usuarios, catálogo y préstamos.
 */
public class Main {
    public static void main(String[] args) {
        Biblioteca tecmiLibrary = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        
        // Variable para controlar qué usuario está operando el sistema
        Usuario usuarioActivo = null; 

        System.out.println("Cargando base de datos del sistema...");

        // PRECARGA DE DATOS (Para no iniciar con el sistema en blanco)
        Material libro1 = new Libro("Clean Code", 101, 5, "Robert C. Martin");
        Material libro2 = new Libro("Java POO", 102, 3, "Deitel");
        Material revista1 = new Revista("National Geographic", 201, 10, 255);
        tecmiLibrary.registrarMaterial(libro1);
        tecmiLibrary.registrarMaterial(libro2);
        tecmiLibrary.registrarMaterial(revista1);
        
        Usuario oscar = new Usuario("Oscar Reyes", 7163611);
        tecmiLibrary.registrarUsuario(oscar);

        int opcion = 0;

        // CICLO PRINCIPAL DEL SISTEMA
        do {
            System.out.println("\n========================================");
            System.out.println("      SMART LIBRARY SYSTEM - MENU");
            System.out.println("========================================");
            // Mostrar estado del usuario
            if (usuarioActivo != null) {
                System.out.println("👤 USUARIO ACTIVO: " + usuarioActivo.getNombre() + " (ID: " + usuarioActivo.getIdUsuario() + ")");
            } else {
                System.out.println("👤 USUARIO ACTIVO: [Ninguno - Por favor seleccione uno]");
            }
            System.out.println("----------------------------------------");
            System.out.println("1. Seleccionar Usuario (Login)");
            System.out.println("2. Procesar Préstamo");
            System.out.println("3. Agregar Nuevo Material al Catálogo");
            System.out.println("4. Agregar Nuevo Usuario");
            System.out.println("5. Eliminar un Usuario");
            System.out.println("6. Ver Catálogo Completo");
            System.out.println("7. Salir del Sistema");
            System.out.print("➤ Selecciona una opción: ");

            try {
                opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer del 'Enter' (Evita saltos extraños)

                switch (opcion) {
                    case 1:
                        System.out.println("\n--- SELECCIONAR USUARIO ---");
                        System.out.print("Ingresa el ID del usuario (ej. 7163611): ");
                        int idLogin = scanner.nextInt();
                        Usuario encontrado = tecmiLibrary.buscarUsuario(idLogin);
                        
                        if (encontrado != null) {
                            usuarioActivo = encontrado;
                            System.out.println("[✓] ¡Bienvenido, " + usuarioActivo.getNombre() + "!");
                        } else {
                            System.out.println("[X] Usuario no encontrado. Regístralo primero en la opción 4.");
                        }
                        break;

                    case 2:
                        System.out.println("\n--- PROCESAR PRÉSTAMO ---");
                        if (usuarioActivo == null) {
                            System.out.println("[!] ERROR: Debes seleccionar un usuario activo (Opción 1) antes de pedir un préstamo.");
                        } else {
                            System.out.print("Ingresa el ID del material a prestar: ");
                            int idPrestamo = scanner.nextInt();
                            // El sistema verifica internamente el límite de 2 libros
                            tecmiLibrary.procesarPrestamo(idPrestamo, usuarioActivo.getIdUsuario());
                        }
                        break;

                    case 3:
                        System.out.println("\n--- AGREGAR MATERIAL ---");
                        System.out.println("1. Libro");
                        System.out.println("2. Revista");
                        System.out.print("¿Qué tipo de material vas a registrar?: ");
                        int tipoMat = scanner.nextInt();
                        scanner.nextLine(); // Limpiar buffer

                        System.out.print("Título: ");
                        String titulo = scanner.nextLine();
                        System.out.print("ID numérico: ");
                        int idMat = scanner.nextInt();
                        System.out.print("Stock (Cantidad): ");
                        int stock = scanner.nextInt();
                        scanner.nextLine(); // Limpiar buffer

                        if (tipoMat == 1) {
                            System.out.print("Autor: ");
                            String autor = scanner.nextLine();
                            tecmiLibrary.registrarMaterial(new Libro(titulo, idMat, stock, autor));
                            System.out.println("[✓] Libro agregado al catálogo.");
                        } else if (tipoMat == 2) {
                            System.out.print("Número de Edición: ");
                            int edicion = scanner.nextInt();
                            tecmiLibrary.registrarMaterial(new Revista(titulo, idMat, stock, edicion));
                            System.out.println("[✓] Revista agregada al catálogo.");
                        } else {
                            System.out.println("[X] Tipo no válido.");
                        }
                        break;

                    case 4:
                        System.out.println("\n--- REGISTRAR USUARIO ---");
                        System.out.print("Nombre completo: ");
                        String nombreNuevo = scanner.nextLine();
                        System.out.print("ID numérico (Matrícula): ");
                        int idNuevo = scanner.nextInt();
                        
                        tecmiLibrary.registrarUsuario(new Usuario(nombreNuevo, idNuevo));
                        System.out.println("[✓] Usuario " + nombreNuevo + " registrado con éxito.");
                        break;

                    case 5:
                        System.out.println("\n--- ELIMINAR USUARIO ---");
                        System.out.print("Ingresa el ID del usuario a dar de baja: ");
                        int idBorrar = scanner.nextInt();
                        
                        // Prevención: Si borramos al usuario que está activo, cerramos su sesión
                        if (usuarioActivo != null && usuarioActivo.getIdUsuario() == idBorrar) {
                            usuarioActivo = null;
                        }
                        tecmiLibrary.eliminarUsuario(idBorrar);
                        break;

                    case 6:
                        System.out.println("\n--- CATÁLOGO DE LA BIBLIOTECA ---");
                        tecmiLibrary.mostrarCatalogo();
                        break;

                    case 7:
                        System.out.println("\nGuardando datos en memoria... ¡Hasta luego!");
                        break;

                    default:
                        System.out.println("\n[!] Opción no válida. Intenta con un número del 1 al 7.");
                }
            } catch (InputMismatchException e) {
                System.out.println("\n[!] Error: Formato incorrecto. Debes ingresar números enteros en los IDs y opciones.");
                scanner.nextLine(); // Limpiamos el error del teclado para que no se haga un ciclo infinito
            }

        } while (opcion != 7);

        scanner.close();
    }
}