
package ejercicio;

public class Principal {
    public static void main(String[] args) {
        
        // === instanciar objetos ===
        // tipo "MusicoEstudiante"
        MusicoEstudiante musicoE = new MusicoEstudiante();
        
        // === llamar a los métodos del objeto heredados de las interfaces ===
        musicoE.hablar();
        musicoE.tocarMusica();
        musicoE.estudiar();
    }
}

/*
            ===================================
            === interfaces | simular herencia múltiple ===
            ===================================

herencia múltiple -> hace referencia a la característica de los lenguajes de programación orientados a objetos en la que
                                una clase puede heredar atributos y métodos de más de una superclase.

Ejemplo: Tenemos una superclase "Persona" y esta tiene 2 clases hijas "Musico" y "Estudiante", cada una de estas
                clases tiene una sóla clase padre (Persona). No hay herencia múltiple, es herencia o jerarquía de clases.
                Pero si creamos una nueva clase "MusicoEstudiante" que herede a la vez de las clases "Musico" y "Estudiante"
                aquí ya hay herencia múltiples.
                Herencia múltiple es cuando una clase tiene más de una clase padre. Como java no soporta la herencia
                múltiple tenemos que usar las interfaces.

De que nos sirven las interfaces en java:
    * Permite simular la herencia múltiple.
    * La interface sólo puede ser "public" o "default".
    * Todos sus métodos deben ser "abstractos".
    * Todos sus atributos deben ser "final" (constantes).

*/