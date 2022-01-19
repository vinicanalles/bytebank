package br.com.alura.bytebank.modelo

class Cliente(
    val nome: String,
    val cpf: String,
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