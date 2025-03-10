package Ex16
val PI = 3.14

fun main() {
    println("---------- CALCULADORA ÁREA DA CIRCUNFERÊNCIA ----------")

    println("Insira o raio: ")
    var raio = readln().toDouble()

    var resultadoArea = calculaArea(raio)

    println("Área da circunferência: ${resultadoArea}")
}

fun calculaArea(raio : Double) : Double{
    return PI*raio*raio
}