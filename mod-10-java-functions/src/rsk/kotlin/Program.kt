package rsk.kotlin

import rsk.java.User

fun main(args: Array<String>) {
    var user = User("Kevin")
    var count = 0

    user.create { println("User $it has been created: ${++count} times") }
    user.create { println("User $it has been created: ${++count} times") }
}