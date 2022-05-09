package ejercicio;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    // === viaje de equipo ===
    // para que viaje el equipo necesitamos un array estático para almacenar a todo el equipo (futbolistas, entrenador, doctor)
    // para que sea global 
    // array dinámico de tipo Persona ( futbolistas, entrenador, doctor => son personas )
    static ArrayList<Persona> persona = new ArrayList<Persona>();
    
    // === crear los objetos estáticos polimorficos de cada clase => futbolistas, entrenador, doctor ===
    // para que sea globales de tipo Persona para poder guardarlos en el array y poder usarlos en los diferentos métodos
    // objetos static para poder usarlos de forma global en diferentes métodos
    static Persona futbolista1 = new Futbolista(9, "Delantero", "Gonzalo", "Higuain", 29);
    static Persona futbolista2 = new Futbolista(21, "Delantero", "Paulo", "Dybala", 23);
    static Persona entrenador = new Entrenador("Defensiva", "Massimiliano", "Allegri", 49);
    static Persona medico = new Medico("Licenciado en Fisioterapia", 20, "Alex", "Marroni", 55);
    
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
                
        // === agregar los objetos al array ===
        persona.add(futbolista1);
        persona.add(futbolista2);
        persona.add(entrenador);
        persona.add(medico);

        // === llamar al ménu ===
        menu();
    }

    public static void menu() {
        int opcion;
        do {
            System.out.println("1. Viaje de equipo");
            System.out.println("2. Entrenamiento");
            System.out.println("3. Partido de fútbol");
            System.out.println("4. Planificar entrenamiento");
            System.out.println("5. Entrevista");
            System.out.println("6. Curar lesión");
            System.out.println("7. Salir");
            System.out.println("Elige una opción: ");            
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    // === viaje de equipo ===
                    // mostrar todos los integrantes del equipo (futbolistas, entrenador, doctor) y a todos le vamos a enviar
                    // el método viajar
                    //System.out.println("");
                    viajarEquipo();
                    break;

                case 2:
                    // === entrenamiento ===
                    // todos van a entrenar, pero cada tipo lo hace de una forma diferente
                    //System.out.println("");
                    entrenarEquipo();
                    break;

                case 3:
                    // === partido de fútbol ===
                    // todos van a participar en el partido de fútbol, pero cada uno lo hace a su manera
                    //System.out.println("");
                    partidoFutbol();
                    break;

                case 4:
                    // === planificar entrenamiento ===
                    // sólo el entrenador puede planificar un entrenamiento
                    //System.out.println("");
                    planificarEntrenamiento();
                    break;

                case 5:
                    // === entrevista ===
                    // sólo los jugadores pueden dar una entrevista
                    //System.out.println("");
                    darEntrevista();
                    break;

                case 6:
                    // === curar lesión ===
                    // sólo en médico puede curar la lesión
                    //System.out.println("");
                    curarLesion();
                    break;

                case 7:
                    // === salir ===
                    break;

                default:
                    System.out.println("Error, opción incorrecta.");
                    break;

            }

            //System.out.println("");

        } while (opcion != 7);
    }

    // =====================
    // === métodos estáticos ===
    // =====================
    public static void viajarEquipo() {
        // === viaje de equipo ===
        // recorrer array dinámico de tipo Persona y enviarlos al método "viajar" (de la superclase) de cada uno
        // va a hacerlo con los futbolistas, entrenador y médico | todos viajan de la misma forma
        for (Persona equipo : persona) {
            System.out.print(equipo.getNombre() + " " + equipo.getApellidos() + " " + " -> ");
            equipo.viajar();
        }
    }

    public static void entrenarEquipo() {
        // === entrenamiento ===
        // recorrer array dinámico de tipo Persona y enviarlos al método abstracto "entrenamiento" (de la superclase) de cada uno
        // va a hacerlo con los futbolistas, entrenador y médico | cada uno a su manera | polimorfismo
        for (Persona equipo : persona) {
            System.out.print(equipo.getNombre() + " " + equipo.getApellidos() + " " + " -> ");
            equipo.entrenamiento();
        }
    }

    public static void partidoFutbol() {
        // === partido de fútbol ===
        // recorrer array dinámico de tipo Persona y enviarlos al método abstracto "partidoFutbol" (de la superclase) de cada uno
        // va a hacerlo con los futbolistas, entrenador y médico | cada uno a su manera | polimorfismo
        for (Persona equipo : persona) {
            System.out.print(equipo.getNombre() + " " + equipo.getApellidos() + " " + " -> ");
            equipo.partidoFutbol();
        }
    }

    public static void planificarEntrenamiento() {
        // === planificar entrenamiento ===
        // el único que puede planificar un entrenamiento es el entrenador
        System.out.print(entrenador.getNombre() + " " + entrenador.getApellidos() + " -> ");
        // downcasting -> bajar en la jerarquía de clases | transformar al entreador de tipo Persona a tipo Entrenador
        // para poder usar el método planificarEntrenamiento de la clase Entrenador
        ((Entrenador) entrenador).planificarEntrenamiento();
    }

    public static void darEntrevista() {
        // === entrevista ===
        // sólo los jugadores pueden dar una entrevista | vamos a hacer una entrevista con los dos futbolistas instanciados
        System.out.print(futbolista1.getNombre() + " " + futbolista1.getApellidos() + " -> ");
        // downcasting -> bajar en la jerarquía de clases | transformar al futbolista1 de tipo Persona a tipo Futbolista
        // para poder usar el método entrevista de la clase Futbolista
        ((Futbolista) futbolista1).entrevista();

        // sólo los jugadores pueden dar una entrevista | vamos a hacer una entrevista con los dos futbolistas instanciados
        System.out.print(futbolista2.getNombre() + " " + futbolista2.getApellidos() + " -> ");
        // downcasting -> bajar en la jerarquía de clases | transformar al futbolista1 de tipo Persona a tipo Futbolista
        // para poder usar el método entrevista de la clase Futbolista
        ((Futbolista) futbolista2).entrevista();
    }

    public static void curarLesion() {
        // === curar lesión ===
        // sólo en médico puede curar la lesión
        System.out.print(medico.getNombre() + " " + medico.getApellidos() + " -> ");
        // downcasting -> bajar en la jerarquía de clases | transformar al medico de tipo Persona a tipo Medico
        // para poder usar el método curarLesion de la clase Medico
        ((Medico) medico).curarLesion();
    }

}

/*
                =================
                === Equipo fútbol ===
                =================

Simular un equipo de fútbol (futbolista, entrenador y doctor), para lo cual tendremos lo siguiente:

* Una superclase "Persona", que tendrá los datos: nombre, apellido, edad.
* Una subclase "Futbolista", que tendrá los datos: dorsal, posición.
* Una subclase "Entrenador", que tendrá los datos: estrategia.
* Una subclase "Doctor", que tendrá los datos: titulacion, años de experiencia.

Hacer una menú donde se tengan las siguientes opciones:

* Viaje de equipo
* Entrenamiento
* Partido de fútbol
* Planificar entrenamiento
* Entrevista
* Curar lesión

 */
