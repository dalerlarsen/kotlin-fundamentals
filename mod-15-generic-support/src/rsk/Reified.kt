package rsk

fun main(args: Array<String>) {
    val names = listOf("Kevin")

    printType(names)
    // This one will give a ClassCastException
    printType(listOf(1))
}

fun printType(items: List<Any>) {
//    if (items is List<String>) {
//
//    }

    val stuff = items as List<String>

    stuff.filter { s -> s == "" }
}