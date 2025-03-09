package Ex05

fun main() {
    println("CALCULADORA DE NOTA")

    println("Insira a primeira nota: ")
    var nota1 = readln().toDouble()
    println("Insira a segunda nota:" )
    var nota2 = readln().toDouble()
    println("Insira a terceira nota: ")
    var nota3 = readln().toDouble()

    var resultado = calculaNota(nota1, nota2, nota3)

    println("Média final: ${resultado}")
}

fun calculaNota(nota1: Double, nota2: Double, nota3: Double) : Double{
    return (nota1*2+nota2*3+nota3*5)/10
}