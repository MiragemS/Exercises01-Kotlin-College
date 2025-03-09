package Ex04

fun main() {
    println("CONVERSOR PARA FAHRENHEIT")
    println("Insira a temperatura desejada: ")
    var temperaturaCelsius = readln().toDouble()

    var temperaturaFahrenheit = conversorTemperatura(temperaturaCelsius)

    println("Temperatura em Celsius: ${temperaturaCelsius} \n" +
            "Temperatura em Fahrenheit: ${temperaturaFahrenheit}")
}

fun conversorTemperatura (temperaturaCelsius: Double) : Double{
    return (temperaturaCelsius*1.8)+32
}