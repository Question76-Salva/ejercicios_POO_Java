
public class Combustion extends Vehiculo{

    // ==============
    // === atributos ===
    // ==============
    private int cilindrada;
    
     // =====================
    // === constructor | vacio ===
    // =====================
    public Combustion() {
        
    }
    
    // ==========================
    // === constructor | parámetros ===
    // ==========================
    public Combustion(String numBastidor, int peso, int cilindrada) {
        super(numBastidor, peso);
        this.cilindrada = cilindrada;
    }
    
    // ====================
    // === getters & setters ===
    // ====================
    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    // ===================
    // === método toString ===
    // ===================
    @Override
    public String toString() {
        // super.toString -> mostrar también la info de los atributos de la clase padre
        return super.toString() + " - Combustion{" + "cilindrada=" + cilindrada + '}';
    }
    
    // =====================
    // === métodos de clase ===
    // =====================
    @Override
    public double impuestoBase() {
        return super.impuestoBase() + (cilindrada * 3);
    }
    
    
    
}
