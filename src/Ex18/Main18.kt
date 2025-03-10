package Ex18

fun main() {
    println("---------- CALCULADORA DE SALÁRIO ----------")

    print("Insira as horas trabalhadas: ")
    var hora = readln().toInt()
    print("Insira o ganho por hora: ")
    var ganhoHora = readln().toDouble()

    println("O salário previsto será de ${calculaSalario2(hora, ganhoHora)}")
}

fun calculaSalario2(hora : Int, ganhoHora : Double) : Double{
    return hora*ganhoHora
}