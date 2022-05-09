
package Interfaces;

public class Clase1 implements Interfaz1, Interfaz2{

    // === implementar tods los métodos abstractos de Interfaz1 ===
    @Override
    public void metodo1() {
        System.out.println("Implementado método 1");
    }

    @Override
    public String metodo2(int n) {
        return "hecho";
    }

    // === implementar tods los métodos abstractos de Interfaz2 ===
    @Override
    public void metodo3() {
        System.out.println("Implementado método 3");
    }

}
