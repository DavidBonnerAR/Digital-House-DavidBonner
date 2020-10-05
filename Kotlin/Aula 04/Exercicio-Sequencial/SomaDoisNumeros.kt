fun main() {
    print("Insira um número: ")
    var numero1 = readLine()!!.toInt()
    print("Insira um outro número: ")
    var numero2 = readLine()!!.toInt()
    println("$numero1 + $numero2 = ${numero1 + numero2}")
}