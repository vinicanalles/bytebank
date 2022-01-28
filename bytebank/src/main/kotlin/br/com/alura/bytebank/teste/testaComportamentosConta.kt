import br.com.alura.bytebank.exception.FalhaAutenticacaoException
import br.com.alura.bytebank.exception.SaldoInsuficienteException
import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaComportamentosConta() {

    val alex = Cliente(nome = "Alex", cpf = "", senha = 1)

    val contaVinicius = ContaCorrente(titular = alex, numero = 1000)
    contaVinicius.deposita(200.0)

    println(contaVinicius.titular)
    println(contaVinicius.numero)
    println(contaVinicius.saldo)

    val fran = Cliente(nome = "Fran", cpf = "", senha = 2)

    val contaFran = ContaPoupanca(numero = 1001, titular = fran)
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

    try {
        contaFran.transfere(destino = contaVinicius, valor = 250.0, senha = 2)
        println("Transferência sucedida!")
    } catch (e: SaldoInsuficienteException) {
        println("Falha na transferência")
        println("Saldo insuficiente")
        e.printStackTrace()
    } catch (e: FalhaAutenticacaoException) {
        println("Falha na transferência!")
        println("Falha na Autenticação!")
        e.printStackTrace()
    }

    println("Saldo do ${contaVinicius.titular}: " + contaVinicius.saldo)
    println("Saldo da ${contaFran.titular}: " + contaFran.saldo)
}