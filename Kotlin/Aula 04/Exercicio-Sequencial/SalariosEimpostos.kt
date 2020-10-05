fun main() {
    print("Quanto você recebe por hora? ")
    var valorPorHora = readLine()!!.toDouble()
    print("Quantas horas você trabalha por mês? ")
    var horasPorMes = readLine()!!.toDouble()
    val salarioBruto = valorPorHora * horasPorMes
    val valorImpostoRenda = salarioBruto - (salarioBruto * 0.89)
    val valorInss = salarioBruto - (salarioBruto * 0.92)
    val valorSindicato = salarioBruto - (salarioBruto * 0.95)
    println("+ Salário Bruto : R\$${salarioBruto}")
    println("- IR (11%) : R\$$valorImpostoRenda")
    println("- INSS (8%) : R\$$valorInss")
    println("- Sindicato (5%) : R\$$valorSindicato")
    println("= Salário Líquido : R\$${salarioBruto - (valorImpostoRenda + valorInss + valorSindicato)}")
}