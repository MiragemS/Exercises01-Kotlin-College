package Ex01

fun main() {
    var pesoIdeal = 0.0

    print("Digite a altura (em metros): ")
    val altura = readLine()!!.toDouble()

    print("Digite o sexo (M/F): ")
    val sexo = readLine()!!.uppercase()

    if (sexo == "M") {
        pesoIdeal = (72.7 * altura) - 58
    } else if (sexo == "F") {
        pesoIdeal = (62.1 * altura) - 44.7
    } else {
        println("Sexo inválido.")
    }

    println("O peso ideal é: ${"%.2f".format(pesoIdeal)} kg")
}
