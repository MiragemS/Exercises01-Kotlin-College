package Ex09

fun main() {
    println("------------- Calculadora de idade -------------")
    println("Insira o ano em que nasceu: ")
    var anoNascimento = readln().toInt()
    println("Insira o ano atual: ")
    var anoComparacao = readln().toInt()

    var diferencaAnos = (anoNascimento-anoComparacao)*-1
    var diferencaMeses = diferencaAnos*12
    var diferencaDias = diferencaAnos*365
    var diferencaSemanas = diferencaMeses*4

    println("------------- Tabela de comparação -------------")
    println("Diferença em anos: ${diferencaAnos} \n" +
            "Diferença em meses: ${diferencaMeses} \n" +
            "Diferença em semanas: ${diferencaSemanas} \n" +
            "Diferença em dias: ${diferencaDias}")


}



