fun main(){
    println("Tabuada de qual número?")
    var numero = readLine()!!.toInt()

    for (i in 1..10){
        println("$numero x $i = " + numero * i)
    }
}