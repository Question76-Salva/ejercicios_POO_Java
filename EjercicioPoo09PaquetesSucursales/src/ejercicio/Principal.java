package ejercicio;

import java.util.Scanner;

public class Principal {

    public static int buscarPaquete(Paquete paquete[], int numeroPaquete, int contadorPaquete) {
        // === método estático | va a retornar/devolver el índice del número de paquete ===
        // lleva como parámetro el array de paquetes | para poder buscar en el array | "n" va a ser el "numeroPaquete"
        // "numeroPaquete" -> el número de paquete que estoy buscando
        // "contadorPaquete" -> para decirle cuantos paquetes hemos creado hasta el momento

        // == variables necesarias ===        
        // indice -> lo que vamos a retornar | el paquete encontrado
        int indice = 0;
        // encontrado -> bandera
        boolean encontrado = false;

        // === recorrer array ===
        // desde que el iterador es 0 hasta que sea menor al número total de paquetes creadas/existententes "contadorPaquetes"
        for (int i = 0; i < contadorPaquete; i++) {
            // si una de las sucursales que vamos iterando es igual al número de paquete por parámetro
            if (paquete[i].getNumeroPaquete() == numeroPaquete) {
                // cambiar estado bandera
                encontrado = true;
                // una vez encontrado guardar el índice | indice es igual al iterador (donde está el paquete encontrados)
                indice = i;
            }
        }

        // === si no lo encuntra ===
        if (encontrado == false) {
            // el índice valdrá -1 | 
            indice = -1;
        }

        return indice;

    }

    public static int buscarSucursal(Sucursal sucursal[], int numeroSucursal, int contadorSucursal) {
        // === método estático | va a retornar/devolver el índice del número de sucursal ===
        // lleva como parámetro el array de sucursales | para poder buscar en el array | "n" va a ser el "numeroSucursal"
        // "numeroSucursal" -> el número de sucursal que estoy buscando
        // "contadorSucursal" -> para decirle cuantas sucursales hemos creado hasta el momento

        // == variables necesarias ===        
        // indice -> lo que vamos a retornar | la sucursal encontrada
        int indice = 0;
        // encontrado -> bandera
        boolean encontrado = false;

        // === recorrer array ===
        // desde que el iterador es 0 hasta que sea menor al número total de sucursales creadas/existententes "contadorSucursal"
        for (int i = 0; i < contadorSucursal; i++) {
            // si una de las sucursales que vamos iterando es igual al número de sucursal por parámetro
            if (sucursal[i].getNumeroSucursal() == numeroSucursal) {
                // cambiar estado bandera
                encontrado = true;
                // una vez encontrado guardar el índice | indice es igual al iterador (donde está la sucursal encontrada)
                indice = i;
            }
        }

        // === si no lo encuntra ===
        if (encontrado == false) {
            // el índice valdrá -1 | 
            indice = -1;
        }

        return indice;

    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // === variables para almacenar los diferentes atributos que vamos a enviarle a las clases ===
        // === para rellenar datos e ir creando objetos ===
        // atributos de la clase Sucursal
        int numeroSucursal;
        String direccion;
        String ciudad;

        // atributos de la clase Paquete
        int numeroPaquete;
        String dni;
        double peso;
        int prioridad;

        // === cuantos objetos como máximo podemos crear | màximo 50 sucursales ===
        Sucursal sucursal[] = new Sucursal[50];

        // === cuantos paquetes podemos enviar | máximo 100 paquetes ===
        Paquete paquete[] = new Paquete[100];

        // === variable para el menú ===
        int opcion;

        // === variables para las opciones | contadores ===
        int contadorSucursal = 0;
        int contadorPaquete = 0;
        int indiceSucursal;
        double precioPaquete;
        int indicePaquete;

        // === menú ===
        // se repite el bucle mientras la opción elegida no sea 7 | entonces sale
        do {
            System.out.println("1. Crear una nueva sucursal");
            System.out.println("2. Enviar paquete");
            System.out.println("3. Consultar sucursal");
            System.out.println("4. Consultar paquete");
            System.out.println("5. Mostrar todas las sucursales");
            System.out.println("6. Mostrar todos los paquetes");
            System.out.println("7. Salir");

            System.out.println("Introduzca la opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                // === crear nueva sucursal ===
                // pedirle por telcado los datos de la sucursal para crear el objeto | la sucursal es un array de objetos
                case 1:
                    System.out.println("Introduzca el número de sucursal: ");
                    numeroSucursal = teclado.nextInt();
                    
                   teclado.nextLine();
                    
                    System.out.println("Introduzca la dirección: ");
                    direccion = teclado.nextLine();                                          
                    
                    System.out.println("Introduzca la ciudad: ");
                    ciudad = teclado.nextLine();
                    
                    System.out.println("");
                                        

                    // === crear/almacenar sucursal ===
                    sucursal[contadorSucursal] = new Sucursal(numeroSucursal, direccion, ciudad);
                    contadorSucursal++;
                    break;

                // === enviar paquete ===
                // preguntar/pedir al usuario que introduzca desde que sucursal quiere enviar el paquete | si esa sucursal
                // existe podremos enviar el paquete
                case 2:
                    System.out.println("Introduzca el número de sucursal: ");
                    numeroSucursal = teclado.nextInt();

                    // comprobar si la sucursal introducida por el usuario existe | con ayuda del método estático
                    indiceSucursal = buscarSucursal(sucursal, numeroSucursal, contadorSucursal);

                    if (indiceSucursal == -1) {
                        System.out.println("La sucursal no existe, no se puede enviar el paquete");
                    } else {
                        // si existe la sucursal | pedir los datos del paquete
                        System.out.println("Introduzca el número del paquete: ");
                        numeroPaquete = teclado.nextInt();
                        
                        // limpiar buffer
                        teclado.nextLine();
                        
                        System.out.println("Introduzca el dni de la persona que envia el paquete: ");
                        dni = teclado.nextLine();
                        
                        System.out.println("Introduzca el peso del paquete: ");
                        peso = teclado.nextDouble();
                        
                        System.out.println("Introduzca la prioridad: (0=normal | 1=alta | 2=express)");
                        prioridad = teclado.nextInt();

                        // === una vez obtenidos los datos del paquete | crear el objeto ===
                        paquete[contadorPaquete] = new Paquete(numeroPaquete, dni, peso, prioridad);

                        precioPaquete = sucursal[indiceSucursal].calcular_precio(paquete[contadorPaquete]);

                        System.out.println("El precio del paquete es: " + precioPaquete + " €");

                        contadorPaquete++;

                    }

                    break;

                // === consultar sucursal ===
                // nos ayudará el método estático para encontrarPaquete
                case 3:
                    System.out.println("Introduzca el número de sucursal: ");
                    numeroSucursal = teclado.nextInt();

                    // comprobar si la sucursal introducida por el usuario existe | con ayuda del método estático
                    indiceSucursal = buscarSucursal(sucursal, numeroSucursal, contadorSucursal);

                    if (indiceSucursal == -1) {
                        System.out.println("La sucursal no existe, no se puede enviar el paquete");
                    } else {
                        // si existe la sucursal  | podemos imprimir los datos de la sucursal
                        System.out.println("Los datos de la sucursal son: ");
                        System.out.println(sucursal[indiceSucursal].mostrarDatosSucursal());
                    }

                    break;

                // === consultar paquete ===
                case 4:
                    System.out.println("Introduzca el número del paquete: ");
                    numeroPaquete = teclado.nextInt();

                    indicePaquete = buscarPaquete(paquete, numeroPaquete, contadorPaquete);

                    if (indicePaquete == -1) {
                        System.out.println("El paquete no existe, no se puede enviar el paquete");
                    } else {
                        // si existe el paquete  | podemos imprimir los datos del paquete
                        System.out.println("Los datos del paquete son: ");
                        System.out.println(paquete[indicePaquete].mostrarDatosPaquete());
                    }
                    break;

                // === mostrar todas las sucursales ===
                case 5:
                    for (int i = 0; i < contadorSucursal; i++) {
                        // imprimir el dato de cada sucursal
                        System.out.println("Los datos de la sucursal número " + (i + 1) + ":");
                        System.out.println(sucursal[i].mostrarDatosSucursal());
                    }
                    break;

                // === mostrar todas los paquetes ===
                case 6:
                    for (int i = 0; i < contadorPaquete; i++) {
                        // imprimir el dato de cada sucursal
                        System.out.println("Los datos del paquete número " + (i + 1) + ":");
                        System.out.println(paquete[i].mostrarDatosPaquete());
                    }
                    break;

                // === salir ===
                case 7:
                    break;

                default:
                    System.out.println("Error. Opción incorrecta");
                    break;
            }

            System.out.println("");

        } while (opcion
                != 7);

    }
}


/*
        ====================================
        === Envio paquetes a distintas sucursales ===
        ====================================

Una empresa de envío de paquetes tiene varias sucursales en todo el país. Cada sucursal esta definida por su número
de sucursal, dirección y ciudad. Para calcular el precio que cuesta enviar cada paquete, las sucursales tienen en cuenta
el precio del paquete y la prioridad, sabiendo que se cobra un dólar/euro por kilo, 10 dólares/euros más si la prioridad es
alta y 20 si es express. Cada paquete enviado tendrá un número de referencia y el DNI de la persona que lo envía.

 */
