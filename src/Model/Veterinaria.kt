package Model

class Veterinaria {
    private var nombre: String = ""
    private var direccion: String = ""
    private var telefono: String = ""
    private var mascotas: MutableMap<Int,Animal> = mutableMapOf()

    constructor() {

    }

    constructor(nombre: String, direccion: String, telefono: String) {
        this.nombre = nombre
        this.direccion = direccion
        this.telefono = telefono
    }

    fun agregarMascota(id: Int, animal: Animal) {
        mascotas[id] = animal
    }

    fun buscarMascota(id: Int): Result<Animal> {
        return if(mascotas[id] != null){
            Result.success(mascotas[id]!!)
        } else {
            Result.failure(Exception("Mascota no encontrada"))
        }
    }
}