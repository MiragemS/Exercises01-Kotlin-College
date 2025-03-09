package Ex03

fun main() {
    println("CÁLCULO DE DESCONTO - COMBUSTÍVEL")
    var valido = false
    var tipo: String

    do {
        println("Insira o tipo de gasolina:\nA - Álcool\nB - Gasolina")
        tipo = readln().uppercase()

        if (tipo != "A" && tipo != "B") {
            println("Tipo de combustível inválido")
        } else {
            valido = true
        }
    } while (!valido)

    println("Insiraa quantidade: ")
    var quantidade = readln().toInt()

    var total = desconto(tipo, quantidade)

    println("Tipo selecionado: ${tipo} \n" +
            "Quantidade escolhida: ${quantidade} \n" +
            "Total a pagar: ${total}")
}

fun desconto(tipo: String, quantidade: Int): Double {
    if(tipo.equals("A")){
        if(quantidade <= 20) return (quantidade*3.29)*0.97
        else return (quantidade*3.39)*0.95
    } else if(tipo.equals("B")){
        if(quantidade <= 20) return (quantidade*5.39)*0.96
        else return (quantidade*5.39)*0.94
    } else {
        return 0.0
    }
}