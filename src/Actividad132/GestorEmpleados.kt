package Actividad132

class GestorEmpleados {
    var listaEmpleados: MutableMap<String,Empleado> = mutableMapOf()

    constructor(){

    }

    fun agregarEmpleado(rut: String,empleado: Empleado){
        listaEmpleados[rut] = empleado
    }

    fun mostrarEmpleados(){
        listaEmpleados.forEach { (key, empleado) ->
            println(empleado.presentarse())
        }
    }

    fun eliminarEmpleado(rut: String){
        if(listaEmpleados.containsKey(rut)){
            listaEmpleados.remove(rut)
            println("Empleado con RUT $rut eliminado.")
        } else {
            println("Empleado con RUT $rut no encontrado.")
        }
    }

    fun buscarPorGenero(genero: Char){
        listaEmpleados.forEach { (key, empleado) ->
            if(empleado.genero == genero){
                when (genero) {
                    'M' -> {
                        println("Empleado ${empleado.nombre} es de genero Masculino")
                    }
                    'F' -> {
                        println("Empleado ${empleado.nombre} es de genero Femenino")
                    }
                    'O' -> {
                        println("Empleado ${empleado.nombre} es de genero Otro")
                    }
                    else -> {

                    }
                }
            }
        }
    }
}