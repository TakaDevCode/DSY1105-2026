//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //Variables mutables e inmutables
    //Declaracion de variables mutables e inmutables
    var nombre = "Jose"
    var edad = 30
    println("Hola, mi nombre es $nombre y tengo $edad años.")
    //Uso de funcionalidades de String
    println("Nombre tiene ${nombre.length} caracteres.")

    println("Ingrese su edad: ")
    //readln para leer entrada del usuario
    //edad = readln().toInt()

    print("Ahora tienes $edad años.")

    //Condicionales
    //IF ELSE ELSE IF igual a JAVA
    // Comparador when(Switch de java)
    when(edad){
        in 1..8 -> println("Eres un niño")
        in 9..17 -> println("Eres un adolescente")
        in 18..30 -> println("Eres un adulto joven")
        in 31..60 -> println("Eres un adulto")
        else -> println("Eres una persona mayor")
    }

    //Ciclos - For, While, Do While
    var contador:Int = 1
    while (contador <= 5){
        println("Contador: $contador")
        contador++
    }

    contador = 1
    do {
        println("Contador en Do While: $contador")
        contador++
    }while(contador <= 5)

    for (i in 1..5) {
        println("Contador en For: $i")
    }
}