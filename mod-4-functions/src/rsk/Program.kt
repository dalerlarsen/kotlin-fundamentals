@file:JvmName("DisplayFunctions")
package rsk

fun main(args: Array<String>) {
    log("Hello World", 3)
}

@JvmOverloads
fun log(message: String, logLevel: Int = 1) {
    println(message + logLevel)
}

fun max(a: Int, b: Int): Int = if (a > b) a else b