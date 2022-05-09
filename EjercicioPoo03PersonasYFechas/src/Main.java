
public class Main {
    
    public static void main(String[] args) {
        
        // instanciar 3 Personas y 3 Fechas
        Fecha f1 = new Fecha(7,4,1995);
        Persona p1 = new Persona("Juan", "Rodriguez", f1);
        
        Fecha f2 = new Fecha(17,11,2005);
        Persona p2 = new Persona("Ana", "Martinez", f2);
        
        Fecha f3 = new Fecha(20,2,2012);
        Persona p3 = new Persona("Lucía", "Sánchez", f3);
               
        // array de tipo Persona        
        Persona[] personas = {p1, p2, p3};
        
        for(Persona p: personas) {
            System.out.println(p.getFechaNacimiento().toString());
        }
    }
}

/*
    Práctica -> Personas y Fechas
    
    - Declara una clase "Fecha" con atributos para el: dia, mes, año | Crear un método "toString" que devolverá la fecha
    en formato: dd/mm/yy.

    - Crea una clase "Persona" con atributos para el: nombre, apellidos, fecha nacimiento (de tipo Fecha).

    - Crear una clase "Principal" donde se inicialice un array de objetos de tipo "Persona" con 3 elementos. Para cada
    uno de ellos, mostrar su fecha de nacimiento.
    
*/