
public class Nacionalidad {

    // ==========================
    // === concepto de composicón ===
    // ==========================
    // composicón es la capacidad que tiene una clase de tener atributos que son 'objetos' de otra clase
    // necesito guardar información sobre la nacionalidad de los empleados (clase Empleado), esa nacionalidad son objetos/entidades de las que necesto
    // almacenar un: codigo, nombreNacionalidad 
    // vamos a hacer composición en la clase Empleado | de tal forma que un Empleado también tenga una Nacionalidad
    // necesito crear la clase Nacionalidad para poder crear objetos de esa entidad
    
    // ==========================
    // === atributos | encapsulación ===
    // ==========================
    // para establecer las propiedades que van a tener los empleados | dni - nombre - salario
    // los atributos suelen ser private
    private int codigo;
    private String nombre;
    
    // =============================
    // === constructor | sin parámetros ===
    // =============================
    public Nacionalidad() {
        
    }
    
    // =============================
    // === constructor | con parámetros ===
    // =============================
    // para inicializar el valor de los atributos | recibe parámetros para inicializar el objeto al instanciarlo   
    // this -> para referenciar a los atributos dentro de una clase, o para referenciar a otro método dentro de una clase
    public Nacionalidad(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
    
    // ================================
    // === getters & setters | encapsulación ===
    // ================================
    // getter -> obtener el valor de un determinado atributo
    // setter -> establecer el valor de un determinado atributo
    public int getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // =================================================
    // === método toString | para devolver el valor de los atributos ===
    // =================================================
    @Override
    public String toString() {
        return "Nacionalidad{" + "codigo=" + codigo + ", nombre=" + nombre + '}';
    }
    
}
