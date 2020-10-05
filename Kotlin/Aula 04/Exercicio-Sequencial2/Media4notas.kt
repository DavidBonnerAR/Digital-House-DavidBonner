fun main(){
    var aux = 1
    var nota = 0.00
    var media = 0.00
    while(aux < 5){
        print("Digite a nota $aux: ")
        nota = readLine()!!.toDouble()
        media = media + nota/4
        aux++
    }
    print("A media é $media.")
}