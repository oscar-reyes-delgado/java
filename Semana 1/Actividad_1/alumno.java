public class Alumno {
    private String nombre;
    private int semestre;
    private String matricula;
    private String carrera;

    public Alumno(String nombre, int semestre, String matricula, String carrera){
        this.nombre = nombre;
        this.semestre = semestre;
        this.matricula = matricula;
        this.carrera = carrera;
    }

    public void estudiar() {
        System.out.println();
        System.out.println(nombre + " esta estudiando para sus examenes");
        System.out.println();
    }

    public void mostrar_credencial(){
        System.out.println();
        System.out.println("================================");
        System.out.println("      Datos del alumno");
        System.out.println("================================");
        System.out.println("Nombre: " + nombre);
        System.out.println("Semestre: " + semestre);
        System.out.println("Matricula: " + matricula);
        System.out.println("Carrera: "+ carrera);
        System.out.println("================================");
        System.out.println();
    }

    public void asistencia(){
        System.out.println();
        System.out.println(nombre + " asistió a clase");
        System.out.println();
    }
}
