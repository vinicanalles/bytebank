import br.com.alura.bytebank.modelo.Autenticavel
import br.com.alura.bytebank.modelo.Endereco
import br.com.alura.bytebank.modelo.SistemaInterno
import java.util.*

fun main() {

//    val endereco = Endereco(logradouro = "rua vergueiro", numero = 3185)
//    val enderecoEmMaiusculo = "${endereco.logradouro}, ${endereco.numero}".uppercase(Locale.getDefault())
//    println(enderecoEmMaiusculo)

    run {
        println("Execução do run sem extensão!")
    }

    val endereco = Endereco()
        .also { println("Criando endereço!") }
        .apply {
            logradouro = "rua vergueiro"
            numero = 3185
        }

    with(endereco) {
        "$logradouro, $numero".uppercase(Locale.getDefault())
    }.let { enderecoEmMaiusculo: String ->
        println(enderecoEmMaiusculo)
    }

    listOf(
        Endereco(complemento = "casa"),
        Endereco(),
        Endereco(complemento = "apartamento")
    )
        .filter(predicate = { endereco -> endereco.complemento.isNotEmpty() })
        .let(block = (::println))

    soma(1, 5, resultado = (::println))

    val autenticavel = object : Autenticavel {
        val senha = 1234
        override fun autentica(senha: Int) = this.senha == senha
    }

    SistemaInterno().entra(autenticavel, 1234, autenticado = {
        println("realizar pagamento")
    })
}

fun soma(a: Int, b: Int, resultado: (Int) -> Unit) {
    println("antes da soma")
    resultado(a + b)
    println("depois da soma")
}