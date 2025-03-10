package Ex14

fun main() {
    println("---------- CALCULADORA DE MÉDIA ----------")
    print("Digite a primeira nota: ")
    val nota1 = readln().toFloat()

    print("Digite a segunda nota: ")
    val nota2 = readln().toFloat()

    print("Digite a terceira nota: ")
    val nota3 = readln().toFloat()

    calcularMedia(nota1, nota2, nota3)
}

fun calcularMedia(nota1: Float, nota2: Float, nota3: Float) {
    val media = (nota1 + nota2 + nota3) / 3
    println("A média do aluno é: %.2f".format(media))
}


