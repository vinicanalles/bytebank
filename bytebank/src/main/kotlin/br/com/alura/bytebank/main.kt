fun main() {
//    testaTipoFuncaoClasse()
//    testaTipoFuncaoReferencia()
    val minhaFuncaoLambda = { a: Int, b: Int ->
        a + b
    }
    println(minhaFuncaoLambda(15, 10))

    val minhaFuncaoAnonima = fun(a: Int, b: Int): Int {
        return a + b
    }
    println(minhaFuncaoAnonima(10, 20))
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