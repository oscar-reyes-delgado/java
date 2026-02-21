package ABSTRACT_FINAL;

public abstract class Empleado {
    protected String nombre;
    protected double salarioBase;

    public Empleado(String nombre, double salarioBase){
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    // Metodo final, no puede ser sobreescrito
    public final double calcularSalarioBase(){
        return salarioBase;
    }

    // Metodo abstracto:
    // No tiene implementacion
    // Obliga a las subclases a definirlo

    public abstract double calcularBono();

}
