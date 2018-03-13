package rsk

fun main(args: Array<String>) {
    val meetings = listOf(BoardMeeting(), FinanceMeeting())

    val board = meetings.typeOf<BoardMeeting>()

    println(board.count())
}

inline fun <reified T> List<*>.typeOf() : List<T> {
    val returnList = mutableListOf<T>()

    for(item in this) {
        if (item is T) {
            returnList.add(item)
        }
    }
    return returnList
}

open class Meeting {

}

class BoardMeeting : Meeting() {

}

class FinanceMeeting : Meeting() {

}