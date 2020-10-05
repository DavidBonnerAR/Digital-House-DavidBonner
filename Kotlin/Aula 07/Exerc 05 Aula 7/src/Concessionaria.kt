
class Concessionária {
    val registroDeVendas = ArrayList<Venda>()

    fun registrarVenda(veiculo: Veiculo, cliente: Cliente, valor: Double){
        var vendaRegistrar = Venda(cliente, veiculo, valor)
        registroDeVendas.add(vendaRegistrar)
        println("Venda de um ${veiculo.modelo} para ${cliente.nome} realizada!")
        println("Há ${registroDeVendas.size} vendas no registro.")
    }


}