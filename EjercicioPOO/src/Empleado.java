/* clases y objetos */

public class Empleado {
    
    // ==========================
    // === atributos | encapsulación ===
    // ==========================
    // para establecer las propiedades que van a tener los empleados | dni - nombre - salario
    // los atributos suelen ser private
    private String dni;
    private String nombre;
    private double salario;
    
    // ================
    // === composicón ===
    // ================
    // vamos a hacer composición en la clase Empleado | de tal forma que un Empleado también tenga una Nacionalidad
    // necesito crear la clase Nacionalidad para poder crear objetos de esa entidad
    // mirar la clase Nacionalidad | para entender todo el proceso
    // también lo defino en el constructor de la clase Empleado, para que al crear una instacia tenga ese atributo de tipo Nacionalildad
    // y sus getters y setters en la clase Empleado también
    private Nacionalidad nacionalidad;
    
    // =====================
    // === atributos estáticos ===
    // =====================
    // no dependen de cada instancia | dependen de la clase | 'static'
    // que almacene cuantas instancias de la clase Empleado se han creado
    private static int numero = 0;
    
    // =============================
    // === constructor | sin parámetros ===
    // =============================
    // no recibe nada y no hace nada | inicializar los valores de los atributos por defecto
    public Empleado() {        
        // cada vez que cree un empleado voy a incrementar ese atributo 'numero' en 1
        numero++;
        // instanciar la entidad tipo Nacionalidad sin parametros | para que no salte una excepción
        // así ya sea con el constructor con o sin parámetros la nacionalidad va a estar siempre creada,
        // ya sea a partir de un objeto o sin parámetros
        nacionalidad = new Nacionalidad();
    }
    
    // =============================
    // === constructor | con parámetros ===
    // =============================
    // para inicializar el valor de los atributos | recibe parámetros para inicializar el objeto al instanciarlo   
    // this -> para referenciar a los atributos dentro de una clase, o para referenciar a otro método dentro de una clase
    public Empleado(String dni, String nombre, double salario, Nacionalidad nacionalidad) {
        this.dni = dni;                         // this.dni -> hace referencia al atributo | = dni -> hace referencia al parámetro
        this.nombre = nombre;         
        this.salario = salario;                      
        this.nacionalidad = nacionalidad;
        
        // cada vez que cree un empleado voy a incrementar ese atributo 'numero' en 1
        numero++;
    }
    
    // ==============
    // === métodos ===
    // ==============
    // para hacer operaciones con los empleados | los parámetros se pasan al 'invocar/llamar' al método
    // los métodos suelen ser public
    public void incrementarSalario(double incremento) {
        salario += incremento;
    }
    
    // =================================================
    // === método toString | para devolver el valor de los atributos ===
    // =================================================
    public String toString() {
        return this.dni + ", " + this.nombre + ", " + this.salario + ", " + this.nacionalidad.toString();
    }
    
    // ================================
    // === getters & setters | encapsulación ===
    // ================================
    // getter -> obtener el valor de un determinado atributo
    // setter -> establecer el valor de un determinado atributo
    public String getDni() {
        return this.dni;
    }
    
    public void setDni(String dni) {
        this.dni = dni;                             // como el parámetro se llama igual al atributo lo diferencio con el this
    }                                                     // this.dni -> atributo | dni -> parámetro  
    
    public Nacionalidad getNacionalidad() {
        return this.nacionalidad;
    }
    
    public void setNacionalidad(Nacionalidad nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
        
    // ==========================================
    // método para acceder al atributo estático 'numero' ===
    // ==========================================
    // si un método utiliza atributos estáticos ese método también tiene que ser estático
    public static int getNumero() {
        return numero;
    }
    
    

}
