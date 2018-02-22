package rsk

fun main(args: Array<String>) {
    val dale = Student("Dale", "Larsen", 1)
    val kevin = Student("Kevin", "Jones", 2, "Somebody")

    println(kevin.id)
}

abstract class Person(var firstName: String, var lastName: String) {

    open fun getName() : String = "$firstName $lastName"

    abstract fun getAddress() : String
}

// this is better than the secondary constructor
class Student(firstName: String, lastName: String, _id: Int, tutor: String = "") : Person(firstName, lastName) {
    val id: Int

    init {
        id = _id
    }

    fun enroll(courseName: String) {
        val course = Courses.allCourses
                .filter {it.Title == courseName}
                .firstOrNull()
    }

    override fun getAddress() : String {
        return ""
    }

    override fun getName() : String {return ""}
}