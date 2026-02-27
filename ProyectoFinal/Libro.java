package ProyectoFinal;

// 'extends' aplica la Herencia de Material.
public class Libro extends Material {
    private String autor;

    public Libro(String titulo, int id, int stock, String autor) {
        // 'super' inicializa los atributos en la clase padre[cite: 158].
        super(titulo, id, stock);
        this.autor = autor;
    }

    public String getAutor() { return autor; }

    // '@Override' es Polimorfismo: redefinimos el comportamiento para un Libro.
    @Override
    public void mostrarDetalles() {
        System.out.println("[LIBRO] ID: " + getId() + " | Título: " + getTitulo() + " | Autor: " + autor + " | Stock: " + getStock());
    }
}