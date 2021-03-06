package rsk

interface Time {
    fun setTime(hours: Int, mins: Int = 0, secs: Int = 0)
    // default implementation - useful when evolving interfaces
    fun setTime(time: KevinTime) = setTime(time.hours)
}

interface EndOfTheWorld {
    fun setTime(time: KevinTime) {}
}

class KevinTime {
    var hours: Int = 0
    var minutes: Int = 0
    var seconds: Int = 0

}

class YetiTime : Time, EndOfTheWorld {
    override fun setTime(time: KevinTime) {
        super<Time>.setTime(time)
        // can call one or both supers
        super<EndOfTheWorld>.setTime(time)
    }

    override fun setTime(hours: Int, mins: Int, secs: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}