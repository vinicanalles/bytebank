package br.com.alura.bytebank.modelo

class ContaPoupanca(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {
    override fun sacar(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }
}