package Model

class Perro : Animal {
    private var raza: String = ""
    private var esAdoptado: Boolean = false

    constructor() : super() {

    }

    constructor(nombre: String, edad: Int, color: String, raza: String, esAdoptado: Boolean) : super(
        nombre,
        edad,
        color
    ) {
        this.raza = raza
        this.esAdoptado = esAdoptado
    }

    fun getRaza(): String {
        return this.raza
    }

    fun setRaza(raza: String) {
        this.raza = raza
    }

    fun isEsAdoptado(): Boolean {
        return this.esAdoptado
    }

    fun setEsAdoptado(esAdoptado: Boolean) {
        this.esAdoptado = esAdoptado
    }

    override fun descripcion(): String {
        var descripcion = super.descripcion()
        descripcion += "Raza: $raza\n"
        if (esAdoptado) {
            descripcion += "Estado: Adoptado\n"
        } else {
            descripcion += "Estado: Disponible para adopcion\n"
        }
        return descripcion
    }
}