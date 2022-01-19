import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("NúmeroX: $numeroX")
    println("NúmeroY: $numeroY")

    println()

    val contaJoao = ContaCorrente("João", 1002)
    var contaMaria = ContaPoupanca("Maria", 1003)

    println("Titular br.com.alura.bytebank.modelo.Conta João: ${contaJoao.titular}")
    println("Titular br.com.alura.bytebank.modelo.Conta Maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)
}