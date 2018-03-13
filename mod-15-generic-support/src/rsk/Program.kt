package rsk

fun main(args: Array<String>) {
    var names = listOf("Kevin", "Alex")

    val name = names.itemAt(0)

    println(name)

    val n: Node<Int> = Node(2)

    println(n.value())

    val d: Node<Double> = Node(3.3)

    println(d.value())

}

fun <T> List<T>.itemAt(idx: Int) : T {
    return this[idx]
}

class Node<T : Number>(private val item: T) {
    fun value() : T {
        return item
    }
}