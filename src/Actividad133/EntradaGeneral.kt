package Actividad133

class EntradaGeneral:Entrada {
    constructor(){

    }
    constructor(codigo:Int, precio:Double, ubicacion:String):super(codigo, precio, ubicacion){

    }
    override fun mostrarInfo(): String {
        var info = super.mostrarInfo()
        info += "Tipo de entrada: General\n"
        return info
    }
}