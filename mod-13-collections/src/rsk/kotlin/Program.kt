package rsk.kotlin

import rsk.java.Meeting
import rsk.java.Organizer

fun main(args: Array<String>) {
//    val people = listOf<Person?>()
//    val people = listOf(Person(40), null

//    var people : List<Person?>? = null
//
//    people = listOf(Person(23), Person(42), null)
//
//    for (person in people) {
//        println(person?.age)
//    }
//
    var people : MutableList<Person?>? = null

    people = mutableListOf(Person(23), Person(42))
    people.add(null)

    for (person: Person in people.filterNotNull()) {
        println(person.age)
    }



}

class Person(val age: Int) : Organizer {
    override fun processMeetings(meetings: MutableList<Meeting>?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}