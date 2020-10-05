fun main(){
    var numeros = ArrayList<Int>()
    for(i in 1..10){
        var numero = readLine()!!.toInt()
        numeros.add(numero)
    }
    numeros.reverse()
    numeros.forEach{element ->
        println(element)
    }
}