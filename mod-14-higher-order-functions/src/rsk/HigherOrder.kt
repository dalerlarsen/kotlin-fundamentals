package rsk

val action = { println("Hello World") }
val calc: (Int, Int) -> Int = { x, y -> x * y }
//val calc = { x: Int, y: Int -> x * y }

fun doSomething(func: () -> Unit) {
    func()

    println(calc(3, 4))
}

fun main(args: Array<String>) {
    doSomething(action)
}