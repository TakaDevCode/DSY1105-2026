package Actividad132

open class Persona {
    //rut - nombre - edad - genero
    var rut: String = ""
    var nombre: String = ""
    var edad: Int = 0
    var genero: Char = 'X'

    constructor() {

    }

    constructor(rut: String, nombre: String, edad: Int, genero: Char) {
        this.rut = rut
        this.nombre = nombre
        this.edad = edad
        this.genero = genero
    }

    //Getter and Setter


    open fun presentarse(): String {
        return "Hola, mi nombre es $nombre, tengo $edad años y mi género es $genero."
    }
}