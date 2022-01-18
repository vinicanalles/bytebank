fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> println("modelo.Conta é positiva")
        saldo == 0.0 -> println("modelo.Conta é neutra")
        else -> println("modelo.Conta é negativa")
    }
}