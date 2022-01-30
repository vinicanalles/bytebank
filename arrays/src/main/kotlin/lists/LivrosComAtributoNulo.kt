package lists

fun main() {
    val agrupadosPorEditora = listaDeLivros
        .groupBy { it.editora ?: "Editora desconhecida" } //retorna um map contendo a chave e um valor
        .forEach { (editora: String, livros: List<Livro>) ->
            println("Nome da editora: $editora : ${livros.joinToString { it.titulo }}")
        }
}