public class Producto {
    // Atributos privados según requerimiento 
    private String descripcion;
    private String codigo;
    private String tipo;
    private Double costo;
    private Double impuesto;

    // Métodos de acceso (get) públicos 
    public String getDescripcion() { return descripcion; }
    public String getCodigo() { return codigo; }
    public String getTipo() { return tipo; }
    public Double getCosto() { return costo; }
    public Double getImpuesto() { return impuesto; }

    // Métodos establecedores (set) públicos 
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public void setCodigo(String codigo) { this.codigo = codigo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public void setCosto(Double costo) { this.costo = costo; }
    public void setImpuesto(Double impuesto) { this.impuesto = impuesto; }

    // Método para mostrar todos los atributos
    public void muestraProducto() {
        System.out.println("Descripción: " + descripcion);
        System.out.println("Código: " + codigo);
        System.out.println("Tipo: " + tipo);
        System.out.println("Costo: $" + costo);
        System.out.println("Impuesto: " + impuesto + "%");
    }

    // Método funcional para calcular el precio final 
    public double calcularPrecio(double utilidad) {
        // Al costo se le suma el porcentaje de utilidad 
        double precioAntesDeImpuestos = costo + (costo * (utilidad / 100)); 
        // Se le suma el impuesto al precio con utilidad 
        double totalImpuesto = precioAntesDeImpuestos * (impuesto / 100);
        return precioAntesDeImpuestos + totalImpuesto;
    }
}
>>>>>>> 667843243d0a8dbd951581c8e92e237ace128aeb
