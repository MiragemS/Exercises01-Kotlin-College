package Ex20

fun main() {
    println("---------- CALCULADORA DE MÉDIA ----------")
    print("Insira a primeira nota: ")
    var nota1 = readln().toDouble()
    print("Insira a segunda nota: ")
    var nota2 = readln().toDouble()

    media(nota1, nota2)
}

fun media(nota1 : Double, nota2 : Double){
    var resultado = (nota1+nota2)/2
    println("A média do aluno será: ${resultado}")
}