package ejercicio;

public class Sucursal {

    // ========================
    // === propiedades/atributos ===
    // ========================
    private int numeroSucursal;
    private String direccion;
    private String ciudad;

    // ================
    // === constructor ===
    // ================
    public Sucursal(int numeroSucursal, String direccion, String ciudad) {
        this.numeroSucursal = numeroSucursal;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    // ====================
    // === getters & setters ===
    // ====================
    public int getNumeroSucursal() {
        return numeroSucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    // ==============
    // === métodos ===
    // ==============
    public String mostrarDatosSucursal() {
        return "Número sucursal: " + numeroSucursal + " dirección: " + direccion + " ciudad: " + ciudad;
    }
    
    public double calcular_precio(Paquete t) {
        
        // === precio que cuesta enviar cada paquete ===        
        // precio final -> precio + prioridad | 1$ por kilo
        double precio; 
        precio = t.getPeso();
        
        if (t.getPrioridad() == 1) {
            // prioridad alta | 10$
            precio += 10;
        }
        
        if (t.getPrioridad() == 2) {
            // prioridad express | 20$
            precio += 20;
        }
        
        // === retornar precio ===s
        return precio;
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
