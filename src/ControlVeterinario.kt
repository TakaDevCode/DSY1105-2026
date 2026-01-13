import Model.*

fun main() {
    //Crea 2 perros y 2 aves
    val perro1 = Perro("Firulais", 3, "Marron", "Labrador", false)
    val perro2 = Perro("Max", 5, "Negro", "Pastor Aleman", true)

    val ave1 = Ave("Tweety", 1, "Amarillo", "Canario", true)
    val ave2 = Ave("Pingu", 4, "Blanco y Negro", "Pingüino", false)

    var vet: Veterinaria = Veterinaria()

    vet.agregarMascota(100, perro1)
    vet.agregarMascota(101, perro2)
    vet.agregarMascota(102, ave1)
    vet.agregarMascota(103, ave2)

    var mascota = vet.buscarMascota(101)

    mascota.onSuccess { pet ->
        print(pet.descripcion())
    }.onFailure { error ->
        print(error.message)
    }

}