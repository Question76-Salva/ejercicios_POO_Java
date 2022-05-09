
package cajero;

public class ValidacionNumero {

    public static boolean isNum(String cadena) {
        // convertir la "cadena" de texto a número
        try {
            int numero = Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException e) {
            System.out.println(e);
            return false;
        }
    }
}
