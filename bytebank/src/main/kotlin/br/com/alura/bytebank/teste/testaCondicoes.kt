fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> println("br.com.alura.bytebank.modelo.Conta é positiva")
        saldo == 0.0 -> println("br.com.alura.bytebank.modelo.Conta é neutra")
        else -> println("br.com.alura.bytebank.modelo.Conta é negativa")
    }
}