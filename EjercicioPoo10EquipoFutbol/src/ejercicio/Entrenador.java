
package ejercicio;

// === subclase | hereda de la clase Persona ===

public class Entrenador extends Persona{

    // ==============
    // === atributos ===
    // ==============
    private String estrategia;
    
    // ================
    // === constructor ===
    // ================
    public Entrenador(String estrategia, String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.estrategia = estrategia;
    }
    
    // ====================
    // === getters & setters ===
    // ====================
    public String getEstrategia() {
        return estrategia;
    }
    
    // ==================================================================================
    // === métodos abstractos | implementar/sobrescribir los métodos abstractos de la clase padre Persona ===
    // ==================================================================================
    @Override
    public void partidoFutbol() {
        // que rol cumple el "entrenador" en un partido de futbol
        System.out.println("Dirige un partido de fútbol");
    }
    
    @Override
    public void entrenamiento() {
        // que rol cumple el "entrenador" en un entrenamiento
        System.out.println("Dirige un entrenamiento");
    }
    
    // ==============
    // === métodos ===
    // ==============
    public void planificarEntrenamiento() {
        System.out.println("Planificar entrenamiento");
    }
    

    
}
