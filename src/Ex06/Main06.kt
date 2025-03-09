package Ex06

val HORARIO_COMUM = 160

fun main() {

    println("CÁLCULO SALARIAL")
    println("Informe as horas trabalhadas neste mês: ")
    var horasTrabalhadas = readln().toInt()
    println("Insira o ganho por hora: ")
    var ganhoPorHora = readln().toDouble()

    var salarioTotal = calculaSalario(horasTrabalhadas, ganhoPorHora)

    println("\nInformações gerais: \n" +
            "Horas trabalhadas: ${horasTrabalhadas} \n" +
            "Ganho por hora: ${ganhoPorHora} \n" +
            "Banco de horas extra: ${horasTrabalhadas - HORARIO_COMUM} \n" +
            "Salário total: ${salarioTotal}")

}

fun calculaSalario(horasTrabalhadas : Int, ganhoPorHora : Double) : Double{
    var salario = HORARIO_COMUM*ganhoPorHora
    if(horasTrabalhadas <= HORARIO_COMUM){
        return salario
    } else {
        salario += (horasTrabalhadas- HORARIO_COMUM)*(ganhoPorHora*1.5)
    }
    return salario
}