fun testaFuncionarios() {
    val alex = Funcionario(nome = "Alex", cpf = "111.111.111-11", salario = 1000.0)

    println("Nome: ${alex.nome}")
    println("CPF: ${alex.cpf}")
    println("Salário: ${alex.salario}")
    println("Bonificação do ${alex.nome}: ${alex.bonificacao}")

    val fran = Gerente(nome = "Fran", cpf = "222.222.222-22", salario = 2000.0, senha = 1234)

    println("Nome: ${fran.nome}")
    println("CPF: ${fran.cpf}")
    println("Salário: ${fran.salario}")
    println("Bonificacao da ${fran.nome}: ${fran.bonificacao}")

    if (fran.autentica(senha = 1234)) {
        println("Gerente autenticado com sucesso!")
    } else {
        println("Falha na autenticação!")
    }

    val gui = Diretor(nome = "Gui", cpf = "333.333.333-33", salario = 4000.0, senha = 4000, plr = 200.0)

    println("Nome: ${gui.nome}")
    println("CPF: ${gui.cpf}")
    println("Salário: ${gui.salario}")
    println("Bonificacao da ${gui.nome}: ${gui.bonificacao}")
    println("PLR: ${gui.plr}")

    if (gui.autentica(senha = 4000)) {
        println("Gerente autenticado com sucesso!")
    } else {
        println("Falha na autenticação!")
    }

    val maria = Analista(nome = "Maria", cpf = "444.444.444-44", salario = 3000.0)

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(alex)
    calculadora.registra(fran)
    calculadora.registra(gui)
    calculadora.registra(maria)

    println("O Total de bonificação é igual: ${calculadora.total}")
}