fun main(){
    print("Digite o peso dos peixes: ")
    var peso = readLine()!!.toDouble()
    if(peso <= 50){
        println("Sem excesso!")
    } else{
        var excesso = peso - 50
        println("O excesso é $excesso kg.")
        println("A multa é de R$" + excesso*4)
    }
}