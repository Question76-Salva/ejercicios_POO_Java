
public class Persona {

    // ==============
    // === atributos ===
    // ==============
    private String nombre;
    private String apellidos;
    Fecha fechaNacimiento;
    
    // =============================
    // === constructor | con parámetros ===
    // =============================
    public Persona(String nombre, String apellidos, Fecha fechaNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
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

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    // ===================
    // === método toString ===
    // ===================
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNacimiento=" + fechaNacimiento.toString() + '}';
    }
    
    
}
