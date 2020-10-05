fun main(){
    var num1 = readLine()!!.toInt()
    var num2 = readLine()!!.toInt()
    var num3 = readLine()!!.toInt()

    if(num1 > num2 && num1 > num3)
        println("O primeiro numero é o maior")
    else if(num2 > num1 && num2 > num3)
        println("O segundo numero é o maior")
    else if(num3 > num1 && num3 > num2)
        println("O terceiro numero é o maior")
    else
        println("Não há um maior número")
}