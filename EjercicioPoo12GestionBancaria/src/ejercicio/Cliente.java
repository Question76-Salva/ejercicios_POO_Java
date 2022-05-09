package ejercicio;

public class Cliente {

    // =========================
    // === propiedades | atributos ===
    // =========================
    private String nombre;
    private String apellido;
    private String dni;

    // === array de objetos | array de tipo Cuentas ===
    Cuenta cuentas[];

    // ================
    // === constructor ===
    // ================
    public Cliente(String nombre, String apellido, String dni, Cuenta[] cuentas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cuentas = cuentas;
    }

    // ====================
    // === getters & setters ===
    // ====================
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    // ==============
    // === métodos ===
    // ==============
    public double consultar_saldo(int n) {
        // consultar saldo a través de la clase Cliente
        // n -> indice de la cuenta que quiero ver del array cuentas[]
        // getSaldo() -> método de la clase Cuenta | me devuelve el saldo
        return cuentas[n].getSaldo();
    }

    public void ingresar_dinero(int n, double cantidad) {
        // ingresar cantidad a través de la clase Cliente
        // n -> indice del array de cuentas | a que cuenta voy a ingresar dinero (depende de las n cuentas que haya)
        // cantidad -> cantidad que voy a ingresar
        cuentas[n].ingresarDinero(cantidad);
    }

    public void retirar_dinero(int n, double cantidad) {
        // ingresar cantidad a través de la clase Cliente
        // n -> indice del array de cuentas | a que cuenta voy a ingresar dinero (depende de las n cuentas que haya)
        // cantidad -> cantidad que voy a retirar
        cuentas[n].retirarDinero(cantidad);
    }

}


/*
        ====================
        === Gestión bancaria ===
        ====================

Programa para hacer gestiones en un banco, para lo cual tendremos 2 clases ( Cliente y Cuenta ). Considerar que un
cliente se caracteriza por su nombre, apellido y dni. El cliente puede consultar saldo, así como ingresar y retirar dinero
de sus cuentas. Además cada cuenta se caracteriza por un número de cuenta y un saldo.

*/
