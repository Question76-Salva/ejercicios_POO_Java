
package ClasesAbstractas;

public class Cuadrado extends Figura{
    
    // ==============
    // === atributos ===
    // ==============
    private double lado;
    
    // ================
    // === constructor ===
    // ================
    public Cuadrado(String nombre, double lado) {
        super(nombre);
        this.lado = lado;
    }
    
    // ======================================================
    // === implementar los métodos abstractos de la clase padre Figura ===
    // ======================================================
    @Override
    public double area() {
        double area = lado * lado;
        return area;
    }

    @Override
    public double perimetro() {
        double perimetro = lado * 4;
        return perimetro;
    }
}
