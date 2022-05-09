package ejercicio;

// === la clase Repartidorl hereda de Empleado sus propiedades y métodos ===
public class Repartidor extends Empleado {

    // ========================
    // === propiedades/atributos ===
    // ========================
    private String zona;

    // ================
    // === constructor ===
    // ================
    public Repartidor(String zona, String nombre, int edad, double salario) {
        // iniciar atributos clase padre/superclase
        super(nombre, edad, salario);
        this.zona = zona;
    }

    // ====================
    // === getters & setters ===
    // ====================
    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    // ==============
    // === métodos ===
    // ==============
    // === toString ===
    @Override
    public String toString() {
        // acceder al método toString de la superclase
        System.out.println(super.toString());
        return "\nZona: " + zona;
    }

    // === implementar métodos abstractos | de la clase padre ===
    @Override
    public boolean plus() {
        // El repartidor, si tiene menos de 25 años y reparte en "Sevilla", recibirá el PLUS.
        // super -> hace referencia a la superclase | para poder acceder a los atributos y métodos de la clase padre
        if (super.getEdad() < 25 && this.zona.equalsIgnoreCase("Sevilla")) {
            // asignar nuevo salario
            double nuevoSalario = super.getSalario() + super.PLUS;
            // establecerlo
            super.setSalario(nuevoSalario);
            System.out.println("\nSe le ha añadido el PLUS al empleado: " + super.getNombre());
            System.out.println("Su salario acutal es: " + nuevoSalario);
            return true;
        } else {
            System.out.println("\nEl empleado no cumple con los requisitos para el PLUS.");
            return false;
        }
    }

}
