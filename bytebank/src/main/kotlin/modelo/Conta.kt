package modelo

abstract class Conta(
    var titular: String,
    val numero: Int
) {
    var saldo = 0.0
        protected set

    init {
        println("Inicializando a classe de conta: $titular")
    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            saldo += valor
        }
    }

    abstract fun sacar(valor: Double)

    fun transfere(destino: Conta, valor: Double): Boolean {
        if (saldo >= valor) {
            this.saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}