
package ClasesAbstractas;

public class Main {
    public static void main(String[] args) {
        
        /*
            No tiene sentido instanciar objetos de clase "Figura", lo que tiene sentido es poder instanciar objetos de las
            clases hijas, y así podré llamar a todos los métodos y podrán ser calculados objetos de distintas formas.
        */
        
        // === instanciar objetos de tipo Cuadrado y Triangulo | clases hijas ===
        Cuadrado c1 = new Cuadrado("cuadrado", 5);
        Triangulo t1 = new Triangulo("triangulo", 6, 4);
        
        // === invocar a los métodos abstractos ===
        System.out.println(c1.area());
        System.out.println(c1.perimetro());
        
        System.out.println(t1.area());
        System.out.println(t1.perimetro());
        
        // ====================
        // === polimorfismo ===
        // ====================
        /*
            Es una propiedad de la orientación a objetos que me permite definir un objeto de un tipo determinado,
            pero que ese objeto se implemente a partir de diferentes formas.            .
        */
        
        // en ambos casos el tipo es "Figura" pero la forma que adoptan en el primer caso es "Cuadrado"
        // y en el segundo es "Triangulo"
        
        // definir un objeto de tipo "Figura" pero implementarlo a partir de la clase "Cuadrado"
        Figura f = new Cuadrado("cuadrado", 6);
        
        // definir un objeto de tipo "Figura" pero implementarlo a partir de la clase "Triangulo"
        Figura f2 = new Triangulo("triangulo", 8, 2);
        
        Figura f3 = new Triangulo("triangulo", 8, 4);
        Figura f4 = new Triangulo("triangulo", 6, 2);
        Figura f5 = new Cuadrado("cuadrado", 5);
        
        // invocar los métodos abstractos de las clases hijos con los objetos polimórficos
        System.out.println(f.area());
        
        /*
            Más aplicaciones prácticas del polimorfismo:
            Si necesito almacenar muchas figuras, tanto cuadrados como triángulos, puedo definirme un array de figuras,
            y ese array puede contener tanto objetos de tipo "Cuadrado" como objetos de tipo "Triangulo", porque he
            definido el array del tipo de la clase padre "Figura".
        
            El polimorfismo sólo tiene sentido en una jerarquía de herencias.
        */
        
        // === array de objetos tipo Figura ===
        Figura[] figuras = new Figura[5];
        
        // === llenar el array con los objetos de tipo Figura creados arriba ===
        figuras[0] = f;
        figuras[1] = f2;
        figuras[2] = f3;
        figuras[3] = f4;
        figuras[4] = f5;
        
        // === recorrer array ===
        for(Figura fig: figuras) {
            // dependiendo de si es un cuadrado o un triangulo el método se implementará de diferente forma
            System.out.println(fig.perimetro());
        }
        
    }
}
