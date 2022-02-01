package br.com.alura

fun main() {
    val nomes: Collection<String> = listOf(
        "Alex",
        "Fran",
        "Gui",
        "Maria",
        "Ana"
    )

    for (nome in nomes.iterator()) {
        println(nome)
    }

    println("Tem o nome Alex? ${nomes.contains("Vinicius")}")
    println("Tamanho da coleção: ${nomes.size}")
}