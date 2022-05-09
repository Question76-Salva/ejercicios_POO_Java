package ejercicio;

// === la clase Comeercial hereda de Empleado sus propiedades y métodos ===

public class Comercial extends Empleado{

    // ========================
    // === propiedades/atributos ===
    // ========================
    private double comision;
    
    // ================
    // === constructor ===
    // ================
    public Comercial(double comision, String nombre, int edad, double salario) {
        // iniciar atributos clase padre/superclase
        super(nombre, edad, salario);
        this.comision = comision;
    }
        
    // ====================
    // === getters & setters ===
    // ====================
    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }    
    
    // ==============
    // === métodos ===
    // ==============

    // === toString ===
    @Override
    public String toString() {
        // acceder al método toString de la superclase
        System.out.println(super.toString()); 
        return "\nComisión: " +  comision;
    }
    
    // === implementar métodos abstractos | de la clase padre ===
    @Override
    public boolean plus() {
        //  El comercial, si tiene más de 30 años y cobra una comisión de más de 200€, se le aplicará el PLUS
        // super -> hace referencia a la superclase | para poder acceder a los atributos y métodos de la clase padre
        if (super.getEdad() > 30 && this.comision > 200) {
            // asignar nuevo salario
            double nuevoSalario = super.getSalario() + super.PLUS;
            // establecerlo
            super.setSalario(nuevoSalario);
            System.out.println("\nSe le ha añadido el PLUS al empleado: " + super.getNombre());
            System.out.println("Su salario acutal es: " + nuevoSalario);
            System.out.println("");
            return true;
        } else {
            System.out.println("\nEl empleado no cumple con los requisitos para el PLUS.");
            return false;
        }
    }
    
    
    

    

    
}
