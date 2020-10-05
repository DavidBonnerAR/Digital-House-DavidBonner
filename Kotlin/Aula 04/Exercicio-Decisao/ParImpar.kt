fun main(){
    print("Digite o numero: ")
    var num = readLine()!!.toInt()
    if(num % 2 == 0)
        print("É par")
    else
        print("É impar")
}