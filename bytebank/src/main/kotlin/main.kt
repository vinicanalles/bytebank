fun main() {
    println("Bem vindo ao ByteBank!")

    val alex = Funcionario(nome = "Alex", cpf = "111.111.111-11", salario = 1000.0)

    println("Nome: ${alex.nome}")
    println("CPF: ${alex.cpf}")
    println("Salário: ${alex.salario}")

    println("Bonificação do ${alex.nome}: ${alex.bonificacao()}")
}