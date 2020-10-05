fun main(){
    print("Digite um nome: ")
    var nome = readLine()!!.toString()
    print("Digite uma idade: ")
    var idade = readLine()!!.toInt()
    print("Digite um salário: ")
    var salario = readLine()!!.toDouble()
    print("Digite um sexo: ")
    var sexo = readLine()!!.toString().toLowerCase()
    print("Digite um estado civil: ")
    var estado = readLine()!!.toString()

    if(nome.length > 3)
        println("Nome valido")
    else
        println("Nome invalido")

    if(idade > 0 && idade < 150)
        println("idade valida")
    else
        println("idade invalida")

    if(salario > 0)
        println("Salario valido")
    else
        println("Salario invalido")

    if(sexo == "f" || sexo == "m")
        println("sexo valido")
    else
        println("sexo invalido")

    when(estado){
        "s","c","v","d" -> println("Estado valido")
        else -> println("Estado invalido")
    }

}