package br.com.alura.bytebank.modelo

class Cliente(
    var nome: String,
    val cpf: String,
    var endereco: Endereco = Endereco(),
    private val senha: Int
) : Autenticavel {

    override fun autentica(senha: Int): Boolean {
        println("Autentica br.com.alura.bytebank.modelo.Cliente")
        if (this.senha == senha) {
            return true
        }
        return false
    }

}