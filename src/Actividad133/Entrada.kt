package Actividad133

open class Entrada {
    var codigo:Int = 0
    var precio:Double = 0.0
    var ubicacion:String = ""
    constructor(){

    }

    constructor(codigo:Int, precio:Double, ubicacion:String){
        this.codigo = codigo
        this.precio = precio
        this.ubicacion = ubicacion
    }

    open fun mostrarInfo():String{
        var info = ""
        info += "Codigo: $codigo\n"
        info += "Precio: $precio\n"
        info += "Ubicacion: $ubicacion\n"
        return info
    }
}