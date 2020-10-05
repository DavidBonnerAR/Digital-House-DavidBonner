fun main(){
    print("Digite o sexo: ")
    var sexo = readLine()!!.toLowerCase()
    when (sexo) {
        "f" -> print("Feminino")
        "m" -> print("masculino")
        else -> print("Sexo invalido")
    }
}