package ProyectoFinal;

// 'abstract' impide crear objetos genéricos de "Material". 
// Obliga a definir las hijas como Libro o Revista.
public abstract class Material {
    // Encapsulamiento: Atributos privados para proteger la integridad de los datos.
    private String titulo;
    private int id;
    private int stock;

    public Material(String titulo, int id, int stock) {
        // 'this' diferencia el atributo de la clase del parámetro recibido.
        this.titulo = titulo;
        this.id = id;
        this.stock = stock;
    }

    // Métodos de acceso (Getters) necesarios para leer datos privados.
    public String getTitulo() { return titulo; }
    public int getId() { return id; }
    public int getStock() { return stock; }
    
    // Método para modificar el stock de forma controlada.
    public void setStock(int stock) { this.stock = stock; }

    // Método abstracto: Polimorfismo puro. Cada hijo decidirá cómo mostrarse.
    public abstract void mostrarDetalles();
}