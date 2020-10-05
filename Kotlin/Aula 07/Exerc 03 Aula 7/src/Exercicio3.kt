fun main(){
    val foguinho = Atleta("Foguinho")
    val palito = Atleta("Palito")
    val prova1 = Prova()
    val prova2 = Prova()
    val prova3 = Prova()

    foguinho.nivel = 60
    foguinho.energia = 20
    palito.nivel = 70
    palito.energia = 30

    prova1.dificuldade = 50
    prova1.energiaNecessaria = 10
    prova2.dificuldade = 60
    prova2.energiaNecessaria = 20
    prova3.dificuldade = 70
    prova3.energiaNecessaria = 30

    println("Na prova 1 temos: ")
    prova1.realizarProva(foguinho)
    prova1.realizarProva(palito)
    println("Na prova 2 temos: ")
    prova2.realizarProva(foguinho)
    prova2.realizarProva(palito)
    println("Na prova 3 temos: ")
    prova3.realizarProva(foguinho)
    prova3.realizarProva(palito)


}