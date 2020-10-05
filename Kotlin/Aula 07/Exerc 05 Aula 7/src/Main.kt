
fun main(){
    val concessionaria = Concessionária()
    val carro = Veiculo("Fiat", "Palio Fire", 2007, "Vermelho", 60000.00)
    val cliente = Cliente("Carol", "Lima", 984187554)

    concessionaria.registrarVenda(carro, cliente, 12000.00)

}