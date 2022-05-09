
package ejercicio;

import java.util.Scanner;



public class Principal {
    
    public static int indiceGanador(Atleta atletas[]) {
        
        // le pasamos por parámetro el array de objetos al método estático | tiene que retornar un entero (indice)
        
        // cual de todos los índices del array de vehiculos tiene el menor tiempo de carrera
        float tiempoCarrera;
        int indice = 0;
        
        // === guardar el tiempo del primer atleta del array | para tenerlo como referencia ===
        tiempoCarrera = atletas[indice].getTiempoCarrera();
        
        // === recorrer el array | para comprobar si ese tiempo es el más barato ===
        for (int i = 1; i < atletas.length; i++) {
            // cual de todos los precios es el menor
            if(atletas[i].getTiempoCarrera() < tiempoCarrera) {
                tiempoCarrera = atletas[i].getTiempoCarrera();
                indice = i;
            }
        }        
        
        // === indice del atleta que ha ganado la carrera ===
        return indice;
       }
           
    
    public static void main(String[] args) {
      

        Scanner teclado = new Scanner(System.in);
        
        // === variables para almacenar los atributos de la clase Atleta ===
        String nombre;
        int numeroAtleta;
        float tiempoCarrera;
        
        // === variable para guardar el número de atletas que van a participar ===
        int nAteltas;
        
        // === variable para el índice del atleta ganador ===
        int indiceAtletaGanador;
        
        // === pedir datos al usuario | cuantos atletas van a participar en la carrera ===
        System.out.println("Introduzca el número de atletas a participar: ");
        nAteltas = teclado.nextInt();
        
        // === crear un array de objetos | para almacenar a todos los atletas | crear los objetos para cada atleta ===
        Atleta atletas[] = new Atleta[nAteltas];
        
        // === pedir al usuario todos los datos/atributos para cada atleta | mediante un bucle for ===
        for (int i = 0; i < atletas.length; i++) {
            
              // limpiar buffer | evitar basura
            teclado.nextLine();
            
            System.out.println("Introduzca las características del atleta " + (i + 1) + " : \n");
            
            System.out.println("Introduzca nombre del atleta: ");                     
            nombre = teclado.nextLine();
                       
            System.out.print("Introduzca número del atleta: \n");            
            numeroAtleta = teclado.nextInt();                  
                       
            System.out.print("Introduzca tiempo de su carrera: \n");            
            tiempoCarrera = teclado.nextFloat();
                                    
            // cada vez que el bucle itere | crear cada atleta y guardarlo en el array de objetos ===
            // invocar al constructor 
            atletas[i] = new Atleta(numeroAtleta, nombre, tiempoCarrera);
        }  
        
        indiceAtletaGanador = indiceGanador(atletas);
        System.out.println("\nEl atleta ganador es: ");
        System.out.println(atletas[indiceAtletaGanador].mostrarDatosGanador());
        
        
        
    }
}

/*
    ====================
    === Gestión atletismo ===
    ====================

Para una carrera de atletismo, se debe gestionar una serie de atletas caracterizados por su número de atleta, nombre
y tiempo de carrera, al final el programa debe mostrar los datos del atleta ganador de la carrera.

*/