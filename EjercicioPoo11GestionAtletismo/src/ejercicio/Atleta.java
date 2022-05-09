
package ejercicio;

public class Atleta {

    // =========================
    // === propiedades | atributos ===
    // =========================
    private int numeroAtleta;
    private String nombre;
    float tiempoCarrera;    
    
    // ================
    // === constructor ===
    // ================
    public Atleta(int numeroAtleta, String nombre, float tiempoCarrera) {
        this.numeroAtleta = numeroAtleta;
        this.nombre = nombre;
        this.tiempoCarrera = tiempoCarrera;
    }

        
    // ====================
    // === getters & setters ===
    // ====================
    public float getTiempoCarrera() {
        return tiempoCarrera;
    }
    
    // ==============
    // === métodos ===
    // ==============
    public String mostrarDatosGanador() {
        return "Número de atleta: " + numeroAtleta + "\nNombre del atleta: " + nombre + "\nTiempo de carrera: " + tiempoCarrera + "\n"; 
    }
}


/*
    ====================
    === Gestión atletismo ===
    ====================

Para una carrera de atletismo, se debe gestionar una serie de atletas caracterizados por su número de atleta, nombre
y tiempo de carrera, al final el programa debe mostrar los datos del atleta ganador de la carrera.

*/