package Ex19

fun main() {
    val vetor = IntArray(10)

    for (i in vetor.indices) {
        print("Digite um número para a posição ${i + 1}: ")
        vetor[i] = readln().toInt()
    }

    ordena(vetor)
}

fun ordena(vetor: IntArray) {
    vetor.sort()
    println("Valores ordenados: ${vetor.joinToString(", ")}")
}
