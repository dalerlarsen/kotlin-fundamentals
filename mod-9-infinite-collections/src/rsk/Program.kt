package rsk

fun main(args: Array<String>) {

    val meetings = listOf(Meeting(1, "Board Meeting"), Meeting(2, "Committee Meeting"))

    val titles = meetings
            .asSequence()
            .filter { println("filter($it)" ); it.title.endsWith("g")}
            .map { println("map($it)"); it.title }

    for (t in titles) println(t)
}