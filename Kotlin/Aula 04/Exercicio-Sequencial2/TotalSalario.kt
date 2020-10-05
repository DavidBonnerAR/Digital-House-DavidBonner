fun main(){
    println("Quanto vale a sua hora?")
    var valHora = readLine()!!.toDouble()
    println("Quantas horas você trabalhou?")
    var horasTrabalhadas = readLine()!!.toDouble()
    var Salario = valHora * horasTrabalhadas
    println("Seu salário é R$ $Salario")
}