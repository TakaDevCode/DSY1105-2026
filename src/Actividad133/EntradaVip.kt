package Actividad133

class EntradaVip:Entrada {
    var beneficios: MutableList<String> ?= mutableListOf()

    constructor(){

    }

    constructor(codigo:Int, precio:Double, ubicacion:String, beneficios:String)
            :super(codigo, precio, ubicacion){
    }

    fun agregarBeneficio(beneficio:String){
        beneficios?.add(beneficio)
    }
    override fun mostrarInfo(): String {
        var info = super.mostrarInfo()
        info += "Beneficios Zona VIP: \n"
        beneficios?.forEach{ i->
            info += "* $i\n"
        }
        info+="Tipo de entrada: VIP\n"
        return info
    }
}