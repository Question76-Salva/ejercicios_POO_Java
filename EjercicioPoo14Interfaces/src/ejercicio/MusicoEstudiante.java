
package ejercicio;

public class MusicoEstudiante implements Musico, Estudiante {
    
    // esta clase tiene 2 clases interfaces padre: Musico ( MusicoEstudiante hereda de esta interface) 
    // y Estudiante (MusicoEstudiante hereda de esta interface)
    // cuando una clase hereda de una interface se una -> implements
    
    // ===============================================================
    // === implementar/sobrescribir los métodos abstractos | de sus clases padres ===
    // ===============================================================
    @Override
    // === implementar/sobrescribir método abstracto superclase interface "Persona" (1º en la jerarquía) ===
    // clase padre de Musico y Estudiante
    public void hablar() {
        System.out.println("Estoy hablando español");
    }

    @Override
    // === implementar/sobrescribir método abstracto interface "Musico" | clase padre de "MusicoEstudiante" ===
    public void tocarMusica() {
        System.out.println("Estoy tocando la guitarra");
    }
    
    @Override
    // === implementar/sobrescribir método abstracto interface "Estudiante" | clase padre de "MusicoEstudiante" ===
    public void estudiar() {
        System.out.println("Esoty estudiando programación");
    }
}




