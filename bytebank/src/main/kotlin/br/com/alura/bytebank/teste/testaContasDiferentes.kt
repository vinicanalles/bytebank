import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.Endereco

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = Cliente(nome = "Alex", cpf = "", senha = 1, endereco = Endereco(
            logradouro = "Rua Vergueiro"
        )),
        numero = 1000
    )

    println("titular ${contaCorrente.titular}")
    println("nome do titular ${contaCorrente.titular.nome}")
    println("cpf do titular ${contaCorrente.titular.cpf}")
    println("logradouro ${contaCorrente.titular.endereco.logradouro}")

    val contaPoupanca = ContaPoupanca(
        titular = Cliente(nome = "Fran", cpf = "", senha = 2),
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

    contaCorrente.transfere(destino = contaPoupanca, valor = 100.0, senha = 1)

    println("Saldo contaCorrente após transferir para poupança: ${contaCorrente.saldo}")
    println("Saldo contaPoupança após receber transferência: ${contaPoupanca.saldo}")

    contaPoupanca.transfere(destino = contaCorrente, valor = 200.0, senha = 2)

    println("Saldo contaCorrente após receber transferência: ${contaCorrente.saldo}")
    println("Saldo contaPoupança após transferência para corrente: ${contaPoupanca.saldo}")
}