fun main() {
    testaTipoFuncaoClasse()
    testaTipoFuncaoReferencia()
//    val minhaFuncaoLambda: () -> Unit = {
//        println("Executa como lambda!")
//    }
//    println(minhaFuncaoLambda())
//
//    val minhaFuncaoAnonima: () -> Unit = fun () {
//        println("Executa como anônima!")
//    }
//    println(minhaFuncaoAnonima())
}

fun testaTipoFuncaoClasse() {
    val minhaFuncaoClasse: (Int, Int) -> Int = Soma()
    println(minhaFuncaoClasse(7, 3))
}

fun testaTipoFuncaoReferencia() {
    val minhaFuncao: (Int, Int) -> Int = ::soma
    println(minhaFuncao(2, 3))
}

fun soma(a: Int, b: Int): Int {
    return a + b
}

class Soma : (Int, Int) -> Int {
    override fun invoke(a: Int, b: Int): Int = a + b
}