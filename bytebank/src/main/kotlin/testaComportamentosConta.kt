fun testaComportamentosConta() {
    val contaVinicius = ContaCorrente(titular = "Vinicius", numero = 1000)
    contaVinicius.deposita(200.0)

    println(contaVinicius.titular)
    println(contaVinicius.numero)
    println(contaVinicius.saldo)

    val contaFran = ContaPoupanca(numero = 1001, titular = "Fran")
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