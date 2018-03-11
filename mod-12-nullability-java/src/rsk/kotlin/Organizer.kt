package rsk.kotlin

import rsk.java.Address
import rsk.java.Meeting

fun main(args: Array<String>) {
    val m = Meeting();

//    m.addTitle("Title")
////    m.addTitle(null)
//
//    val title: String? = m.meetingTitle();
//
//    println(title)

    val title:String = m.titleCanBeNull() ?: "nobody"

    println(title)
}

class HomeAddress : Address {
    override fun getFirstAddress(): String {
        return "";
    }
}

class WorkAddress : Address {
    override fun getFirstAddress(): String? {
        return "";
    }
}

