abstract class ContaBancaria(private val numeroConta: Int, var saldo: Double), Impri {

    abstract fun sacar(valor: Double)
    abstract fun depositar(valor: Double)
    abstract fun mostrarDados(){

    }

}