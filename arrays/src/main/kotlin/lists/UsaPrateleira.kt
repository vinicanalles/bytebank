package lists

fun main() {
    val prateleira: Prateleira = Prateleira(
        genero = "Literatura",
        livros = listaDeLivros
    )

    val porAutor = prateleira.organizarPorAutor()
    val porAnoPublicacao = prateleira.organizarPorAnoPublicacao()

    porAutor.imprimeComMarcadores()
    porAnoPublicacao.imprimeComMarcadores()
}