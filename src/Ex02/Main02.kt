package Ex02

fun main() {
    print("Você deseja: \n1 - Ordem crescente \n2 - Ordem decrescente \n3 - Maior no meio\n ")
    val n = readLine()!!.toInt()

    print("Digite o primeiro valor: ")
    val a = readLine()!!.toInt()

    print("Digite o segundo valor: ")
    val b = readLine()!!.toInt()

    print("Digite o terceiro valor: ")
    val c = readLine()!!.toInt()

    val valores = listOf(a, b, c)

    when (n) {
        1 -> println("Valores em ordem crescente: ${valores.sorted()}")
        2 -> println("Valores em ordem decrescente: ${valores.sortedDescending()}")
        3 -> {
            val ordem = valores.sorted();
            println("Maior valor no meio: ${ordem[0]}, ${ordem[2]}, ${ordem[1]}")
        }
        else -> println("Número inválido.")
    }
}
