fun main(){
    val numeros = ArrayList<Int>();
    for(num in 1..5){
        print("Digite o $num numero: ")
        val nume = readLine()!!.toInt()
        numeros.add(nume)
    }
    println()
    println("Os números são: ")
    numeros.forEach{ element ->
        println(element);
    }
}