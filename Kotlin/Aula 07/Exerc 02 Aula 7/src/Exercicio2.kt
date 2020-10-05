fun main(){
    var meninoNey = JogadorDeFutebol()
    var oBruxo = JogadorDeFutebol()

    meninoNey.nome = "Neymar"
    meninoNey.energia = 70
    meninoNey.alegria = 77
    meninoNey.gols = 7
    meninoNey.experiencia = 50

    oBruxo.nome = "Ronaldinho"
    oBruxo.energia = 90
    oBruxo.alegria = 99
    oBruxo.gols = 9
    oBruxo.experiencia = 100

    SessaoDeTreinamento(meninoNey).treinar()
    SessaoDeTreinamento(oBruxo).treinar()
}