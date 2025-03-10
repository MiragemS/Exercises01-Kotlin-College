package Ex08

fun main() {
    println("---------- Aumento Salarial ----------")
    println("Insira o salário atual do funcionário: ")

    var salarioSemPromocao = readln().toDouble()
    var salarioComPromocao = calculoSalario(salarioSemPromocao)

    println("Novo salário: ${salarioComPromocao}")

}

fun calculoSalario(salarioSemPromocao : Double) : Double{
    return salarioSemPromocao*1.25
}