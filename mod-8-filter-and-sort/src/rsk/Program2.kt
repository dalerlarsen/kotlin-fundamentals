package rsk

fun main(args: Array<String>) {

    val meetings = listOf(Meeting(1, "Board Meeting"), Meeting(2, "Committee Meeting"))

    var people: List<List<Person>> = meetings
            .map(Meeting::people)


    var people2: List<Person> = meetings
            .flatMap(Meeting::people)
            .distinct()

    for (p in people2) {
        println(p.name)
    }
}

