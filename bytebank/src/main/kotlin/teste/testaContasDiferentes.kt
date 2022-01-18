import modelo.ContaCorrente
import modelo.ContaPoupanca

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = "Alex",
        numero = 1000
    )

    val contaPoupanca = ContaPoupanca(
        titular = "Fran",
        numero = 1001
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("Saldo contaCorrente: ${contaCorrente.saldo}")
    println("Saldo contaPoupança: ${contaPoupanca.saldo}")

    contaCorrente.sacar(100.0)
    contaPoupanca.sacar(100.0)

    println("Saldo contaCorrente após saque: ${contaCorrente.saldo}")
    println("Saldo contaPoupança após saque: ${contaPoupanca.saldo}")

    contaCorrente.transfere(destino = contaPoupanca, valor = 100.0)

    println("Saldo contaCorrente após transferir para poupança: ${contaCorrente.saldo}")
    println("Saldo contaPoupança após receber transferência: ${contaPoupanca.saldo}")

    contaPoupanca.transfere(destino = contaCorrente, valor = 200.0)

    println("Saldo contaCorrente após receber transferência: ${contaCorrente.saldo}")
    println("Saldo contaPoupança após transferência para corrente: ${contaPoupanca.saldo}")
}