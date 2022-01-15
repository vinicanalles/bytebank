fun testeLoopFor() {
    for (i in 5 downTo 1 step 1) {

        if (i == 4) continue

        val titular = "Vinicius $i"
        val numeroConta = 1000 + i
        var saldo = i + 10.0

        println("Titular $titular") //String Template
        println("Número Conta $numeroConta")
        println("Saldo $saldo")

        testaCondicoes(saldo)

        println()
    }
}

fun testaLoopWhile() {
    var i = 0
    while (i < 5) {
        val titular = "Vinicius $i"
        val numeroConta = 1000 + i
        var saldo = i + 10.0

        println("Titular $titular") //String Template
        println("Número Conta $numeroConta")
        println("Saldo $saldo")

        testaCondicoes(saldo)

        println()

        i++
    }
}