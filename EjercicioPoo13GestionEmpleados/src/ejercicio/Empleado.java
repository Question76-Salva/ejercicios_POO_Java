
package ejercicio;

// === clase abstracta "Empleado" | de la cual herendan las clases "Comercial" y "Repartidor" | jerarquía de clases ===s

public abstract class Empleado {

    // ========================
    // === propiedades/atributos ===
    // ========================
    private String nombre;
    private int edad;
    private double salario;
    
    // === constante ===
    public final double PLUS = 300;  
    
    // ================
    // === constructor ===
    // ================
    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    // ==============
    // === métodos ===
    // ==============
    
    // === toString ===
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", \nEdad: " + edad + ", \nSalario: " + salario + ", \nPLUS: " + PLUS;
    }
    
    // === método abstracto | sólo se define | se implementa en sus clases hijas ===
    public abstract boolean plus(); 
    
}
