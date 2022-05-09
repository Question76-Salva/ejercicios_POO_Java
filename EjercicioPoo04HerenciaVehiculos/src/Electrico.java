
public class Electrico extends Vehiculo{

    // ==============
    // === atributos ===
    // ==============
    private double precio;
    
    // =====================
    // === constructor | vacio ===
    // =====================
    public Electrico() {
        
    }
    
    // ==========================
    // === constructor | parámetros ===
    // ==========================
    public Electrico(String numBastidor, int peso, double  precio) {
        super(numBastidor, peso);
        this.precio = precio;
    }
    
    // ====================
    // === getters & setters ===
    // ====================
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    // ===================
    // === método toString ===
    // ===================
    @Override
    public String toString() {
        // super.toString -> mostrar también la info de los atributos de la clase padre
        return super.toString() +  " - Electrico{" + "precio=" + precio + '}';
    }
    
    // =====================
    // === métodos de clase ===
    // =====================
    @Override
    public double impuestoBase() {
        // super.impuestoBase() -> de la clase padre vehiculo
        return super.impuestoBase() +  0.09 * precio;
    }
    
    
}
