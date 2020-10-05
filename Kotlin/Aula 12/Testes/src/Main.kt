fun main(){
    val pessoas = mutableMapOf(112233L to "felipe",
                               223344L to "Gabriel",
                               334455L to "Lucas")

    // pessoas[2255770] = "Lais"
    for(pessoa in pessoas.keys){
        println(pessoa)
    }
    for(pessoa in pessoas.values){
        println(pessoa)
    }
}