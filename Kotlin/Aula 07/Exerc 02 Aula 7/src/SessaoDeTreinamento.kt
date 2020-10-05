class SessaoDeTreinamento(var jogador: JogadorDeFutebol){

    fun treinar(){
        println("Experiência inicial do ${jogador.nome} é ${jogador.experiencia}")
        jogador.correr()
        jogador.fazerGol()
        jogador.correr()
        jogador.experiencia += 10
        println("Experiência final do ${jogador.nome} é ${jogador.experiencia}")
    }

}