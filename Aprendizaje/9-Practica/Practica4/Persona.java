public class Persona {
    String nombre;
    int edad;    

    void saludar(){
        System.out.println("Hola, mi nombre es "+ nombre + "y tengo " + edad + " años");
    }
    
    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.nombre = "Juan";
        p1.edad = 30;

        p1.saludar();
    }
}
