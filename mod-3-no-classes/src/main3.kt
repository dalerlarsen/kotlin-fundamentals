fun main(args: Array<String>) {
    println("Hello World")
    val q:Question = Question()
//    val q:Question? = null
//    q = Question()

    q.Answer = "Four"
//    q.Question = "Anything"

    q.display()

    println("The answer to the question ${q.Question} is ${q.Answer}")

//    var message: String
//    if (q.Answer == q.CorrectAnswer) {
//        message = "You were correct"
//    } else {
//        message = "Try again"
//    }

    val message= if (q.Answer == q.CorrectAnswer) {
        "You were correct"
    } else {
        "Try again"
    }

    println(message)

    q.printResults()

    val number: Int? = try {
        Integer.parseInt(q.Answer)
    } catch (e: NumberFormatException) {
        null
    }

    println("Number is $number")
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