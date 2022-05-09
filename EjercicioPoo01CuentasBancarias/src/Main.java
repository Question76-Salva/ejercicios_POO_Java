
public class Main {

    public static void main(String[] args) {
        
        // instanciar 2 cuentas y probar sus atributos y métodos asociados
        
        // === instanciar objetos de tipo Cuenta | con el constructor vacio ===
        Cuenta cuenta1 = new Cuenta();
        cuenta1.setTitular("Mari Paz");         // setear valor del atributo private con el setter | modificar/ingresar valor nuevo
        cuenta1.setCantidad(20000);           // setear valor del atributo private con el setter | modificar/ingresar valor nuevo
        
        // === instanciar objetos de tipo Cuenta | con el constructor con parámetros ===        
        Cuenta cuenta2 = new Cuenta("Salvador");
        cuenta2.ingresar(20000);
        cuenta2.retirar(10);
        
        // === mostrar valor de los atributos de las instancias creadas | con método toString ===
        System.out.println(cuenta1.toString());
        System.out.println(cuenta2.toString());
        
    }
}


/*
Práctica : Cuentas Bancarias

    - Crea una clase llamada 'Cuenta' para modelar cuentas bancarias.

    - Tendrá los siguientes atributos: titular, cantidad (puede tener decimales).

    - Definir un constructor sin parámetros y un constructor con el titular como parámetro.

    - Definir los siguientes métodos:
            - ingresar (cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es negativa, no se hará nada.
            - retirar (cantidad): se retira una cantidad a la cuenta, si restando la cantidad actual a la que nos pasan es negativa,
                                            la cantidad de la cuenta pasa a ser 0.

En el programa principal, instanciar 2 cuentas y probar sus atributos y métodos asociados.                            
*/