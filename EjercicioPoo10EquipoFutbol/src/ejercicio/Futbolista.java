
package ejercicio;

// === subclase | hereda de la clase Persona ===

public class Futbolista extends Persona{

    // ==============
    // === atributos ===
    // ==============
    private int dorsal;
    private String posicion;
    
    // ================
    // === constructor ===
    // ================
    public Futbolista(int dorsal, String posicion, String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.posicion = posicion;
    }
    
    // ====================
    // === getters & setters ===
    // ====================
    public int getDorsal() {
        return dorsal;
    }

    public String getPosicion() {
        return posicion;
    }
    
    // ==================================================================================
    // === métodos abstractos | implementar/sobrescribir los métodos abstractos de la clase padre Persona ===
    // ==================================================================================
    @Override
    public void partidoFutbol() {
        // que rol cumple el "futbolista" en un partido de fútbol
        System.out.println("Juega el partido de fútbol");
    }
    
    @Override
    public void entrenamiento() {
        // que rol cumple el "futbolista" en un entrenamiento
        System.out.println("Entrena");
    }
    
    // ==============
    // === métodos ===
    // ==============
    public void entrevista() {
        System.out.println("Da una entrevista");
    }
    
    
}
