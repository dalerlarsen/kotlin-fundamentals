package rsk

fun main(args: Array<String>) {
    var kevin = StudentNew(1, "Kevin")
    var jones = StudentNew(1, "Kevin")

    println(kevin)

    if (kevin == jones) {
        println("Equal")
    } else {
        println("Not Equal")
    }

    var newKevin = kevin.copy(name = "Robert")

    println(newKevin)
}

data class StudentNew(val id: Int, val name: String) {

}