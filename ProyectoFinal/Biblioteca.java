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
}