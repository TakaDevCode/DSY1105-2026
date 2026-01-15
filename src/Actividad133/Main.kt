package Actividad133

import kotlinx.coroutines.*


var gestor: GestionEntradas = GestionEntradas()
suspend fun main() {
    //Datos Base para trabajar
    val ticket1: EntradaGeneral = EntradaGeneral(101, 50000.0, "Galeria")
    val ticket2: EntradaVip = EntradaVip(102, 150000.0, "Palco Gold", "")
    ticket2.agregarBeneficio("Cerveza Gratis")
    ticket2.agregarBeneficio("Acceso al Backstage")
    ticket2.agregarBeneficio("Foto con el Artista")

    println("Detalles del Ticket 1:")
    println(ticket1.mostrarInfo())
    println("\nDetalles del Ticket 2:")
    println(ticket2.mostrarInfo())

    //Gestion y validacione de entradas
    gestor.agregarEntrada(ticket1)
    gestor.agregarEntrada(ticket2)
    gestor.conteoVIP()
    gestor.calcularEntradas()

    //Validacion de entradas
    println("\nValidando Entradas...")
    gestor.listaEntradas().forEach { (key,Entrada)->
        println("Validando entrada con codigo: $key")
        //Llamada a la funcion asincrona de validacion
        //La cual nos permite manipular los 3 status en caso de que sucedan
        when(val resultado = validacionEntrada(Entrada)){
            is validacionEntrada.EntradaValida -> println(resultado.resultado)
            is validacionEntrada.EntradaInvalida -> println(resultado.error)
            is validacionEntrada.CargandoEntrada -> println("Cargando validacion...")
        }
    }



}
//En contexto de asincronia y corrutinas
//La funcion validacionEntrada simula una validacion de una entrada
//Retornando un objeto de tipo sealed class validacionEntrada
//El cual puede tener multiples resultados dependiendo del estado de la validacion
//La funcion utiliza delay para simular una operacion asincrona
//Indicando que la asincronia es un proceso alterno que puede ser finalizado en cualquier momento
//y no bloquea el hilo principal de ejecucion
suspend fun validacionEntrada(entrada: Entrada): validacionEntrada {
    //Simulacion de carga
    delay(3000L)
    var listaEntradas = gestor.listaEntradas()
    return if (listaEntradas.containsKey(entrada.codigo)) {
        validacionEntrada.EntradaValida(entrada,"Entrada con codigo ${entrada.codigo} es valida.")
    } else {
        validacionEntrada.EntradaInvalida("Error: La entrada con codigo ${entrada.codigo} no es valida.")
    }
}

//Sealed class nos permite representar una jerarquia de clases restringida
//En la cual se nos permite representar los distintos estados de un proceso a ejecucion
//En este caso la validacion de una entrada sera nuestro proceso con 3 multiples resultados
// Una entrada valida segun sus datos
// Una entrada invalida que arroja un error
// Un estado de carga mientras se realiza la validacion
sealed class validacionEntrada {

    //Entrada valida debe contener los datos de la entrada
    //ENtrada invalida debe arrojar un error
    data class EntradaValida(val entrada: Entrada,val resultado:String) : validacionEntrada()
    data class EntradaInvalida(val error: String) : validacionEntrada()
    object CargandoEntrada : validacionEntrada()


}