
public class Canario implements Acciones{

    // === implementar tods los métodos abstractos de la interfaz Acciones ===
    @Override
    public void cantar() {
        System.out.println("pio pio pio pio");
    }

    @Override
    public void andar() {
        System.out.println("Puedo andar, pero me gusta más volar");
    }

}
