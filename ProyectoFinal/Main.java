package ProyectoFinal;

/**
 * Clase principal donde realizamos las pruebas finales del sistema.
 * En esta versión incluimos todos los materiales de la tabla de pruebas.
 */
public class Main {
    public static void main(String[] args) {
        Biblioteca tecmiLibreria = new Biblioteca();

        System.out.println("--- INICIANDO SISTEMA DE BIBLIOTECA TECMILENIO ---");

        // 1. Creación de los 3 libros y la revista (Polimorfismo)
        // Realizamos la instanciación de todos los objetos de la tabla de pruebas.
        Material libro1 = new Libro("Clean Code", 101, 5, "Robert C. Martin");
        Material libro2 = new Libro("Java POO", 102, 3, "Deitel");
        Material libro3 = new Libro("Design Patterns", 103, 2, "Gang of Four");
        Material revista1 = new Revista("National Geographic", 201, 10, 255);

        // 2. Registro de materiales
        // Realizamos el registro en el catálogo dinámico de la biblioteca[cite: 160].
        tecmiLibreria.registrarMaterial(libro1);
        tecmiLibreria.registrarMaterial(libro2);
        tecmiLibreria.registrarMaterial(libro3);
        tecmiLibreria.registrarMaterial(revista1);
        
        // 3. Registro de Usuario
        Usuario oscar = new Usuario("Oscar Reyes", 7163611);
        tecmiLibreria.registrarUsuario(oscar);

        // 4. PRUEBA DE REGLAS DE NEGOCIO (Límite de 2 libros)
        // Realizamos la validación de que el sistema bloquee el tercer préstamo[cite: 153].
        System.out.println("\n--- Iniciando Pruebas de Préstamo ---");
        
        tecmiLibreria.procesarPrestamo(101, 7163611); // OK
        oscar.recibirMaterial(libro1);
        
        tecmiLibreria.procesarPrestamo(102, 7163611); // OK
        oscar.recibirMaterial(libro2);
        
        // Aquí probamos el libro que faltaba (Design Patterns)
        // El sistema debe decir que ya no hay espacio.
        tecmiLibreria.procesarPrestamo(103, 7163611); // DEBE FALLAR

        // 5. PRUEBA DE CONVERSIÓN DE OBJETOS (CASTING)
        // Realizamos el casting para demostrar el acceso a métodos específicos[cite: 159].
        System.out.println("\n--- Probando Conversión de Objetos (Casting) ---");
        tecmiLibreria.realizarCastingDeLibro(101);
        
        System.out.println("\n--- Fin de las pruebas ---");
    }
}