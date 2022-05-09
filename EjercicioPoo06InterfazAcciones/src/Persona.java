
public class Persona implements Acciones{

    // === implementar tods los métodos abstractos de la interfaz Acciones ===
    @Override
    public void cantar() {
        System.out.println("do re mi fa sol la si do");
    }

    @Override
    public void andar() {
        System.out.println("Puedo andar erguido");
    }

}
