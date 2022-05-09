
public abstract class Legislador extends Persona{

    // ==============
    // === atributos ===
    // ==============
    private String provincia;
    private String partido;
    private int numeroDespacho;
    
    // =====================
    // === constructor | vacio ===
    // =====================
    public Legislador() {
        this.provincia = "";
        this.partido = "";
    }
    
    // =============================
    // === constructor | con parámetros ===
    // =============================
    public Legislador(String nombre, String apellidos, int edad, boolean casado, String provincia, String partido, int numeroDespcho) {
        super(nombre, apellidos, edad, casado);
        this.provincia = provincia;
        this.partido = partido;
        this.numeroDespacho = numeroDespcho;
    }
    
    // ====================
    // === getters & setters ===
    // ====================
    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public int getNumeroDespacho() {
        return numeroDespacho;
    }

    public void setNumeroDespacho(int numeroDespacho) {
        this.numeroDespacho = numeroDespacho;
    }
    
    // =============
    // === toString ===
    // =============
    @Override
    public String toString() {
        // super.toString() -> muestra info del toString de la clase padre
        return super.toString() + " - Legislador {" + "provincia=" + provincia + ", partido=" + partido + ", numeroDespacho=" + numeroDespacho + '}';
    }
    
    // ====================
    // === método abstracto ===
    // ====================
    public abstract String getCamaraEnQueTrabaja();
    
}
