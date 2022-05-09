
public class Senador extends Legislador{

    // =====================
    // === constructor | vacio ===
    // =====================
    public Senador() {
        
    }
    
    // =============================
    // === constructor | con parámetros ===
    // =============================
    // parámetros de las clases padres de la jerarquía | Persona y Legislador 
    public Senador(String nombre, String apellidos, int edad, boolean casado, String provincia, String partido, int numeroDespcho) {
        super(nombre, apellidos, edad, casado, provincia, partido, numeroDespcho);
    }
    
    // getters & setters -> no tiene sentido puesto que esta clase no tiene atributos
    // toString -> no tiene sentido puesto que esta clase no tiene atributos
    
    // =====================
    // === método abstracto ===
    // =====================
    @Override
    public String getCamaraEnQueTrabaja() {
        return "Trabaja en el senado.";
    }

}
