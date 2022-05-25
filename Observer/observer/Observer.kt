package observer

abstract class Observer(val name: String) {
    abstract fun update(channelName: String)
}