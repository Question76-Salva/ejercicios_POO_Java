
public interface Acciones {
    
    // en una interfaz únicamente se definen los métodos que posteriormente van a implementar las clases que 
    // implementen la interfaz
    public void cantar();
    public void andar();
    
    
    
}

/*
    Práctica -> Interfaz Acciones

    - Crea una interfaz llamada "Acciones", que define los siguientes métodos:
        * public void cantar();
        * public void andar();

     - Crea las siguientes clases: "Persona", "Gallo", "Canario", que implementen la interfaz "Acciones".

     - En una clase principal, instnacia objetos de cada una de las clases e invoca a los métodos de la interfaz.
*/