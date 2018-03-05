package rsk

fun iter(seq: Sequence<String>) {
    for (t in seq) println(t)

}
fun main(args: Array<String>) {

    val meetings = listOf(Meeting(1, "Board Meeting"), Meeting(2, "Committee Meeting"))

    val titles = meetings
            .asSequence()
            .filter { println("filter($it)" ); it.title.endsWith("g")}
            .map { println("map($it)"); it.title }

    iter(titles)

//    for (t in titles) println(t)
//
//    val titles2 = meetings
//            .asSequence()
//            .map { println("map($it)" );it.title.toUpperCase() }
//            .find { it.startsWith("BOARD") }
//
//    println(titles2)
}