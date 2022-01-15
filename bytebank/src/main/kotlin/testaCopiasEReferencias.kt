fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("NúmeroX: $numeroX")
    println("NúmeroY: $numeroY")

    println()

    val contaJoao = Conta("João", 1002)
    var contaMaria = Conta("Maria", 1003)

    println("Titular Conta João: ${contaJoao.titular}")
    println("Titular Conta Maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)
}