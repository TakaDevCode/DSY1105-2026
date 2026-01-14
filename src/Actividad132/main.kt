package Actividad132

fun main() {

    var GestorEmpleados: GestorEmpleados = GestorEmpleados()
    var opcion = 0

    do {
        try {
            //Limpiar consola cada vez que ejecute menu

            println("Menu de opciones:")
            println("1. Agregar Empleado")
            println("2. Mostrar Empleados")
            println("3. Eliminar Empleado")
            println("4. Buscar Empleados por Genero")
            println("5. Salir")
            print("Ingrese una opcion: ")
            opcion = readln().toInt()
            when (opcion) {
                1 -> {
                    println("Ingrese rut del empleado: ")
                    var rut = readln()
                    println("Ingrese nombre del empleado: ")
                    var nombre = readln()
                    println("Ingrese edad del empleado: ")
                    var edad = readln().toInt()
                    println("Ingrese genero del empleado (M/F/O): ")
                    var genero = readln().uppercase()[0]
                    println("Ingrese puesto del empleado: ")
                    var puesto = readln()
                    println("Ingrese salario del empleado: ")
                    var salario = readln().toDouble()
                    var nuevoEmpleado = Empleado(rut, nombre, edad, genero, puesto, salario)
                    GestorEmpleados.agregarEmpleado(rut, nuevoEmpleado)
                    println("Empleado agregado exitosamente.")
                }

                2 -> {
                    GestorEmpleados.mostrarEmpleados()
                }

                3 -> {
                    print("Ingrese el RUT del empleado a eliminar: ")
                    var rutEliminar = readln()
                    GestorEmpleados.eliminarEmpleado(rutEliminar)
                }

                4 -> {
                    print("Ingrese el genero a buscar (M/F/O): ")
                    var generoBuscar = readln().uppercase()[0]
                    GestorEmpleados.buscarPorGenero(generoBuscar)
                }

                5 -> {
                    println("Saliendo del programa...")
                }

                else -> {
                    println("Opcion no valida, intente de nuevo.")
                }
            }
        } catch (e: Exception) {
            println("Error: ${e.message}, intente de nuevo.")

        }

    } while (opcion != 5)
}