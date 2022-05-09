
package Colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Colecciones {
    public static void main(String[] args) {
        
        // === principales tipos de coleccionoes ===
        
        // ====================
        // === colección -> Set ===
        // ====================
        // almacena elementos que NO pueden ser repetidos
        // diferentes "clases" que implementan la interfaz/colección Set:
        // HashSet -> los elementos se almacenan en una tabla hash, y se insertan sin ningún orden | es la más usada
        // tryset -> los elementos se ordenan en función de sus valores
        // linkedhashset -> almacena los elementos en función del orden de inserción
        
        Set<String> conjuntoCadenas = new HashSet<String>();
        
        // métodos más usados:
        conjuntoCadenas.add("hola");
        conjuntoCadenas.add("adios");
        
        // recorrer colección
        for (String s: conjuntoCadenas) {
            System.out.println(s);
        }
        
        
        
        // ====================
        // === colección -> List ===
        // ====================
        // listas | la interfaz List define una sucesión de elementos
        // SI admite elementos duplicados
        // podemos acceder de forma posicional a los elementos | cuando inserto elementos, estos se almacenan en una
        // posición y luego voy a poder iterar en ellos a través de la posición, por ejemplo: acceder al elemento que se 
        // encuentra en la posición 2, o en la posición 4, etc...
        // diferentes "clases" que implementan la interfaz/colección List:
        // ArrayList -> se basa en un array "redimensionable" que aumenta su tamaño según crece la colección de elementos
        //                      es la que mejor rendimiento tiene sobre la mayoría de situaciones.
        // LinkedList -> en algunas ocasiones mejora el rendimiento ya que su implementación se basa en una lista 
        //                      doblemente enlazada.
        
        // a partir de la clase "Libro" que he copiado al paquete Colecciones (en que estoy) desde otro paquete, voy
        // a crear una lista de objetos de tipo "Libro" | crear colección de tipo List, que contiene objetos de tipo Libro
        
        List<Libro>  conjuntoLibros = new ArrayList<Libro>();
                     
        // métodos más usados:
        Libro libro1 = new Libro();             // crear un objeto
        Libro libro2 = new Libro();
        conjuntoLibros.add(libro1);           // y lo añado a la colección  
        conjuntoLibros.add(1, libro2);      // añadir objeto en una determinada posición
        
        // recorrer colección
        for (Libro l: conjuntoLibros) {
            System.out.println(l);
        }
        
        
        // ====================
        // === colección -> Map ===
        // ====================
        // asocia claves a valores
        // esta interfaz NO puede tener claves duplicadas
        // cada una de las claves sólo puede tener asociada un valor como máximo
        // diferentes "clases" que implementan la interfaz/colección Map:
        // HashMap -> se almacenan las claves en una tabla hash, es la implementación con mejor rendimiento, pero no 
        //                      garantiza ningún orden a la hora de realizar inserciones | elementos tipo "clave-valor".
        // TryMap -> almacena las claves ordenándolas en función de sus valores, tendremos los elementos ordenados,
        //                  pero el inconveniente es que la iteración es mucho más lenta que HashMap.
        // LinkedHashMap ->  Almacena las claves en función del orden de inserción, pero, es más costasa de implementar
        //                                  que el HashMap.
        
        // clave -> String | tipo -> objeto tipo Libro
        Map<String, Libro> conjuntoMap = new HashMap<String, Libro>();
        
        // métodos más usados:
        conjuntoMap.put("elemento 1", libro1);          // añadir objeto a la colección | clave(string) - valor(objeto)
        conjuntoMap.put("elemento 2", libro2);
        conjuntoMap.get("elemento 2");                     // recuperar elemento mediante la clave 
        
        // recorrer colección
        for (String clave: conjuntoMap.keySet()) {
            Libro l = (Libro) conjuntoMap.get(clave);
            System.out.println(l.toString());
        }
        
    }
}

/*
    =================
    === Colecciones ===
    =================
    
    Una "colección" representa un grupo de objetos, objetos que van a ser los elementos de la colección.
    
    En java se emplea una interfaz genérica llamada "Collection" para este proposito, gracias a esta interfaz podemos
    almacenar cualquier tipo de objetos, y podemos usar una serie de métodos comunes, como pueden ser: 
    añadir elementos, eliminar elementos, obtener el tamaño de la coleción... 
    
    Todos estos métodos comunes se encuentran definidos en la interfaz collection. Partiendo de esta interfaz genérica
    collection, partimos de otras que extienden esta interfaz collection. Estas subinterfaces aportan distintas funcionalidades
    sobre la interfaz anterior.

    

*/