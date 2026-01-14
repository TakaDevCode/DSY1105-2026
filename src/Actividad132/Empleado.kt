package Actividad132

class Empleado : Persona {
    //Cargo - Salario
    private var puesto: String = ""
    private var salario: Double = 0.0

    constructor() : super() {

    }

    constructor(rut: String, nombre: String, edad: Int, genero: Char, puesto: String, salario: Double)
            : super(rut, nombre, edad, genero) {
        this.puesto = puesto
        this.salario = salario
    }

    //Getter and Setter




    fun getPuesto(): String {
        return puesto
    }

    fun setPuesto(puesto: String) {
        this.puesto = puesto
    }

    fun getSalario(): Double {
        return salario
    }
    fun setSalario(salario: Double) {
        this.salario = salario
    }

    fun mostrarPuesto(){
        println("${super.nombre} trabaja como $puesto")
    }

    override fun presentarse(): String {
        return "Hola,soy ${super.nombre}, trabajo como $puesto"
    }

}