
package ClasesAbstractas;

public abstract class Figura {

    // ==============
    // === atributos ===
    // ==============
    private String nombre;
    
    // ================
    // === constructor ===
    // ================
    public Figura(String nombre) {
        this.nombre = nombre;
    }
    
    // ====================
    // === getters & setters ===
    // ====================
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // ============================
    // === métodos | propios de clase ===
    // ============================
    public void decirNombre() {
        System.out.println("La figura es un: " + nombre);
    }   
    
    // =====================================================
    // === métodos abstractos | para invocarlos desde las clases hijas ===
    // =====================================================
    
    // aquí, en la clase padre, NO se definen los métodos abstractos, sólo se declaran
    // los métodos abstractos serán definidos en las clases hijas
    
    public abstract double area(); 
    
    public abstract double perimetro();    
    
}

/*
    =====================
    === clases abstractas ===
    =====================
    
   Con una clase abstracta voy a poder definir una clase, haré una plantilla, pero que no voy a poder instanciar.
    Entonces, ¿pare que sirve?...

    Sirve para que sea definida como padre en una "jerarquía de herencias".
    Las clases abstractas se van a crear, sobre todo cuando desde la lógica del programa no tenga sentido crear
    objetos de esa clase, sino simplemente la necesitamos para definir toda la información común que será heredado
    por unas clases hijas.

    clase "Figura" (abstracta) para modelar figuras geométricas.
    
    Todas las figuras necesitan calcular el "area" y el "perímetro" |  Cualquier Figura necesita implementar esos métodos,
    definir en la clase padre "Figura", esos métodos que tienen que implementar todas las clases hijas.
    
*/
