package rsk.kotlin

fun main(args: Array<String>) {
    var m: Meeting? = null
    var newMeeting = Meeting()

    newMeeting = m ?: Meeting()

//    newMeeting = m


    closeMeeting(newMeeting)
    closeMeeting(m)

    closeMeetingNonNull(newMeeting)
    m?.let{
        closeMeetingNonNull(m)
    }

}

fun closeMeetingNonNull(m: Meeting): Boolean? {
    return if (m.canClose == true) m.close()
    else false
}

fun closeMeeting(m: Meeting?): Boolean? {
    return if (m?.canClose == true) m?.close()
    else false
//    return if (m!!.canClose) m.close()
//    else false
}

class Meeting {
    val canClose: Boolean = false
    lateinit var address: Address

    fun close(): Boolean {
        return true
    }

    fun save(o: Any) {
        // the as? will prevent a class cast exception
        // if o is of the correct type if will case, else null
        val saveable = o as? ISaveable
        saveable?.save()
    }

    // When using lateinit above, we HAVE TO initialize it ourselves at some point!!
    fun init(addr: Address) {
        address = addr
    }
}

interface ISaveable {
    fun save()
}

class Address {

}