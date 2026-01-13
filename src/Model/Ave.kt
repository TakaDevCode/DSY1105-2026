package Model

class Ave : Animal {
    private var tipo: String = ""
    private var puedeVolar: Boolean = false

    constructor() : super() {

    }

    constructor(nombre: String, edad: Int, color: String, tipo: String, puedeVolar: Boolean) : super(
        nombre,
        edad,
        color
    ) {
        this.tipo = tipo
        this.puedeVolar = puedeVolar
    }

    fun getTipo(): String {
        return this.tipo
    }

    fun setTipo(tipo: String) {
        this.tipo = tipo
    }

    fun isPuedeVolar(): Boolean {
        return this.puedeVolar
    }

    fun setPuedeVolar(puedeVolar: Boolean) {
        this.puedeVolar = puedeVolar
    }

    override fun descripcion(): String {
        var descripcion = super.descripcion()
        descripcion += "Tipo: $tipo\n"
        if (puedeVolar) {
            descripcion += "Capacidad de vuelo: Puede volar\n"
        } else {
            descripcion += "Capacidad de vuelo: No puede volar\n"
        }
        return descripcion
    }
}