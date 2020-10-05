fun main(){
    //List -> coleção de dados qualquer
    //Set -> especificado(ex não pode ter duplicado)
    //Map -> chave apontando para valor

    val pessoa1 = Pessoa("Felipe", 16)
    val pessoa2 = Pessoa("Gabriel", 18)
    val pessoa3 = Pessoa("Lucas", 20)
    val pessoa4 = Pessoa("Jo´se", 21)
    val pessoa5 = Pessoa("Lais", 20)
    val pessoa6 = Pessoa("Gui", 16)

    val pessoas = listOf(pessoa1, pessoa2, pessoa3, pessoa4, pessoa5, pessoa6)
    val pessoasAgrupadas = mutableMapOf<Int, ArrayList<Pessoa>>()

    pessoas.forEach{
        if(!pessoasAgrupadas.containsKey(it.idade)){
            pessoasAgrupadas[it.idade] = arrayListOf()
        }
        pessoasAgrupadas[it.idade]?.add(it)
    }
    println(pessoasAgrupadas)
}