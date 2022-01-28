import br.com.alura.bytebank.modelo.Endereco

fun main() {
    var enderecoNulo: Endereco? = Endereco(logradouro = "Rua Vergueiro")
    val logradouroNovo: String? = enderecoNulo?.logradouro

    enderecoNulo?.let { endereco ->
        println(endereco.logradouro.length)
    }
}