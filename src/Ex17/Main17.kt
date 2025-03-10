package Ex17

fun main() {
    println("---------- CALCULADORA IMC ----------")

    print("Insira a altura desejada: ")
    var altura = readln().toDouble()
    print("Insira o peso desejado: ")
    var peso = readln().toDouble()

    var imc = calculaImc(altura, peso)

    println("Indice de Massa Corporal: ${imc}")
}

fun calculaImc(altura : Double, peso : Double) : Double{
    return peso/(altura*altura)
}