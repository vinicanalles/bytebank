class ContaCorrente(
    titular: String,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {
    override fun sacar(valor: Double) {
        val valorComTaxa = valor + 0.1
        super.sacar(valorComTaxa)
    }
}