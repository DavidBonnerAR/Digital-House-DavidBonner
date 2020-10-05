fun main(){
    print("Qual valor a ser sacado?")
    var valor = readLine()!!.toDouble()
    var nota = 100
    var troco = 0.00
    var nota100 = 0.00
    var nota50 = 0.00
    var nota10 = 0.00
    var nota5 = 0.00
    var nota1 = 0.00
    var aux = 0

    if(valor > 0 && valor <= 600){
        nota = 100
        if(valor > nota) {
            nota100 = valor / nota
            aux = nota100.toInt()
            troco = valor % nota
            println("Notas de 100: " + aux)
        }
        nota = 50
        if(troco > nota) {
            nota50 = troco / nota
            aux = nota50.toInt()
            troco = valor % nota
            println("Notas de 50: " + aux)
        }
        nota = 10
        if(troco > nota) {
            nota10 = troco / nota
            aux = nota10.toInt()
            troco = valor % nota
            println("Notas de 10: " + aux)
        }
        nota = 5
        if(troco > nota) {
            nota5 = troco / nota
            aux = nota5.toInt()
            troco = valor % nota
            println("Notas de 5: " + aux)
        }
        nota = 1
        if(troco > nota) {
            nota1 = troco / nota
            aux = nota1.toInt()
            troco = valor % nota
            println("Notas de 1: " + aux)
        }

    } else
        print("Valor invalido")
}