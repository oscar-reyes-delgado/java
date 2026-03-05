package ProyectoFinal;
import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Material> catalogo = new ArrayList<>();
    private ArrayList<Usuario> miembros = new ArrayList<>();

    public void registrarMaterial(Material m) { catalogo.add(m); }
    public void registrarUsuario(Usuario u) { miembros.add(u); }

    // IMPLEMENTACIÓN DE CONVERSIÓN DE OBJETOS (CASTING) 
    public void realizarCastingDeLibro(int id) {
        for (Material m : catalogo) {
            if (m.getId() == id) {
                // 'instanceof' verifica el tipo real antes de convertir.
                if (m instanceof Libro) {
                    // CASTING: Convertimos Material a Libro para usar getAutor().
                    Libro miLibro = (Libro) m;
                    System.out.println("Casting exitoso. El autor es: " + miLibro.getAutor());
                }
            }
        }
    }

    public void procesarPrestamo(int idMaterial, int idUsuario) {
        for (Usuario u : miembros) {
            if (u.getIdUsuario() == idUsuario) {
                if (u.tieneEspacio()) {
                    System.out.println("✓ Préstamo autorizado para: " + u.getNombre());
                } else {
                    System.out.println("X Error: Límite de 2 libros alcanzado para " + u.getNombre());
                }
            }
        }
    }

    // 1. Busca un usuario y nos lo devuelve para seleccionarlo
    public Usuario buscarUsuario(int idUsuario) {
        for (Usuario u : miembros) {
            if (u.getIdUsuario() == idUsuario) return u;
        }
        return null;
    }

    // 2. Elimina un usuario de la lista
    public void eliminarUsuario(int idUsuario) {
        Usuario u = buscarUsuario(idUsuario);
        if (u != null) {
            miembros.remove(u);
            System.out.println("[✓] Usuario eliminado correctamente.");
        } else {
            System.out.println("[X] Error: Usuario no encontrado.");
        }
    }

    // 3. Imprime todo el catálogo dinámicamente
    public void mostrarCatalogo() {
        if (catalogo.isEmpty()) {
            System.out.println("El catálogo está vacío.");
            return;
        }
        for (Material m : catalogo) {
            m.mostrarDetalles(); // ¡Polimorfismo en acción!
        }
    }
}