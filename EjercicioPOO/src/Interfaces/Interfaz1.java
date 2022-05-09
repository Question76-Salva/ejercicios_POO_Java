
package Interfaces;

public interface Interfaz1 {
    
    // === métodos | sólo los declaramos ===    
    public void metodo1();    
    public String metodo2(int n);
    
    // todas las clases que implementen esta interfaz, tendrán que implementar estos métodos
    
    
}

/*
    ===============
    === interfaces ===
    ===============

Una interfaz es como un contrato donde se definen un conjunto de métodos, y posteriormente, las clases que implementen
esta interfaz tendran que implementar dichos métodos. Por lo tanto en una interfaz únicamente aparecerá
la declaración del método y serán las clases que implementan la interfaz las que implementen en función de la lógica
y características de la clase dichos métodos.

Un concepto muy importante de las interfaces es que distintas clases pueden implementar la misma interfaz, y además
una clase puede implementar más de una interfaz.

El concepto de interfaz es parecido al de clase abstracta. La diferencia principal es que las clases abstractas
puedo tener métodos implementados, en la interfaz únicamente puedo declararlos y las clases que implementen una interfaz
pueden implementar esa y más interfaces, y una clase sòlo puede heredar una clase abstracta, no más de una.

*/