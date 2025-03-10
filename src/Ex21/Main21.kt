package Ex21

fun main() {
    println("CONVERSOR PARA CELSIUS")
    println("Insira a temperatura desejada: ")
    var temperaturaFahrenheit= readln().toDouble()

    var temperaturaCelsius = Celsius(temperaturaFahrenheit)

    println("Temperatura em Celsius: ${temperaturaCelsius} \n" +
            "Temperatura em Fahrenheit: ${temperaturaFahrenheit}")
}

fun Celsius (temperaturaFahrenheit: Double) : Double{
    return (temperaturaFahrenheit-32)/1.8
}