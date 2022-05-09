
public class Main {

    public static void main(String[] args) {

        // objetos sin parámetros | senadores y diputados
        Legislador d1 = new Diputado();
        System.out.println(d1);        
        Legislador s1 = new Senador();
        System.out.println(s1);
        
        // objetos con parámetros | senadores y diputados
        Legislador d2 = new Diputado("Alex", "Rodriguez", 38, false, "Sevilla", "psoe", 1);
        System.out.println(d2);
        Legislador s2 = new Senador("Juan", "Reinols", 45, true, "Cadiz", "podemos", 2);
        System.out.println(s2);
        
        // === crea un array de Legisladores | va a contener tanto senadores como diputados ===
        Legislador[] legisladores = {d1, d1, s1, s2};
        
        // === recorrer array legisladores ===
        for (Legislador leg : legisladores) {
            System.out.println(leg.getCamaraEnQueTrabaja());
        }
        
        
       
    }
}

/*
    Practica "Legisladores" | === practicar las Clases abstractas y el polimorfismo ===

    - Crea una clase "Persona" con atributos para almacenar su: nombre, apellidos, edad, casado.
    Tendrá dos constructores:
        * constructor sin parámetros que inicialice los atributos de tipo cadena a vacios y si está casado a falso.
        * construcotr con todos los parámetros.

    - Declara una clase "Legislador" que herede de "Persona" y que tenga atributos para la provincia a la que representa,
    partido político y número de despacho. Tendrá dos constructores y un método:
        * constructor sin parámetros que inicializa todos los atributos a cadenas vacias.
        * constructor con todos los parámetros.
        * método abstracto "getCamaraEnQueTrabaja()" que devuelve un String.

      - Crea dos clases concretas que hereden de Legislador: "Diputado" y "Senador", que implementen el método
      abstracto heredado devolviendo una cadena en la que se indique si trabajan en el congreso o en el senado.

      - En una clase "Main", crea una lista de legisladores y muestra por pantalla la cámara en la que trabajan haciendo
      uso de polimorfismo.      

 */
