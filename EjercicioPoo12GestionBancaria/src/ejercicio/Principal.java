package ejercicio;

import java.util.Scanner;

public class Principal {

    public static int buscarNumeroCuenta(Cuenta cuentas[], int n) {

        // === método estático | para buscar en todas las cuentas y encontrar al cunta seleccionada por el usuario ===
        // lleva como parámetro el array de cuentas | para poder buscar en el array | "n" va a ser el "numeroCuenta"
        // "indice" -> es lo que vamos a retornar | el resultado será la cuenta que busca el usuario
        // "encontrado" -> para saber si hemos encontrado la cuenta o no
        int i = 0;
        int indice = 0;
        boolean encontrado = false;

        while ((i < cuentas.length) && (encontrado == false)) {
            // mientras no hayamos terminado de recorrer todas las cuentas que existen | y además | 
            // seguimos sin encontrar el elemento | seguimos buscando...

            // === busqueda secuencial ===
            if (cuentas[i].getNumeroCuenta() == n) {
                // si el número de cuenta en el que vamos cuentas[i] es igual al que estamos buscando "n"
                // encontrado cambia a "true"
                encontrado = true;
                // una vez encontrado guardar el índice | indice es igual al iterador (donde está la cuenta encontrada)
                indice = i;
            }
            i++;
        }

        // === si no lo encuntra ===
        if (encontrado == false) {
            // el índice valdrá -1 | 
            indice = -1;
        }

        // === retorna la cuenta/elemento encontrado ===
        return indice;
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // === variables para almacenar los diferentes atributos que vamos a enviarle a las clases ===
        // atributos de la clase Cliente
        String nombre, apellido, dni;

        // === variables para almacenar los diferentes atributos que vamos a enviarle a las clases ===
        // === para rellenar datos e ir creando objetos ===
        // atributos de la clase Cuenta
        int numeroCuenta;
        double saldo;

        // === variable para crear  las cuentas del cliente ===
        int nCuentas;

        // === variable para el menú ===
        int opcion;

        // === guarda el resutlado de la búsqueda de la cuenta ===
        int indiceCuenta;

        // === guardar la cantidad a ingresar ===
        double cantidad;

        // === crear objetos | de la clase Cuenta | muchas cuentas (array de cuentas) ===
        // el usuario puede tener más de una cuenta
        Cuenta cuentas[];

        // === crear objetos | de la clase Cliente | un sólo cliente ===
        Cliente cliente;

        // === introducir datos | guardar los atributos de la clase Cliente ===
        System.out.println("Introduzca el nombre del cliente: ");
        nombre = teclado.nextLine();

        System.out.println("Introduzca el apellido del cliente: ");
        apellido = teclado.nextLine();

        System.out.println("Introduzca el dni del cliente: ");
        dni = teclado.nextLine();

        System.out.println("Introduzca cuantas cuentas tiene el cliente: ");
        nCuentas = teclado.nextInt();

        // === crear el número de cuentas que el usuario quiere ===
        cuentas = new Cuenta[nCuentas];

        // === pedirle al usuario todas las cuentas que tiene ===
        for (int i = 0; i < cuentas.length; i++) {
            System.out.println("Introduzca los datos para la cuenta " + (i + 1) + ":");
            System.out.println("Introduzca el número de cuenta: ");
            numeroCuenta = teclado.nextInt();
            System.out.println("Introduzca el saldo de la cuenta: ");
            saldo = teclado.nextDouble();

            // === guardar las cuentas | inicializarlas con el constructor ===
            cuentas[i] = new Cuenta(numeroCuenta, saldo);
        }

        // === crear objeto tipo Cliente ===
        // ya tenemos todos los datos del cliente: personales y sus cuentas
        cliente = new Cliente(nombre, apellido, dni, cuentas);

        // === menú para acciones del cajero ===
        // se repite el bucle mientras la opción elegida no sea 4 | entonces sale
        do {
            //System.out.println("\t.:MENU:.");
            System.out.println("1. Ingresar dinero en la cuenta");
            System.out.println("2. Retirar dinero de la cuenta");
            System.out.println("3. Consultar saldo de la cuenta");
            System.out.println("4. Salir");
            System.out.println("Eliga una opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Introduzca el número de cuenta: ");
                    // en que cuenta está | depende el índice el array cuentas[]
                    numeroCuenta = teclado.nextInt();
                    // contiene el valor del índice donde hemos encontrado la cuenta
                    indiceCuenta = buscarNumeroCuenta(cuentas, numeroCuenta);

                    if (indiceCuenta == -1) {
                        // no se encontró la cuenta | no se encontró el número de la cuenta
                        System.out.println("El número de cuenta ingresado no existe");
                    } else {
                        // en caso contrario existe la cuenta | podemos INGRESAR dinero en ella
                        System.out.println("Ingrese la cantidad de dinero a ingresar");
                        cantidad = teclado.nextDouble();

                        // ingresa el dinero | en la cuenta elegida (indiceCuenta) y la cantidad
                        cliente.ingresar_dinero(indiceCuenta, cantidad);

                        System.out.println("Ingreso realizado correctamente");
                        System.out.println("Saldo disponible en la cuenta: " + cliente.consultar_saldo(indiceCuenta));
                    }
                    break;

                case 2:
                    System.out.println("Introduzca el número de cuenta: ");
                    // en que cuenta está | depende el índice el array cuentas[]
                    numeroCuenta = teclado.nextInt();
                    // contiene el valor del índice donde hemos encontrado la cuenta
                    indiceCuenta = buscarNumeroCuenta(cuentas, numeroCuenta);

                    if (indiceCuenta == -1) {
                        // no se encontró la cuenta | no se encontró el número de la cuenta
                        System.out.println("El número de cuenta ingresado no existe");
                    } else {
                        // en caso contrario existe la cuenta | podemos RETIRAR dinero en ella
                        System.out.println("Ingrese la cantidad de dinero a retirar");
                        cantidad = teclado.nextDouble();

                        // === comprobar si tiene saldo suficiente ===
                        if (cantidad > cliente.consultar_saldo(indiceCuenta)) {
                            // si la cantidad que el usuario quiere retirar es superior a la que tiene en la cuenta
                            System.out.println("Saldo insuficiente");
                        } else {
                            // en caso contrario | podemos retirar la cantidad
                            // retira el dinero | en la cuenta elegida (indiceCuenta) y la cantidad
                            cliente.retirar_dinero(indiceCuenta, cantidad);

                            System.out.println("Retirada de dinero realizado correctamente");
                            System.out.println("Saldo disponible en la cuenta: " + cliente.consultar_saldo(indiceCuenta));
                        }
                    }
                    break;

                case 3:
                    System.out.println("Introduzca el número de cuenta: ");
                    // en que cuenta está | depende el índice el array cuentas[]
                    numeroCuenta = teclado.nextInt();
                    // contiene el valor del índice donde hemos encontrado la cuenta
                    indiceCuenta = buscarNumeroCuenta(cuentas, numeroCuenta);

                    if (indiceCuenta == -1) {
                        // no se encontró la cuenta | no se encontró el número de la cuenta
                        System.out.println("El número de cuenta ingresado no existe");
                    } else {
                        // en caso contrario existe la cuenta | podemos ver el SALDO de dinero en ella                                    
                        System.out.println("Saldo disponible en la cuenta: " + cliente.consultar_saldo(indiceCuenta));
                    }
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Error. No existe esa opción");

            }

            System.out.println("");
            
        } while (opcion != 4);

    }
}

/*
        ====================
        === Gestión bancaria ===
        ====================

Programa para hacer gestiones en un banco, para lo cual tendremos 2 clases ( Cliente y Cuenta ). Considerar que un
cliente se caracteriza por su nombre, apellido y dni. El cliente puede consultar saldo, así como ingresar y retirar dinero
de sus cuentas. Además cada cuenta se caracteriza por un número de cuenta y un saldo.

 */
