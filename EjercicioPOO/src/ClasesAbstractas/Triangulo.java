
package ClasesAbstractas;


public class Triangulo extends Figura{

     // ==============
    // === atributos ===
    // ==============
    private double lado;
    private double altura;
    
    // ================
    // === constructor ===
    // ================
    public Triangulo(String nombre, double lado, double altura) {
        super(nombre);
        this.lado = lado;
        this.altura = altura;
    }

    // ======================================================
    // === implementar los métodos abstractos de la clase padre Figura ===
    // ======================================================
    
    @Override
    public double area() {
        return (lado * altura) / 2;
    }

    @Override
    public double perimetro() {
        return lado * 3;
    }
    
    
    
    
}
