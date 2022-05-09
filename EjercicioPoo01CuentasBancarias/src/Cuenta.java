
public class Cuenta {

    // ==============
    // === atributos ===
    // ==============
    
    private String titular;
    private double cantidad;        // lo que tengo 
    
    // =============================
    // === constructor | sin parámetros ===
    // =============================
    
    public Cuenta() {
        
    }
    
    // =============================
    // === constructor | con parámetros ===
    // =============================
    
    public Cuenta(String titular) {
        this.titular = titular;
    }
    
    // ====================
    // === getters & setters ===
    // ====================    
    // para poder acceder o modificar el valor de los atributos tipo private
    
    public String getTitular() {
        return titular;
    }
    
   public void setTitular(String titular) {
       this.titular = titular;
   }
   
   public double getCantidad() {
       return cantidad;
   }
   
   public void setCantidad(double cantidad) {
       this.cantidad = cantidad;
   }  
   
  // =============================
  // === métodos | propios de la clase ===
  // =============================
   
    // parámetro cantidad -> lo que ingreso
    public void ingresar (double cantidad) {
        // cuando la cantidad ingresada sea positiva es cuando realizo calculos | si es negativa no se hace nada
        if (cantidad > 0) {
            // lo que tengo = lo que tengo + lo que ingreso
            this.cantidad = this.cantidad + cantidad;
        }                      
    }
    
     public void retirar (double cantidad) {
         // si al restar la cantidad actual a la que queremos retirar es negativa
        if (this.cantidad - cantidad < 0) {            
            this.cantidad = 0;                          // poner la cuenta a 0
        } else {
            // la cantidad será lo que hay en la cuenta menos lo que quiero retirar
            this.cantidad = this.cantidad - cantidad;
        }
    }
     
     // === método | para mostrar el vlaor de los atributos | toString ===
     // devuelve un String con el valor de los atributos | siguiendo el formato
     // sobreescribe el método toString de la clase padre Object
    @Override
    public String toString() {
        return "Cuenta{" + "titular=" + titular + ", cantidad=" + cantidad + '}';
    }
     
     
     
}

