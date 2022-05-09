
public class Fecha {

    // ==============
    // === atributos ===
    // ==============
    private int dia;
    private int mes;
    private int anio;
    
    // =============================
    // === constructor | sin parámetros ===
    // =============================
    public Fecha() {
        
    }
    
    // =============================
    // === constructor | con parámetros ===
    // =============================
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    
    // ====================
    // === getters & setters ===
    // ====================
    public int getDia() {
        return this.dia;
    }
    
    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    // ===================
    // === método toString ===
    // ===================
    @Override
    public String toString() {
        String resultado = "";
        if (dia < 10) {
            resultado = resultado + "0" + dia;
        } else {
            resultado = resultado + dia;
        }
        resultado = resultado + "/";
        if (mes < 10) {
            resultado = resultado + "0" + mes;
        } else {
            resultado += mes;
        }
        resultado += "/" + anio;
        
        return resultado;
    }
    
    
}
