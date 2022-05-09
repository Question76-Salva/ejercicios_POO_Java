
public class Main {

    public static void main(String[] args) {
        
        // ======================================================
        // crear un array de 3 libros
        // mostrar la información de cada libro y cúal de ellos tiene más páginas
        // ======================================================
                        
        // === instanciar 3 objetos de tipo Libro ===
         Libro libro1 = new Libro("123-A", "Quijote", "Miguel Cervantes", 2000);
         Libro libro2 = new Libro("456-B", "Lazarillo de Tormes", "Desconocido", 500);
         Libro libro3 = new Libro("789-C", "La Celestina", "Fernando de Rojas", 2400);
         
         // === crear array de objetos con las instancias de los 3 libros ===
         Libro[] libros = {libro1, libro2, libro3};      
                
        // === lógica ===        
        Libro mayorPaginas = libro1;                                        // instancia auxiliar | contiene un libro para comparar | variable auxilar para iterar y comparar
        
        for(Libro libro : libros) {            
            System.out.println(libro.toString());                           // mostrar la información (atributos) de cada instancia libro            
            // cual de las instancias tiene más páginas
            if(libro.getNumeroPaginas() > mayorPaginas.getNumeroPaginas()) {
                mayorPaginas = libro;
            }            
        }
        
        // === mostrar el título del libro con más páginas ===
        System.out.println("El libro con más páginas es: " + mayorPaginas.getTitulo());
    }
         
}


/*
Práctica 21 - Gestión de Libros

    - Crear una clase Libro que contenga los atributos: isbn, titulo, autor, numero de páginas.

    - Crear sus respectivos métodos getter y setter para cada atributo.

    - Crear método toString para mostrar la información relativa al libro con el siguiente formato:
        "El libro con ISBN creado por el autor tiene páginas"

    - En el programa principal, crear un array de 3 libros.

    - Mostrar la información de cada libro y cúal de ellos tiene más páginas.

*/