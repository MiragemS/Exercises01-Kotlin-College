package Ex13

fun main() {
    var sequencia = 1
    var auxiliar1 = 0
    var auxiliar2 = 0
    var step = 1

    println("---------- CALCULADORA FIBONACCI ----------")
    println("Deseja passar por quantas casas de Fibonacci: ")
    var casas = readln().toInt()

    for(i in 1..casas){
        if(step == 1){
            print("1, ")
            step++
            continue
        }

        auxiliar2 = auxiliar1
        auxiliar1 = sequencia
        sequencia = auxiliar1+auxiliar2

        print("${sequencia}, ")
    }
}