class Prova {
    var dificuldade = 0
    var energiaNecessaria = 0

    fun realizarProva(atleta: Atleta){
        if(atleta.nivel >= dificuldade && atleta.energia >= energiaNecessaria) {
            atleta.energia -= energiaNecessaria
            println("${atleta.nome} pode realizar a prova")
        } else
            println("${atleta.nome} não pode realizar a prova")
    }
}