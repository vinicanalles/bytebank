fun main() {
    val minhaFuncao: () -> Unit = ::teste
    println(minhaFuncao())

    val minhaFuncaoClasse: () -> Unit = Teste()
    println(minhaFuncaoClasse())
}

fun teste() {
    println("Executa Teste!")
}

class Teste : () -> Unit {
    override fun invoke() {
        println("Executa Invoke do Teste!")
    }
}