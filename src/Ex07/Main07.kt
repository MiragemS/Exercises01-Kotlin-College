package Ex07

fun main() {
    println("SALDO FINAL")

    println("Insira o número da conta desejada: ")
    var numeroConta = readln().toInt()
    println("Insira o saldo inicial: ")
    var saldoInicial = readln().toDouble()
    println("Insira o débito da conta: ")
    var debito = readln().toDouble()
    println("Insira o crédito da conta: ")
    var credito = readln().toDouble()

    saldoAtualizado(numeroConta, saldoInicial, debito, credito)


}

fun saldoAtualizado(numeroConta: Int, saldoInicial: Double, debito: Double, credito: Double) {
    var saldoAtual = saldoInicial-debito+credito

    println("---------------- Dados atualizados ----------------")
    println("Numero da conta: ${numeroConta} \n" +
            "Saldo atual: ${saldoAtual} \n" +
            "Situação: ${statusConta(saldoAtual)}")

}

fun statusConta(saldoAtual : Double) : String {
    if (saldoAtual >= 0) return "Saldo positivo"
    else return "Saldo negativo"
}