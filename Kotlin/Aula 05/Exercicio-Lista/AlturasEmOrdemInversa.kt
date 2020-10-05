fun main(){
    var alturas = ArrayList<Double>()
    for(i in 1..5){
        var numero = readLine()!!.toDouble()
        alturas.add(numero)
    }
    alturas.reverse()
    alturas.forEach{element ->
        println(element)
    }
}