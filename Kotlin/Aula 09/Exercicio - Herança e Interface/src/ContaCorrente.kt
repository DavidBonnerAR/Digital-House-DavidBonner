
open abstract class ContaCorrente(numeroConta: Int,
                    saldo: Double,
                    taxaDeOperacao: Double): ContaBancaria(numeroConta, saldo) {

}
//saldo não pode ser negativo