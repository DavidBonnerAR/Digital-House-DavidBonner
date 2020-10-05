fun main(){
    val listaFuncionarios = arrayListOf<Funcionario>()
    val funcionario1 = Funcionario("F1", 1)
    val funcionario2 = Funcionario("F2", 2)
    val funcionario3 = Funcionario("F3", 3)
    val funcionario4 = Funcionario("F4", 4)
    listaFuncionarios.add(funcionario1)
    listaFuncionarios.add(funcionario2)
    listaFuncionarios.add(funcionario3)
    listaFuncionarios.add(funcionario4)
    val funcionario5 = Funcionario("F5", 4)
    println(listaFuncionarios.contains(funcionario5))


}