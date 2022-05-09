package ejercicio;

public class Paquete {

    // ========================
    // === propiedades/atributos ===
    // ========================
    private int numeroPaquete;
    private String dni;
    private double peso;
    private int prioridad;                      // 0 = normal | 1 = alta | 2 = express

    // ================
    // === constructor ===
    // ================
    public Paquete(int numeroPaquete, String dni, double peso, int prioridad) {
        this.numeroPaquete = numeroPaquete;
        this.dni = dni;
        this.peso = peso;
        this.prioridad = prioridad;
    }

    // ====================
    // === getters & setters ===
    // ====================
     public int getNumeroPaquete() {
        return numeroPaquete;
    }

    public String getDni() {
        return dni;
    }

    public double getPeso() {
        return peso;
    }

    public int getPrioridad() {
        return prioridad;
    }
        
    // ==============
    // === métodos ===
    // ==============
    public String mostrarDatosPaquete() {
        return "Número paquete: " + numeroPaquete + " dni: " + dni + " peso: " + peso + " prioridad: " + prioridad;
    }

   
}

/*
        ====================================
        === Envio paquetes a distintas sucursales ===
        ====================================

Una empresa de envío de paquetes tiene varias sucursales en todo el país. Cada sucursal esta definida por su número
de sucursal, dirección y ciudad. Para calcular el precio que cuesta enviar cada paquete, las sucursales tienen en cuenta
el precio del paquete y la prioridad, sabiendo que se cobra un dólar/euro por kilo, 10 dólares/euros más si la prioridad es
alta y 20 si es express. Cada paquete enviado tendrá un número de referencia y el DNI de la persona que lo envía.

*/
