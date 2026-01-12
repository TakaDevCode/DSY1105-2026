import Model.Cliente
fun main(){
    //MutableMap clientes
    var clientes: MutableMap<String, Cliente> = mutableMapOf()

    //Crear 3 clientes con sus atributos
    val cliente1 = Cliente("12345678-9", "Juan Perez", 28)
    val cliente2 = Cliente("98765432-1", "Maria Gomez", 34)
    val cliente3 = Cliente("11223344-5", "Carlos Sanchez", 45)
    clientes[cliente1.getRut()] = cliente1
    clientes[cliente2.getRut()] = cliente2
    clientes[cliente3.getRut()] = cliente3

    var rut = ""

    println("Buscador de clientes")
    println("Ingrese rut del cliente: ")
    rut = readln()
    if (clientes.containsKey(rut)){
        print(clientes[rut]?.mostrarInfo())
    }else{
        print("Cliente no encontrado:\n")
    }



}