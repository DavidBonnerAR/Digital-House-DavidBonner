
public abstract class ContaBancaria(numeroConta: Int, saldo: Double): Imprimivel {

    abstract fun sacar(valor: Double)
    abstract fun depositar(valor: Double)


}