package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco
import java.util.*

fun testaFuncoesEscopo() {
    //    val endereco = Endereco(logradouro = "rua vergueiro", numero = 3185)
//    val enderecoEmMaiusculo = "${endereco.logradouro}, ${endereco.numero}".uppercase(Locale.getDefault())
//    println(enderecoEmMaiusculo)

    run {
        println("Execução do run sem extensão!")
    }

    val endereco = Endereco()
        .also { println("Criando endereço!") }
        .apply {
            logradouro = "rua vergueiro"
            numero = 3185
        }

    with(endereco) {
        "$logradouro, $numero".uppercase(Locale.getDefault())
    }.let { enderecoEmMaiusculo: String ->
        println(enderecoEmMaiusculo)
    }

    listOf(
        Endereco(complemento = "casa"),
        Endereco(),
        Endereco(complemento = "apartamento")
    )
        .filter(predicate = { endereco -> endereco.complemento.isNotEmpty() })
        .let(block = (::println))
}