package br.com.alura.bytebank.teste

import br.com.alura.bytebank.exception.SaldoInsuficienteException

fun funcao1() {
    println("Início funcao1")
    try {
        funcao2()
    } catch (e: SaldoInsuficienteException) {
        println(e.message)
        println(e.cause)
        println(e.stackTrace)
        println(e.printStackTrace())
        println("SaldoInsuficienteException foi pegada!")
    }
    println("Fim funcao1")
}

fun funcao2() {
    println("Início funcao2")
    for (i in 1..5) {
        println(i)
        throw SaldoInsuficienteException()
    }
    println("Fim funcao2")
}