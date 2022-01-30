package lists

data class Prateleira(
    val genero: String,
    val livros: MutableList<Livro>
) {
    fun organizarPorAutor(): MutableList<Livro> {
        livros.sortBy { it.autor }
        return livros
    }

    fun organizarPorAnoPublicacao(): MutableList<Livro> {
        livros.sortBy { it.anoPublicacao }
        return livros
    }
}