package br.com.alura

fun main() {
    val pedidos: MutableMap<Int, Double> = mutableMapOf(
        Pair(1, 20.0),
        Pair(2, 34.0),
        3 to 50.0
    )
    println(pedidos)

    val pedido = pedidos[1]
    pedido?.let {
        println("pedido $it")
    }

    for (p: Map.Entry<Int, Double> in pedidos) {
        println("Número do pedido: ${p.key}")
        println("Valor do pedido: ${p.value}")
    }

    pedidos[4] = 70.0
    println(pedidos)

    pedidos.put(5, 80.0)
    println(pedidos)

    pedidos[1] = 100.0
    println(pedidos)

    pedidos.putIfAbsent(6, 200.0)
    println(pedidos)

    pedidos.putIfAbsent(6, 300.0)
    println(pedidos)

    pedidos.remove(6)
    println(pedidos)

    pedidos.remove(3, 50.0)
    println(pedidos)
}