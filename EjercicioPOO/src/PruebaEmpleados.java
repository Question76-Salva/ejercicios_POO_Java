
public class PruebaEmpleados {

    public static void main(String[] args) {

        // === instanciar/crear una entidad/objeto de tipo 'Empleado' sin pasarle parámetros | llama al constructor sin parámetros/por defecto ===
        Empleado empleado1 = new Empleado();

        // === instanciar/crear instancia de tipo Nacionalidad ===
        Nacionalidad nacionalidad = new Nacionalidad(1, "España");

        // === instanciar/crear una entidad/objeto de tipo 'Empleado' con parámetros | llama al constructor con parámetros ===
        Empleado empleado2 = new Empleado("123-X", "Salvador", 2500, nacionalidad);

        // incrementar el salario del empleado2 / invocar al método 'incrementarSalario'
        empleado2.incrementarSalario(500);

        // imprimir el valor de los atributos
        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());

        // obtener el valor de los atriburtos | con los getters  
        System.out.println(empleado2.getDni());

        // modificar/establecer el valor de los atriburtos | con los setters
        empleado2.setDni("333-Y");

        // vemos como queda el nuevo valor
        System.out.println(empleado2.getDni());

        // ====================================
        // === uso de atributos y métodos estáticos  ===
        // ====================================
        // acceder a un método estático | invocar con el nombre de la clase
        // me me ha devolver el número de instancias de la clase Empleado | no depende de los objetos
        System.out.println(Empleado.getNumero());

        // acceder a la nacionalidad de un objeto tipo Empleado
        // acceder al nombre de la nacionalidad del empleado2
        System.out.println(empleado2.getNacionalidad().getNombre());

        // ==============
        // === herencia ===
        // ==============
        // jerarquía de clases
        // instanciar objeto de tipo Informatico
        Informatico informatico = new Informatico("44952240", "Salvador", 1500, nacionalidad, "Java");

        // invocar al método toString del informatico
        System.out.println(informatico.toString());

        // invocar al método incrementarSalario al informatico
        informatico.incrementarSalario(500);

        // mostrar el salario del informatico | getSalario
        System.out.println(informatico.getSalario());

        // instanciar objeto de tipo Abogado
        Abogado abogado = new Abogado("44593021", "Vicente", 1400, nacionalidad, 1345);

        // invocar al método toString del abogado
        System.out.println(abogado.toString());
        
        // invocar al método incrementarSalario al abogado
        abogado.incrementarSalario(200);
        
        // mostrar el salario del informatico | getSalario
        System.out.println(abogado.getSalario());
        
        // =========================
        // === comparación de objetos ===
        // =========================
        
        // no usar operador == en los objetos | usar método de la clase Object "equals"
        
        if (empleado1.equals(empleado2)) {
            System.out.println("iguales");
        } else {
            System.out.println("distintos");
        }
        
    }
}
