package teste

import arrays.bigDecimalArrayOf
import arrays.calculaAumentoRelativo
import arrays.media
import arrays.somatoria
import java.math.BigDecimal
import java.math.RoundingMode

fun testaArrayObjetos() {
    val salarios = bigDecimalArrayOf("1500.55", "2000.00", "5000.00", "10000.00")
    println(salarios.contentToString())

    val aumento = "1.1".toBigDecimal()
    val salariosComAumento: Array<BigDecimal> = salarios
        .map { salario -> calculaAumentoRelativo(salario, aumento) }
        .toTypedArray()

    println(salariosComAumento.contentToString())

    val gastoInicial = salariosComAumento.somatoria()
    println("Gasto Inicial: $gastoInicial")

    val meses = 6.toBigDecimal()
    val gastoTotal = salariosComAumento.fold(gastoInicial) { acumulador, salario ->
        acumulador + (salario * meses).setScale(2, RoundingMode.UP)
    }
    println("Gasto Total: $gastoTotal")

    val mediaDosUltimosTresSalarios = salariosComAumento
        .sorted()
        .takeLast(3)
        .toTypedArray()
        .media()
    println("Média dos últimos 3 salários: $mediaDosUltimosTresSalarios")

    val mediaDosTresPrimeirosSalarios = salariosComAumento
        .sorted() // Realiza a ordenação dos elementos dentro da lista
        .take(3) //Utilizado para pegar os elementos dentro de uma lista
        .toTypedArray() //Transforma o retorno em um Array
        .media() //Chama a função que calcula média
    println("Média dos últimos 3 salários: $mediaDosTresPrimeirosSalarios")
}