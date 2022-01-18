package modelo

class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    fun registra(funcionario: Funcionario) {
        println("Nome: ${funcionario.nome}")
        this.total += funcionario.bonificacao
    }

//    fun registra(gerente: modelo.Gerente) {
//        this.total += gerente.bonificacao
//    }
//
//    fun registra(diretor: modelo.Diretor) {
//        this.total += diretor.bonificacao
//    }
}