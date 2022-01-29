package teste

fun testaOperacoesAgregadoras() {
    val idades: IntArray = intArrayOf(10, 12, 18, 33, 40, 67)
    val maiorIdade = idades.maxOrNull()
    println("Maior idade: $maiorIdade")

    val menorIdade = idades.minOrNull()
    println("Menor idade: $menorIdade")

    val idadeMedia = idades.average()
    println("Idade média: $idadeMedia")

    //Retorna true quando todos satisfazem a condição
    val todosMaiores = idades.all { it >= 18 }
    println("Todos maiores? $todosMaiores")

    //Retorna true quando pelo menos um dos elementos satisfaz a condição
    val existeMaior = idades.any { it >= 18 }
    println("Algum aluno maior de idade? $existeMaior")

    //Retorna uma lista com os elementos que satisfazem a condição
    val maiores = idades.filter { idade ->
        idade >= 18
    }
    println("Maiores: $maiores")

    //Busca o primeiro elemento que satisfaz a condição
    val busca = idades.find { it >= 19 }
    println("Elemento encontrado: $busca")
}