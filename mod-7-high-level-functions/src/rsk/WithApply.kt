package rsk

import java.util.*

class Meeting {
    var Title: String = ""
    var When: Date = Date()
    var Who = mutableListOf<String>()

    fun create() {}
}

fun main(args: Array<String>) {
    var m = Meeting()
    m.Title = "Board Meeting"
    m.When = Date(2017, 1, 1)
    m.Who.add("Kevin")

    var m2 = Meeting()
    with(m2) {
        Title = "Another Meeting"
        When = Date(2018, 1, 1)
        Who.add("Dale")
    }

    var m3 = Meeting()
    // good for builder pattern for example
    m3.apply {
        Title = "Again a Meeting"
        When = Date(2018, 2, 1)
        Who.add("Joe")
    }.create()


}