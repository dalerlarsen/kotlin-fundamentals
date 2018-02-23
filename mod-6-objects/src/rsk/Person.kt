package rsk

fun main(args: Array<String>) {
    val dale = Student("Dale", "Larsen", 1)
    val kevin = Student("Kevin", "Jones", 2, "Somebody")

    println(kevin.id)

    Student.createPostgraduate("DalePost")
    Student.createUndergraduate("DaleUnder")
}

class Program {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val dale = Student("Dale", "Larsen", 1)
            val kevin = Student("Kevin", "Jones", 2, "Somebody")

            println(kevin.id)

            Student.createPostgraduate("DalePost")
            Student.createUndergraduate("DaleUnder")
        }
    }
}

abstract class Person(var firstName: String, var lastName: String) {

    open fun getName() : String = "$firstName $lastName"

    abstract fun getAddress() : String
}

// this is better than the secondary constructor
open class Student(firstName: String, lastName: String, _id: Int, tutor: String = "") : Person(firstName, lastName) {
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

    companion object : XmlSerialize<Student> {
        override fun toXml(item: Student) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        fun createUndergraduate(name: String): Undergraduate {
            return Undergraduate(name)
        }
         fun createPostgraduate(name: String): Postgraduate {
            return Postgraduate(name)
        }
    }
}

class Undergraduate(firstName: String) : Student(firstName, "", 1) {

}

class Postgraduate(firstName: String) : Student(firstName, "", 1) {

}

interface XmlSerialize<T> {
    fun toXml(item: T)
}



