/*
    === herencia ===  la clase Abogado hereda atributos y métodos de Empleado
*/

public class Abogado extends Empleado {

    // =====================
    // === atributos | propios ===
    // =====================
    private int numeroColegiado;
    
    // ================
    // === constructor ===
    // ================
    public Abogado(String dni, String nombre, double salario, Nacionalidad nacionalidad, int numeroColegiado) {
         super(dni, nombre, salario, nacionalidad);                           // invocar atributos de la clase padre Empleado
         this.numeroColegiado = numeroColegiado;                        // atributo propio clase Informatico
    }
    
    // ====================
    // === getters & setters ===
    // ====================
    public int getNumeroColegiado() {
        return numeroColegiado;
    }

    public void setNumeroColegiado(int numeroColegiado) {
        this.numeroColegiado = numeroColegiado;
    }
    
    // ==================================================
    // === método toString | para devolver el valor de los atributos  ===
    // ==================================================
    @Override
    public String toString() {
        return super.toString() + "- Abogado{" + "numeroColegiado=" + numeroColegiado + '}';
    }
    
    
    
    
}
