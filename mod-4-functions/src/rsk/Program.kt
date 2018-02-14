@file:JvmName("DisplayFunctions")
package rsk

fun main(args: Array<String>) {
    log(message = "Hello World", logLevel = 3)
    log(logLevel = 3, message = "Hello World")
    log(message = "Hello World")
}

@JvmOverloads
fun log(message: String, logLevel: Int = 1) {
    println(message + logLevel)
}

fun max(a: Int, b: Int): Int = if (a > b) a else b