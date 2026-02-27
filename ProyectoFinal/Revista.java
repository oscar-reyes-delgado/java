package ProyectoFinal;

// Aplicamos Herencia: Revista hereda de Material[cite: 153].
public class Revista extends Material {
    private int numeroEdicion;

    public Revista(String titulo, int id, int stock, int numeroEdicion) {
        super(titulo, id, stock); // Pasamos los datos al constructor del padre.
        this.numeroEdicion = numeroEdicion;
    }

    // Aquí aplicamos Polimorfismo: la revista muestra su edición, no un autor[cite: 159].
    @Override
    public void mostrarDetalles() {
        System.out.println("[REVISTA] ID: " + getId() + " | Título: " + getTitulo() + " | Edición: #" + numeroEdicion + " | Stock: " + getStock());
    }
}