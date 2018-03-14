package rsk

import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter

fun main(args: Array<String>) {
    var financeMeetings = mutableListOf(FinanceMeeting())
    var meetings: AllMeetings<FinanceMeeting> = AllMeetings(financeMeetings)

    attendAllMeetings(meetings)

}

// we add out T to make it Covariant
class AllMeetings<out T: Meeting>(val meetings: List<Meeting>) {
    val count: Int get() = meetings.count()

    operator fun get(i: Int) = meetings[i]
}

fun attendAllMeetings(meetings: AllMeetings<Meeting>) {
    for (i in 0 until meetings.count) {
        meetings[i].attend()
    }
}