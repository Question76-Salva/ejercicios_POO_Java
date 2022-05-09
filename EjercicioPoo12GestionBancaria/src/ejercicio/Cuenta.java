
package ejercicio;

public class Cuenta {

        // =========================
        // === propiedades | atributos ===
        // =========================
        private int numeroCuenta;
        private double saldo;
    
        // ================
        // === constructor ===
        // ================
        public Cuenta(int numeroCuenta, double saldo) {
            this.numeroCuenta = numeroCuenta;
            this.saldo = saldo;
        }
    
        // ====================
        // === getters & setters ===
        // ====================
        public int getNumeroCuenta() {
            return numeroCuenta;
        }
        
        public double getSaldo() {
            return saldo;
        }
        
        // ==============
        // === métodos ===
        // ==============
        public void ingresarDinero(double cantidad) {
            saldo += cantidad;
        }
        
        public void retirarDinero(double cantidad) {
            saldo -= cantidad;
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