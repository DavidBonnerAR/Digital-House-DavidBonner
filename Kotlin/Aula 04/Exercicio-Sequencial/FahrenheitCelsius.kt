fun main() {
    print("Insira temperatura em Fahrenheit: ")
    var tempFahrenheit = readLine()!!.toInt()
    println("A temperatura em Celsius é ${5*((tempFahrenheit-32)/9)}")
}