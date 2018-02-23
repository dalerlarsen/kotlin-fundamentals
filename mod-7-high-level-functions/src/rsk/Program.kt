package rsk

fun main(args: Array<String>) {
    var program = Program()

//    program.fibonacci(8)
//    program.fibonacci(8, object : Process {
//        override fun execute(value: Int) {
//            println(value)
//        }
//    })

    program.fibonacci(8, {n -> println(n)})

    // same thing below..different syntax
    program.fibonacci(8) {n -> println(n)}

    // even more reduced
    program.fibonacci(8) {println(it)}

    // even more reduced
    program.fibonacci(8, ::println)


}

interface Process {
    fun execute(value: Int)
}

class Program {
    // 1,1,2,3,5,8,13,...

    fun fibonacci(limit: Int, action: (Int) -> Unit) {
        var prev = 0
        var prevprev = 0
        var current = 1

        for (i: Int in 1..limit) {
            action(current)

            var temp = current
            prevprev = prev
            prev = temp
            current = prev + prevprev
        }
    }

    fun fibonacci(limit: Int, action: Process) {
        var prev = 0
        var prevprev = 0
        var current = 1

        for (i: Int in 1..limit) {
            action.execute(current)

            var temp = current
            prevprev = prev
            prev = temp
            current = prev + prevprev
        }
    }

    fun fibonacci(limit: Int) {
        var prev = 0
        var prevprev = 0
        var current = 1

        for (i: Int in 1..limit) {
            println(current)

            var temp = current
            prevprev = prev
            prev = temp
            current = prev + prevprev
        }
    }
}