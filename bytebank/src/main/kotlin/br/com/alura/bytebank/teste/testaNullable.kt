package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

fun testaNullable() {
    var enderecoNulo: Endereco? = Endereco(logradouro = "Rua Vergueiro", complemento = "prédio")
    val logradouroNovo: String? = enderecoNulo?.logradouro

    enderecoNulo?.let { endereco ->
        println(endereco.logradouro.length)
        val tamanhoComplemento: Int =
            endereco.complemento?.length ?: throw IllegalStateException("Complemento não pode ser vazio")
        println(tamanhoComplemento)
    }

    teste(1)
    teste("")
}

fun teste(valor: Any){
    val numero: Int? = valor as? Int
    println(numero)
}