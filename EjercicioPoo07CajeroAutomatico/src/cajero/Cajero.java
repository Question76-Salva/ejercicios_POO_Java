package cajero;

import javax.swing.JOptionPane;

public class Cajero {

    // ==============
    // === atributos ===
    // ==============
    public int saldo = 9000;
    public String clave = "holamundo";

    // ==============
    // === métodos ===
    // ==============
    public void mostrarMenu() {
        int opcion = 0;
        do {
            String cadena = JOptionPane.showInputDialog(null, " "
                    + "1. Consultar saldo\n"
                    + "2. Ingresar\n"
                    + "3. Retirar\n"                    
                    + "4. Salir");

            if (cadena != null && ValidacionNumero.isNum(cadena)) {
                opcion = Integer.parseInt(cadena);
                switch (opcion) {
                    case 1:
                        // método consultar saldo
                        consultarSaldo();
                        break;
                    case 2:
                        // método ingresar
                        ingresar();
                        break;
                    case 3:
                        // método retirar
                        retirar();
                        break;
                    case 4:
                        // salir
                        JOptionPane.showMessageDialog(null, "Gracias por utilizar nuestro servicio");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no disponible");
                        break;
                }
            }
        } while (opcion != 4);

    }

    public void ingresar() {
        String cadena;
        int deposito = 0;

        cadena = JOptionPane.showInputDialog(null, "Introduzca la cantidad a ingresar: ");
        if (cadena != null && !cadena.equals(" ") && ValidacionNumero.isNum(cadena)) {
            deposito = Integer.parseInt(cadena);

            if (deposito > 0) {
                saldo += deposito;
                JOptionPane.showMessageDialog(null, "El saldo actual es : " + saldo);
            } else {
                JOptionPane.showMessageDialog(null, "La cantidad a ingresar debe ser mayor a 0");
            }

        }
    }

    public void retirar() {
        String cadena;
        cadena = JOptionPane.showInputDialog(null, "Introduzca su clave: ");
        // si el dato introducido no es nulo
        if (cadena == null) {
            // vuelve a la venta de inicio
        } else {
            // si el dato introducido no está vacio
            if (!cadena.equals("")) {
                // y si a la vez es igual a la clave
                if (cadena.equals(clave)) {
                    // decirle lo que voy a retirar
                    cadena = JOptionPane.showInputDialog(null, ""
                            + "a) 10€\n"
                            + "b) 20€\n"
                            + "c) 50€\n"
                            + "d) 100€\n"
                            + "e) 600€\n"
                            + "f) Otra cantidad");

                    // si el dato introducido no es nulo                    
                    if (cadena != null) {
                        // si el dato introducido no está vacio
                        if (!cadena.equals("")) {
                            switch (cadena) {
                                case "a":
                                    // retirar 10€
                                    if ((saldo - 10) >= 20) {
                                        saldo -= 10;
                                    }
                                    break;
                                case "b":
                                    // no quiero tener menos de 20€ en mi cuenta
                                    // retirar 20€
                                    if ((saldo - 20) >= 20) {
                                        saldo -= 10;
                                    }
                                    break;
                                case "c":
                                    // retirar 50€
                                    if ((saldo - 50) >= 20) {
                                        saldo -= 50;
                                    }
                                    break;
                                case "d":
                                    // retirar 100€
                                    if ((saldo - 100) >= 20) {
                                        saldo -= 100;
                                    }
                                    break;
                                case "e":
                                    // retirar 600€
                                    if ((saldo - 600) >= 20) {
                                        saldo -= 600;
                                    }
                                    break;
                                case "f":
                                    // retirar otra cantidad
                                    cadena = JOptionPane.showInputDialog(null, "Introduzca la cantidad a retirar: ");
                                    // lo que se introduzca no sea nulo, no esté vacio, se pueda transformar a número entero y sea mayor a 0
                                    if (cadena != null && !cadena.equals("") && ValidacionNumero.isNum(cadena) && (saldo - Integer.parseInt(cadena) >= 20) && (Integer.parseInt(cadena) > 0)) {
                                        saldo -= Integer.parseInt(cadena);
                                        JOptionPane.showMessageDialog(null, "El saldo actual es : " + saldo);
                                    }
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "La opción no existe, vuelva a digitar");
                                    break;
                            }
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "La contraseña es incorrecta");
                }
            }
        }
    }

    public void consultarSaldo() {
        JOptionPane.showMessageDialog(null, "Su saldo actual es : " + saldo);
    }

}

/*
    =====================================
    === Ejercicio POO 01 -> Cajero automático ===
    =====================================

    Crear un cajero automático con las siguientes opciones:
        * consultar saldo
        * depositar/ingresar
        * retirar
        * cambiar contraseña
        * salir
 */
