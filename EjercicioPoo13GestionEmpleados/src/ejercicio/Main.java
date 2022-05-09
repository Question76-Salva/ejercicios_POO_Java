package ejercicio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // === crear objetos ===
        Comercial comercial;
        Repartidor repartidor;

        // === variables ===
        int opcion;

        do {
            System.out.println("1. PLUS para el comercial");
            System.out.println("2. PLUS para el repartidor");
            System.out.println("3. Salir");
            System.out.println("Elige una opción: ");
            opcion = teclado.nextInt();

            System.out.println("");

            switch (opcion) {
                case 1:
                    // === plus para el comercial ===
                    String nombreComercial;
                    double salarioComercial;
                    double comision;
                    int edadComercial;

                    System.out.println("Introduzca el nombre del comercial: ");
                    nombreComercial = teclado.next();

                    System.out.println("Introduzca el salario del comercial: ");
                    salarioComercial = teclado.nextDouble();

                    System.out.println("Introduzca la comisión del comercial: ");
                    comision = teclado.nextDouble();

                    System.out.println("Introduzca la edad del comercial: ");
                    edadComercial = teclado.nextInt();

                    // crear objeto tipo Comercial con los datos 
                    comercial = new Comercial(comision, nombreComercial, edadComercial, salarioComercial);
                    System.out.println(comercial.toString());

                    // calcular el PLUS
                    comercial.plus();

                    System.out.println("");

                    break;

                case 2:
                    // === plus para el repartidor ===
                    String nombreRepartidor;
                    String zona;
                    double salarioRepartidor;
                    int edadRepartidor;

                    System.out.println("Introduzca el nombre del repartidor: ");
                    nombreRepartidor = teclado.next();

                    System.out.println("Introduzca la zona del repartidor: ");
                    zona = teclado.next();

                    System.out.println("Introduzca el salario del repartidor: ");
                    salarioRepartidor = teclado.nextDouble();

                    System.out.println("Introduzca la edad del repartidor: ");
                    edadRepartidor = teclado.nextInt();

                    // crear objeto tipo Repartiror con los datos 
                    repartidor = new Repartidor(zona, nombreRepartidor, edadRepartidor, salarioRepartidor);
                    System.out.println(repartidor.toString());

                    // calcular el PLUS
                    repartidor.plus();

                    System.out.println("");
                    break;

                case 3:
                    // === salir ===
                    System.out.println("Gracias por usar la aplicación. Adiós.");
                    opcion = 3;
                    break;

                default:
                    System.out.println("Error. La opción no es válida. Eliga una opción correcta");
                    break;
            }

        } while (opcion != 3);

    }
}

/*
        ========================
        === Gestión de empleados ===
        ========================

Los empleados se definen por tener: nombre | edad | salario. También tendremos una constante llamada PLUS, que
tendrá un valor de 300€.

Tenemos dos tipos de empleados: Repartiddor | Comercial

    * El comcercial, aparte de los atributos anteriores, tiene uno más llamado "comisión" (double).
    * El repartidor, aparte de los atributos de empleado, tiene otro llamado "zona" (String).
    * El comercial, si tiene más de 30 años y cobra una comisión de más de 200€, se le aplicará el PLUS.
    * El repartidor, si tiene menos de 25 años y reparte en "Sevilla", recibirá el PLUS.

 */
