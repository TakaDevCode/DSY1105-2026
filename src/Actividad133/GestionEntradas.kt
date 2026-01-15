package Actividad133

class GestionEntradas {
    var entradas: MutableMap<Int, Entrada> = mutableMapOf()

    constructor() {

    }

    fun agregarEntrada(entrada: Entrada) {
        entradas[entrada.codigo] = entrada
    }

    fun listaEntradas(): MutableMap<Int, Entrada> {
        return entradas
    }
    fun calcularEntradas() {
        //se calcula el total de entradas vendidas y el total recaudado por tipo de entrada
        var totalEntradasVip = 0
        var totalRecaudadoVip = 0.0
        var totalEntradasGeneral = 0
        var totalRecaudadoGeneral = 0.0
        entradas.forEach { item ->
            if (item.value is EntradaVip) {
                totalEntradasVip++
                totalRecaudadoVip += item.value.precio
            } else if (item.value is EntradaGeneral) {
                totalEntradasGeneral++
                totalRecaudadoGeneral += item.value.precio
            }
        }
        println("Total Entradas VIP: $totalEntradasVip")
        println("Total Recaudado VIP: $totalRecaudadoVip")
        println("Total Entradas General: $totalEntradasGeneral")
        println("Total Recaudado General: $totalRecaudadoGeneral")
    }

    fun conteoVIP() {
        //Conteo total de entradas VIP vendidas
        var conteoVip = 0
        entradas.forEach { item ->
            if (item.value is EntradaVip) {
                conteoVip++
            }
        }
        println("Conteo Total de Entradas VIP Vendidas: $conteoVip")
    }

}