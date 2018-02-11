import java.util.*

fun main(args: Array<String>) {
//    do {
//
//    } while (true)
//
//
//    while (true) {
//
//    }


    // ranges
    var myValues = 1..10
    // inclusive
    for (i in 1..10 step 2) {
        println(i)
    }
    println()

    for (i in 1 until 10) {
        println(i)
    }

    var numbers = listOf(1, 2, 3, 4, 5)
    for (i in numbers) {
        println(i)
    }

    var ages = TreeMap<String, Int>()
    ages["Kevin"] = 54
    ages["Sam"] = 28
    ages["Joe"] = 15
    ages["Mary"] = 76

    for ((name, age) in ages) {
        println("$name is $age")
    }

    for ((index, element) in numbers.withIndex()) {
        println("$element at $index")
    }

    var range = 'a' .. 'z'

}

class Question {
    var Answer: String? = null
    val CorrectAnswer = "42"
    val Question: String = "What is the answer to life"

    fun display() {
        println("You said $Answer")
    }

    fun printResults() {
        when (Answer) {
            CorrectAnswer -> println( "You were correct")
            else -> println("Try again")
        }
    }

}