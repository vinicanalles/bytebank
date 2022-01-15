fun main() {
    println("Bem vindo ao ByteBank!")

    val alex = Funcionario(nome = "Alex", cpf = "111.111.111-11", salario = 1000.0)

    println("Nome: ${alex.nome}")
    println("CPF: ${alex.cpf}")
    println("Salário: ${alex.salario}")
    println("Bonificação do ${alex.nome}: ${alex.bonificacao()}")

    val fran = Gerente(nome = "Fran", cpf = "222.222.222-22", salario = 2000.0, senha = 1234)

    println("Nome: ${fran.nome}")
    println("CPF: ${fran.cpf}")
    println("Salário: ${fran.salario}")
    println("Bonificacao da ${fran.nome}: ${fran.bonificacao()}")

    if (fran.autentica(senha = 1239)){
        println("Gerente autenticado com sucesso!")
    }else {
        println("Falha na autenticação!")
    }
}