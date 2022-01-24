import br.com.alura.bytebank.modelo.Endereco

fun main() {
    println("Início main")
    val entrada: String = "1.0"

    val valorRecebido: Double? = try {
        entrada.toDouble()
    } catch (e: NumberFormatException) {
        println("Problema na conversão")
        e.printStackTrace()
        null
    }

    val valorComTaxa: Double? = if (valorRecebido != null) {
        valorRecebido + 0.1
    } else {
        null
    }

    if (valorComTaxa != null) {
        println("valor recebido: $valorComTaxa")
    } else {
        println("valor inválido")
    }

    funcao1()
    println("Fim main")
}

fun funcao1() {
    println("Início funcao1")
    try {
        funcao2()
    } catch (e: ClassCastException) {
        println(e.message)
        println(e.cause)
        println(e.stackTrace)
        println(e.printStackTrace())
        println("ClassCastException foi pegada!")
    }
    println("Fim funcao1")
}

fun funcao2() {
    println("Início funcao2")
    for (i in 1..5) {
        println(i)
        val endereco = Any()
        endereco as Endereco //lança uma Exception ao tentar converter o objeto (ClassCastException)
    }
    println("Fim funcao2")
}