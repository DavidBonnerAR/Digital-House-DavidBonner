class Pessoa(val nome: String,
             val rg: Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Pessoa

        //if (nome != other.nome) return false
        if (rg != other.rg) return false

        return true
    }

    override fun hashCode(): Int {
        var result = nome.hashCode()
        result = 31 * result + rg
        return result
    }
}