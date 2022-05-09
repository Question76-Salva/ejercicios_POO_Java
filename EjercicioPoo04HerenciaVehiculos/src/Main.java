
public class Main {

    public static void main(String[] args) {

        // === instanciar dos vehiculos de cada tipo ===
        Electrico electrico1 = new Electrico("123", 800, 20000);
        Electrico electrico2 = new Electrico("345", 700, 25000);
        
        Combustion combustion1 = new Combustion("222", 1000, 150);
        Combustion combustion2 = new Combustion("999", 1200, 190);
        
        // impirimir los atributos con el toString de cada uno de los objetos y concatenarle el impuesto que pagan
        System.out.println(electrico1.toString() + " Impuestos: " + electrico1.impuestoBase());
        System.out.println(electrico2.toString() + " Impuestos: " + electrico2.impuestoBase());
        
        System.out.println(combustion1.toString() + " Impuestos: " + combustion1.impuestoBase());
        System.out.println(combustion2.toString() + " Impuestos: " + combustion2.impuestoBase());               
        
    }
}

/*
    Práctica -> Herencia de Vehículos

    - Declara una clase "Vehiculo" con las siguientes propiedades: num_bastidor, peso | Los métodos son:
    impuestoBase(): Depende del peso, y se calcula de la siguiente formula: 0.45 *  peso.

    - Existen dos clases que heredan de la clase Vehiculo: "Electrico" y "Combustion". El objeto Electrico tiene como
    propiedad: precio | el objeto Combustion tiene como propiedad: cilindrada. | Los vehiculos eléctricos tributan un 9%
    de su precio más el impuesto base, mientras que los vehiculos de combustión tributan el triple de su cilindrada más
    el impuesto base. Implementa un método en ambas subclases que calculen el impuesto total en ambos casos.

    - Crea una clase principal donde instancies dos vehículos de cada tipo y muestra el impuesto que se paga por cada
    uno de ellos.       

 */
