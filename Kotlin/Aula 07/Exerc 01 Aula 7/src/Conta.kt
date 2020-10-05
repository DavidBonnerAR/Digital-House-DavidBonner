class Conta(val numero: Int, var saldo: Double, val titular: Cliente) {


    fun depositar(valor: Double){
        saldo += valor
        println("+++Deposito na conta de ${titular.nome} de R$ $valor realizado.")
        println("Novo saldo é R$ $saldo")
    }
    fun sacar(valor: Double){
        if(valor <= saldo) {
            saldo -= valor
            println("---Saque na conta de ${titular.nome} de R$ $valor realizado.")
            println("Novo saldo é R$ $saldo")
        } else{
            println("Saldo insuficiente.")
        }
    }
}