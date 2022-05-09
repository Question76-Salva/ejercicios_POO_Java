
package ejercicio;

import java.util.Scanner;

public class Principal {
    
    public static int indiceCocheMasBarato(Vehiculo coches[]) {
        
        // le pasamos por parámetro el array de objetos al método estático | tiene que retornar un entero (indice)
        
        // cual de todos los índices del array de vehiculos tiene el menor precio
        float precio;
        int indice = 0;
        
        // === guardar el precio del primer vehículo del array | para tenerlo como referencia ===
        precio = coches[0].getPrecio();
        
        // === recorrer el array | para comprobar si ese precio es el más barato ===
        for (int i = 1; i < coches.length; i++) {
            // cual de todos los precios es el menor
            if(coches[i].getPrecio() < precio) {
                precio = coches[i].getPrecio();
                indice = i;
            }
        }        
        return indice;
       }
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        // === variables para los atributos de mi clase | para pedir la marca, modelo, precio ===
        String marca;
        String modelo;
        float precio;
                
        // === vairable para el número de vehículos ===
        int numeroVehiculos;
        
        // === variable para devolver el indice del vehiculo más barato ===
        int indiceBarato;
        
        // === pedir al usuario | la cantidad de vehiculos ===
        System.out.println("Digite la cantidad de vehículos: ");
        numeroVehiculos = teclado.nextInt();
        
        // como ya sabemos el número de vehículos por la entrada de datos del usuario
        // necesitamos crear sun objeto para cada vehículo | entonces necesitamos un array de objetos 
        // para almacenar los vehículos
        // crear tantos objetos como número de coches haya puesto el usuario
        
        // === crear array de objetos | para los vehiculos ===
        Vehiculo coches[] = new Vehiculo[numeroVehiculos];
        
        // === introducir los datos (marca, modelo, precio) | para cada vehiculo ===
        for (int i = 0; i < coches.length; i++) {
            
            // limpiar buffer | evitar basura
            teclado.nextLine();
            System.out.println("Introduzca las características del coche " + (i + 1) + " : \n");
            
            System.out.println("Introduzca Marca: ");                     
            marca = teclado.nextLine();
            
            
            System.out.print("Introduzca Modelo: \n");            
            modelo = teclado.nextLine();
           
            
            System.out.print("Introduzca Precio: \n");            
            precio = teclado.nextFloat();
                                    
            // cada vez que el bucle itere | crear cada vehiculo y guardarlo en el array de objetos ===
            // invocar al constructor 
            coches[i] = new Vehiculo(marca, modelo, precio);
        }
        
        // === averiguar cual es el vehiculo/objeto más barato ===
       // lo vamos a hacer dentro de esta clase, con un método static 
       
       // === guarda el vehiculo más barato ===s
       indiceBarato = indiceCocheMasBarato(coches);
       
       // === imprimir el vehiculo más barato ===
        System.out.println("El coche más barto es: ");
        System.out.println(coches[indiceBarato].mostrarDatos());
                      
    }
}

/*
        ========================================
        === práctica | encontrar el vehículo más barato ===
        ========================================

Dada una serie de vehículos caracterizados por su marca, modelo y precio, imprimir las "propiedades del vehículo
más barato". Para ello, se deberán leer por teclado las características de cada vehículo y crear una clase que represente
a cada uno de ellos.

*/
