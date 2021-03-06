package rsk

fun main(args: Array<String>) {
    val ints = listOf(1, 2, 3, 4, 5)

    val smallInts = ints.filter { it < 4 }

    for (i: Int in smallInts) {
//        println(i)
    }

    val squaredInts = ints.map { it * it }

    for (i: Int in squaredInts) {
//        println(i)
    }

    val smallSquaredInts = ints
            .filter { it < 5 }
            .map { it * it }

    for (i: Int in smallSquaredInts) {
        println(i)
    }

    val meetings = listOf(Meeting(1, "Board Meeting"), Meeting(2, "Committee Meeting"))

    val titles: List<String> = meetings
            .filter { it -> it.title.startsWith("C")}
            .map { m -> m.title }

    for (title: String in titles) {
        println(title)
    }

    // Predicates

    val greaterThanThree = {v:Int -> v > 3}

//    var largeInts = ints.all { it > 3 }
    var largeInts = ints.all(greaterThanThree)
    println(largeInts)

//    largeInts = ints.any { it > 3 }
    largeInts = ints.any(greaterThanThree)
    println(largeInts)

//    var numberOfLargeInts = ints.count { it > 3 }
    var numberOfLargeInts = ints.count(greaterThanThree)
    println(numberOfLargeInts)

    var found = ints.findLast(greaterThanThree)
    println(found)



}

