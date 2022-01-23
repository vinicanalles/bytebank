import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("NúmeroX: $numeroX")
    println("NúmeroY: $numeroY")

    println()

    val joao = Cliente(nome = "João", cpf = "", senha = 1)
    val maria = Cliente(nome = "Maria", cpf = "", senha = 2)

    val contaJoao = ContaCorrente(joao, 1002)
    var contaMaria = ContaPoupanca(maria, 1003)

    println("Titular br.com.alura.bytebank.modelo.Conta João: ${contaJoao.titular.nome}")
    println("Titular br.com.alura.bytebank.modelo.Conta Maria: ${contaMaria.titular.nome}")

    println(contaJoao)
    println(contaMaria)
}