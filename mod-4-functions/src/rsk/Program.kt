package rsk

fun main(args: Array<String>) {
    display("Hello World")
}

fun display(message: String): Boolean {
    println(message)

    println(max(1, 2))
    return true
}

fun max(a: Int, b: Int): Int = if (a > b) a else b