fun main(){
    print("Digite o primeiro numero: ")
    var num1 = readLine()!!.toInt()
    print("Digite o segundo numero: ")
    var num2 = readLine()!!.toInt()
    num1++
    num2--
    for(num in num1..num2){
        println(num)
    }
}