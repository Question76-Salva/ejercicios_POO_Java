package ejercicio;

// === superclase | clase abstracta ===

public abstract class Persona {

    // =================================================
    // === atributos | protected -> porque van a tener clases hijas ===
    // =================================================
    protected String nombre;
    protected String apellidos;
    protected int edad;
    
    // ================
    // === constructor ===
    // ================
    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    
    // ====================
    // === getters & setters ===
    // ====================
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }
    
    // ==============
    // === métodos ===
    // ==============
    public void viajar() {
        System.out.println("Viajar");
    }
    
    // ================================================================================
    // === métodos abstractos | para que las clases hijas los puedan implementar | aquí solo los definimos ===
    // ================================================================================
    public abstract void partidoFutbol();
    
    public abstract void entrenamiento();
    
    
            
            
            
}
