
class Carro ( var consumoCombustivel : Double,  var qtdCombustivel : Double = 0.00 ) {

    fun andar(distancia: Double) {
        var gasto = consumoCombustivel * distancia
        qtdCombustivel -= gasto
        println("Andou $distancia km")
    }

    fun obterGasolina() {
        println("Há $qtdCombustivel L no tanque.")
    }

    fun adicionarGasolina(litros: Double) {
        qtdCombustivel += litros
        println("Abasteceu $litros L")
    }
}