package Aprendizaje.CodigosDeClase;
public class Persona {

    private String nombre;
    private int edad;

    //Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //Getter - Permite obtener el nombre
    public String getNombre() {
        return nombre;
    }

    //Setter - permite modificar el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Getter para edad
    public int getEdad() {
        return edad;
    }

    //Setter con validacion
    public void setEdad(int edad) {
        if (edad > 0) { //Validamos que la edad sea correcta
            this.edad = edad;
        }
    }

    // Metodo para mostrar la informacion de la persona
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}