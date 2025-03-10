package Ex10

fun main() {
    println("----------- Calculadora de volume paralelepipedo -----------")
    println("insira a largura: ")
    var largura = readln().toDouble()
    println("Insira o comprimento: ")
    var comprimento = readln().toDouble()
    println("Insira a altura: ")
    var altura = readln().toDouble()

    var volume = largura*comprimento*altura

    println("Volume: ${volume}")
}