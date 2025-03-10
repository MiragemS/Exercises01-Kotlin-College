package Ex12

fun main() {
    val PESQUISADOS = 10
    var salario = 0.0
    var maiorSalario = 0
    var numeroFilhos = 0

    println("---------- Pesquisa Cidadã ----------")

    for(i in 1..PESQUISADOS){
        println("Insira seu salário: ")
        salario += readln().toDouble()
        println("Insira quantos filhos tem: ")
        numeroFilhos += readln().toInt()
        println("-------------------\n")
    }

    println("---------- Resultados da pesquisa ----------")
    println("Maior salário: ${maiorSalario} \n" +
            "Média Salarial: ${salario/PESQUISADOS} \n" +
            "Média de filhos: ${numeroFilhos/PESQUISADOS}")
}