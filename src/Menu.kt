class Menu {

}

fun main() {
    var opcion: Int = 0
    //Menu debe tener minimo 5 opciones , la quinta es la salida
    do {
        System.out.flush()
        print("Menu de opciones:\n")
        print("1. Opcion 1\n")
        print("2. Opcion 2\n")
        print("3. Opcion 3\n")
        print("4. Opcion 4\n")
        print("5. Salir\n")
        opcion = readln().toInt()
        when (opcion) {
            1 -> print("Has seleccionado la Opcion 1\n")
            2 -> print("Has seleccionado la Opcion 2\n")
            3 -> print("Has seleccionado la Opcion 3\n")
            4 -> print("Has seleccionado la Opcion 4\n")
            5 -> print("Saliendo del menu...\n")
            else -> print("Opcion no valida, por favor intente de nuevo.\n")
        }
    } while (opcion != 5)
}