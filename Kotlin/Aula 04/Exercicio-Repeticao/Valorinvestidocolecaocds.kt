fun main(){
    var valorInvestido = 0.00
    val valorCada = ArrayList<Double>()
    println("Quantos CDs quer adicionar?")
    var quantidade = readLine()!!.toInt()

    for(i in 1..quantidade){
        println("Digite o valor do $i º CD")
        var valor = readLine()!!.toDouble();
        valorCada.add(valor)
        valorInvestido += valor
    }
    var media = valorInvestido/quantidade

    println("O valor investido foi de R$$valorInvestido")
    println("A media de valor é $media")
}