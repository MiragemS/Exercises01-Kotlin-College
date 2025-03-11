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
    for (i in vetor.indices) {
        for (j in 0 until vetor.size - i - 1) {
            if (vetor[j] > vetor[j + 1]) {
                val temp = vetor[j]
                vetor[j] = vetor[j + 1]
                vetor[j + 1] = temp
            }
        }
    }
    println("Valores ordenados: ${vetor.joinToString(", ")}")
}
