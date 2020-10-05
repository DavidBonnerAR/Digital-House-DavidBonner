abstract  class ContaCorrente(val taxaDeOperacao: Double, numeroConta: Int, saldo: Double): ContaBancaria(numeroConta,
    saldo), Imprimivel {
    override fun sacar(valor: Double) {
        if (saldo >= (valor + taxaDeOperacao)) {
            saldo -= taxaDeOperacao
            saldo -= valor
            mostrarDados(valor, 1)
        }
        else
            mostrarDados(valor, 3)

    }

    override fun depositar(valor: Double) {
        saldo += valor
        saldo -= taxaDeOperacao
        mostrarDados(valor, 2)
    }
}