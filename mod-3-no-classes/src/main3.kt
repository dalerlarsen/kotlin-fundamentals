fun main(args: Array<String>) {
    println("Hello World")
    val q:Question = Question()
//    val q:Question? = null
//    q = Question()

    q.Answer = "42"
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
            CorrectAnswer -> print( "You were correct")
            else -> print("Try again")
        }
    }

}