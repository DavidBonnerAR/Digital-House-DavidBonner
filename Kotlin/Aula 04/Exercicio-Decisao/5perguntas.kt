fun main() {
    var resposta = "S"
    var culpa = 0
    while (resposta != "N") {
        println("Telefonou para a vítima?")
        resposta = readLine()!!.toUpperCase()
        if (resposta == "S") culpa++
        println("Esteve no local do crime?")
        resposta = readLine()!!.toUpperCase()
        if (resposta == "S") culpa++
        println("Mora perto da vítima?")
        resposta = readLine()!!.toUpperCase()
        if (resposta == "S") culpa++
        println("Devia para a vítima?")
        resposta = readLine()!!.toUpperCase()
        if (resposta == "S") culpa++
        println("Já trabalhou com a vítima?")
        resposta = readLine()!!.toUpperCase()
        if (resposta == "S") culpa++
        when(culpa){
            2 -> println("Suspeita")
            3,4 -> println("Cúmplice")
            5 -> println("Assassino")
            else -> println("Inocente")
        }
        culpa = 0
        println("Questionar outra pessoa? S p/ sim, N p/ não")
        resposta = readLine()!!.toUpperCase()
        println()
        println()
    }
}