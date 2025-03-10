package Ex11

fun main() {
    println("-------- Tabuada --------")
    println("Deseja ver a tabuada de qual digito: ")
    var numero = readln().toInt()

    for(i in 1..10){
        println("${numero}*${i} = ${numero*i}")
    }
}