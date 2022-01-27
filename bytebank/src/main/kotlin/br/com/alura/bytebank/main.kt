fun main() {
    println("Início main")
    funcao1()
    println("Fim main")
}

fun funcao1() {
    println("Início funcao1")
    try {
        funcao2()
    } catch (e: ClassCastException) {
        println(e.message)
        println(e.cause)
        println(e.stackTrace)
        println(e.printStackTrace())
        println("ClassCastException foi pegada!")
    }
    println("Fim funcao1")
}

fun funcao2() {
    println("Início funcao2")
    for (i in 1..5) {
        println(i)
        val endereco = Any()
        throw ClassCastException()
    }
    println("Fim funcao2")
}