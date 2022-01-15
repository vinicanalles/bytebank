fun main() {
    println("Bem vindo ao ByteBank!")
    val contaVinicius = Conta(titular = "Vinicius", numero = 1000)
    contaVinicius.deposita(200.0)

    println(contaVinicius.titular)
    println(contaVinicius.numero)
    println(contaVinicius.saldo)

    val contaFran = Conta(numero = 1001, titular = "Fran")
    contaFran.deposita(300.0)

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println("Depositando na conta do: ${contaVinicius.titular}")
    contaVinicius.deposita(50.0)
    println(contaVinicius.saldo)

    println("Depositando na conta do: ${contaFran.titular}")
    contaFran.deposita(70.0)
    println(contaFran.saldo)

    println("Sacando na conta do ${contaVinicius.titular}")
    contaVinicius.sacar(250.0)
    println("Saldo da conta do ${contaVinicius.titular} = " + contaVinicius.saldo)

    println("Sacando na conta da ${contaFran.titular}")
    contaFran.sacar(100.0)
    println("Saldo da conta da ${contaFran.titular} = " + contaFran.saldo)

    println("Sacando na conta do ${contaVinicius.titular} em excesso!")
    contaVinicius.sacar(100.0)
    println(contaVinicius.saldo)

    println("Sacando na conta da ${contaFran.titular} em excesso!")
    contaVinicius.sacar(500.0)
    println(contaVinicius.saldo)

    println("Transferência da conta da ${contaFran.titular} para a conta do ${contaVinicius.titular}")

    if (contaFran.transfere(destino = contaVinicius, valor = 300.0)) {
        println("Transferência sucedida!")
    } else {
        println("Falha na transferência!")
    }

    println("Saldo do ${contaVinicius.titular}: " + contaVinicius.saldo)
    println("Saldo da ${contaFran.titular}: " + contaFran.saldo)
}

class Conta(
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

    fun sacar(valor: Double) {
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

//    fun getSaldo() : Double{
//        return this.saldo
//    }
//
//    fun setSaldo(saldo: Double){
//        if (saldo < 0.0) {
//            println("Você não pode incluir um saldo negativo!")
//        }else {
//            this.saldo = saldo
//        }
//    }
}

fun testaCopiaEReferencias() {
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

fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> println("Conta é positiva")
        saldo == 0.0 -> println("Conta é neutra")
        else -> println("Conta é negativa")
    }
}

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