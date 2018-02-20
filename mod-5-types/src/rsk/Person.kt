package rsk

fun main(args: Array<String>) {
    val dale = Student("Dale", "Larsen", 1)
    val kevin = Student("Kevin", "Jones", 2, "Somebody")

    println(kevin.id)
}


//open class Person {
//    var firstName: String = ""
//    var lastName: String = ""
//
//    open fun getName() : String = "$firstName $lastName"
//}

abstract class Person(var firstName: String, var lastName: String) {

    open fun getName() : String = "$firstName $lastName"

    abstract fun getAddress() : String
}

//class Student(val id: Int) : Person() {
//class Student(_id: Int) : Person() {
//    val id = _id

// this is better than the secondary constructor
class Student(firstName: String, lastName: String, _id: Int, tutor: String = "") : Person(firstName, lastName) {
    val id: Int

    init {
        id = _id
//        tutor = ""
    }

//    constructor(firstName: String, lastName: String, _id: Int, tutor: String) : this(firstName, lastName, _id) {
//        this.tutor = tutor
//    }
    override fun getAddress() : String {
        return ""
    }

    override fun getName() : String {return ""}
}