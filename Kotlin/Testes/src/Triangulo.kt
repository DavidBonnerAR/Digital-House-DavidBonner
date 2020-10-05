class Triangulo(val base: Int, val altura: Int): Forma() {
    override  val lado = 3

    override  fun calcularArea(): Int {
        var aux = (base * altura)
        aux = aux/2
        return aux
    }
}