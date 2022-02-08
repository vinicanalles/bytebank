fun main() {
    val minhaFuncaoLambda: () -> Unit = {
        println("Executa como lambda!")
    }
    println(minhaFuncaoLambda())

    val minhaFuncaoAnonima: () -> Unit = fun () {
        println("Executa como anônima!")
    }
    println(minhaFuncaoAnonima())
}

fun testaTipoFuncaoClasse() {
    val minhaFuncaoClasse: () -> Unit = Teste()
    println(minhaFuncaoClasse())
}

fun testaTipoFuncaoReferencia() {
    val minhaFuncao: () -> Unit = ::teste
    println(minhaFuncao())
}

fun teste() {
    println("Executa Teste!")
}

class Teste : () -> Unit {
    override fun invoke() {
        println("Executa Invoke do Teste!")
    }
}