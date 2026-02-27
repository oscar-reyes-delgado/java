package RetoFinal;

import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private int idUsuario;
    // Agregación: Un usuario tiene una lista de materiales[cite: 87, 142].
    private ArrayList<Material> materialesEnPoder;

    public Usuario(String nombre, int idUsuario) {
        this.nombre = nombre;
        this.idUsuario = idUsuario;
        this.materialesEnPoder = new ArrayList<>();
    }

    // Método que devuelve un booleano para validar el límite de 2 libros[cite: 52, 129].
    public boolean tieneEspacio() {
        return materialesEnPoder.size() < 2;
    }

    public void recibirMaterial(Material m) {
        materialesEnPoder.add(m);
    }

    public String getNombre() { return nombre; }
    public int getIdUsuario() { return idUsuario; }
}