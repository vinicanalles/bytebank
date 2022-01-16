open class Conta(
    var titular: String,
    val numero: Int
) {
    var saldo = 0.0
        private set

    init {
        println("Inicializando a classe de conta: $titular")
    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            saldo += valor
        }
    }

    open fun sacar(valor: Double) {
        if (this.saldo >= valor) {
            saldo -= valor
        }
    }

    fun transfere(destino: Conta, valor: Double): Boolean {
        if (saldo >= valor) {
            this.saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}