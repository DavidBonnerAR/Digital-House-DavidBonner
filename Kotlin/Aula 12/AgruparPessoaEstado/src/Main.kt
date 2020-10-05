fun main(){
    val estado1 = Estado("MA", "Maranhão")
    val estado2 = Estado("PA", "Pará")
    val pessoa1 = Pessoa("Jao", estado1)
    val pessoa2 = Pessoa("Dav", estado1)
    val pessoa3 = Pessoa("Poli", estado2)
    val pessoa4 = Pessoa("Karl", estado1)

/*
    val pessoas = listOf(pessoa1, pessoa2, pessoa3, pessoa4)
    val agrupamento = mutableMapOf<Estado, MutableList<Pessoa>>()
    pessoas.forEach {
        if (!agrupamento.containsKey(it.estado)){
            agrupamento[it.estado] = mutableListOf()
        }
        agrupamento[it.estado]?.add(it)
    }
    println(agrupamento)
*/
    val estados = listOf(estado1, estado2)
    val pessoas = listOf(pessoa1, pessoa2, pessoa3, pessoa4)

    println(pessoas.groupBy { it.estado.sigla })
    println(estados.groupBy { it.nomeEstado })

}