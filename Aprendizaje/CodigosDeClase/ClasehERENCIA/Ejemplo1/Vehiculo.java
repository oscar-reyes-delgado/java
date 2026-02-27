package Aprendizaje.CodigosDeClase.ClasehERENCIA.Ejemplo1;
// Clasee base o superclase
public class Vehiculo {
    String marca;
    int anio;

    //Constructor
    public Vehiculo(String marca, int anio) {
        this.marca = marca;
        this.anio = anio;
    }

    //Metodo comun
    public void acelerar(){
        System.out.println("El vehiculo esta acelerando");
    }

    public void mostrarInfo(){
        System.out.println("Marca: " + marca);
        System.out.println("Año: " + anio
        );
    }
}