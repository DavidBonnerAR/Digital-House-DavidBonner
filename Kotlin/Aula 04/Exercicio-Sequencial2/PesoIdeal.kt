fun main(){
    print("Digite a altura: ")
    var h = readLine()!!.toDouble()
    var peso = (72.7 * h) - 58
    print("Para homens: $peso kg \n")
    peso = (62.1 * h) - 44.7
    print("Para mulheres: $peso")
}