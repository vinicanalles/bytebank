import br.com.alura.bytebank.modelo.Endereco

fun main() {
    val testeFuncao: () -> Unit
    Endereco().let { }
    //higher order function
    "".let(::testeRecebeString)
    1.let {
        it
    }
    teste(1) {}
}

fun testeRecebeString(valor: String) {

}

fun teste(teste: Int, bloco: () -> Unit): () -> Unit {
    return {

    }
}