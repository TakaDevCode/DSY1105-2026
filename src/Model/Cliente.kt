package Model

class Cliente {
    private var rut: String = ""
    private var nombre: String = ""
    private var edad: Int = 0

    constructor() {

    }

    constructor(rut: String, nombre: String, edad: Int) {
        this.rut = rut
        this.nombre = nombre
        this.edad = edad
    }

    fun getRut(): String {
        return this.rut
    }

    fun setRut(rut: String) {
        this.rut = rut
    }

    //Escribe los demas getters y setters
    fun getNombre(): String {
        return this.nombre
    }

    fun setNombre(nombre: String) {
        this.nombre = nombre
    }

    fun getEdad(): Int {
        return this.edad
    }

    fun setEdad(edad: Int) {
        this.edad = edad
    }

    fun mostrarInfo() {
        println("----- Datos del Cliente -----")
        println("RUT: $rut")
        println("Nombre: $nombre")
        println("Edad: $edad")
        println("-----------------------------")
    }

}