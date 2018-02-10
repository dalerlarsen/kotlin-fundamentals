import rsk.Person

fun main(args: Array<String>) {
    println("Hello World")

    val kevin = Person("Kevin")

    println("Name is ${kevin.Name}")

    kevin.Name = "Steve"

    println("Name is ${kevin.Name}")

    kevin.display()

    kevin.displayWithLambda(::printName)

}

fun printName(name: String) {
    println(name)
}