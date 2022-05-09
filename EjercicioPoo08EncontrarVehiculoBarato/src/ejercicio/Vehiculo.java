
package ejercicio;

public class Vehiculo {

    // =========================
    // === propiedades | atributos ===
    // =========================
    private String marca;
    private String modelo;
    private float precio;
    
    // ================
    // === constructor ===
    // ================
    public Vehiculo (String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    
    // ====================
    // === getters & setters ===
    // ====================
    public float getPrecio() {
        return precio;
    }

    // ==============
    // === métodos ===
    // ==============
    public String mostrarDatos() {
        return "Marca: " + marca +"\nModelo: " + modelo + "\nPrecio: " + precio + "\n";
    }
            
    
}

/*
        ========================================
        === práctica | encontrar el vehículo más barato ===
        ========================================

Dada una serie de vehículos caracterizados por su marca, modelo y precio, imprimir las "propiedades del vehículo
más barato". Para ello, se deberán leer por teclado las características de cada vehículo y crear una clase que represente
a cada uno de ellos.

*/
