
public class Persona {

    // ==============
    // === atributos ===
    // ==============
    private String nombre;
    private String apellidos;
    private int edad;
    private boolean casado;
    
    // =====================
    // === constructor | vacio ===
    // =====================
    public Persona() {
        this.nombre = "";
        this.apellidos = "";
        casado = false;
    }
    
    // =============================
    // === constructor | con parámetros ===
    // =============================
    public Persona(String nombre, String apellidos, int edad, boolean casado) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.casado = casado;
    }
    
    // ====================
    // === getters & setters ===
    // ====================
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }
    
    // =============
    // === toString ===
    // =============
    @Override
    public String toString() {
        return "Persona {" + "nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", casado=" + casado + '}';
    }
    
    
    
    
}
