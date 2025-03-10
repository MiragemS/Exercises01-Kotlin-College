package Ex15

fun main() {
    var repeticao = true

    println("---------- CALCULADORA ----------")

    do{
        println("1 - Soma \n" +
                "2 - Subtração \n" +
                "3 - Multiplicação \n" +
                "4 - Divisão")
        var operacao = readln().toInt()

        if(operacao > 4 || operacao < 1){
            println("Digito fora das opções! tente novamente")
            continue
        }
        print("Insira o primeiro digito: ")
        var numero1 = readln().toDouble()
        print("Insira o segundo digito: ")
        var numero2 = readln().toDouble()

        when(operacao){
            1 -> Soma(numero1, numero2)
            2 -> Subtracao(numero1, numero2)
            3 -> Multiplicacao(numero1, numero2)
            4 -> Divisao(numero1, numero2)
        }

        println("Deseja fazer um novo calculo (s/n)")
        var opc = readln()
        if(opc == "s") repeticao = true
        else repeticao = false

    }while(repeticao)

}

fun Soma(numero1 : Double, numero2 : Double){
    println("${numero1}+${numero2} = ${numero1+numero2}")
}

fun Subtracao(numero1 : Double, numero2 : Double){
    println("${numero1}-${numero2} = ${numero1-numero2}")
}

fun Multiplicacao(numero1 : Double, numero2 : Double){
    println("${numero1}*${numero2} = ${numero1*numero2}")
}

fun Divisao(numero1 : Double, numero2 : Double){
    println("${numero1}/${numero2} = ${numero1/numero2}")
}