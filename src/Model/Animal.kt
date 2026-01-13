package Model

open class Animal {
    protected var nombre: String = ""
    protected var edad: Int = 0
    protected var color: String = ""

    constructor() {

    }

    constructor(nombre: String, edad: Int, color: String) {
        this.nombre = nombre
        this.edad = edad
        this.color = color
    }

    open fun descripcion():String{
        var descripcion = "";
        descripcion += "Nombre: $nombre\n"
        descripcion += "Edad: $edad\n"
        descripcion += "Color: $color\n"
        return descripcion
    }
}