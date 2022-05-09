/*
    === herencia ===  la clase Informatico hereda atributos y métodos de Empleado
*/
public class Informatico extends Empleado{

    // =====================
    // === atributos | propios ===
    // =====================
    private String lenguajeProgramacion;
    
    // ================
    // === constructor ===
    // ================
    public Informatico(String dni, String nombre, double salario, Nacionalidad nacionalidad, String lenguajeProgramacion) {
        super(dni, nombre, salario, nacionalidad);                           // invocar atributos de la clase padre Empleado
        this.lenguajeProgramacion = lenguajeProgramacion;         // atributo propio clase Informatico
    }
    
    // ====================
    // === getters & setters ===
    // ====================
    public String getLenguajeProgramacion() {
        return lenguajeProgramacion;
    }

    public void setLenguajeProgramacion(String lenguajeProgramacion) {
        this.lenguajeProgramacion = lenguajeProgramacion;
    }
    
    // ==================================================
    // === método toString | para devolver el valor de los atributos  ===
    // ==================================================
    @Override
    public String toString() {
        // super.toString() -> invoca al toString de la clase padre
        return super.toString() +  "Informatico{" + "lenguajeProgramacion=" + lenguajeProgramacion + '}';
    }
    
    // ==============
    // === métodos ===
    // ==============
    public void decirLenguajeDominante() {
        System.out.println("El lenguaje que domino es: " + lenguajeProgramacion);
    }
    
    // sobrescribir método | de la clase padre | aumentar salario en 100
    public void incrementarSalario(double salario) {
        super.setSalario(super.getSalario() + 100 + salario);
    }
    
    
    
    
    
}
