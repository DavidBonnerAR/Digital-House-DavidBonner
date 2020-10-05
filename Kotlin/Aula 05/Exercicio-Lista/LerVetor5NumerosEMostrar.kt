fun main(){
    var numeros = ArrayList<Int>()
    for(i in 1..5){
        var numero = readLine()!!.toInt()
        numeros.add(numero)
    }
    numeros.forEach{element ->
        println(element)
    }
}