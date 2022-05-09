
public class Vehiculo {

    // ==============
    // === atributos ===
    // ==============
    private String numBastidor;
    private double peso;
    
    // =====================
    // === constructor | vacio ===
    // =====================
    public Vehiculo() {
        
    }
    
    // ==========================
    // === constructor | parámetros ===
    // ==========================
    public Vehiculo(String numBastidor, int peso) {
        this.numBastidor = numBastidor;
        this.peso = peso;
    }
    
    // ====================
    // === getters & setters ===
    // ====================
    public String getNumBastidor() {
        return numBastidor;
    }

    public void setNumBastidor(String numBastidor) {
        this.numBastidor = numBastidor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    // ===================
    // === método toString ===
    // ===================
    @Override
    public String toString() {
        return "Vehiculo {" + "numBastidor=" + numBastidor + ", peso=" + peso + '}';
    }
    
    // =====================
    // === métodos de clase ===
    // =====================
    public double impuestoBase() {
        return peso * 0.45;
    }
    
    
    
    
    
    
    
}
