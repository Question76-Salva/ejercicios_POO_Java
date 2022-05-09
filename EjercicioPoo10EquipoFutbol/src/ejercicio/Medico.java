package ejercicio;

// === subclase | hereda de la clase Persona ===
public class Medico extends Persona {

    // ==============
    // === atributos ===
    // ==============
    private String titulacion;
    private int aniosExperiencia;

    // ================
    // === constructor ===
    // ================
    public Medico(String titulacion, int aniosExperiencia, String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    // ====================
    // === getters & setters ===
    // ====================
    public String getTitulacion() {
        return titulacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    // ==================================================================================
    // === métodos abstractos | implementar/sobrescribir los métodos abstractos de la clase padre Persona ===
    // ==================================================================================
    @Override
    public void partidoFutbol() {
        // que rol cumple el "médico" en un partido de futbol
        System.out.println("Da asistencia en un partido de fútbol");
    }
    
    @Override
    public void entrenamiento() {
        // que rol cumple el "médico" en un entrenamiento
        System.out.println("Da asistencia en un entrenamiento");
    }
        
    // ==============
    // === métodos ===
    // ==============
    public void curarLesion() {
        System.out.println("Curar lesión");
    }
}
