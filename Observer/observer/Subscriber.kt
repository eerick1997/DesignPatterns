package observer

class Subscriber(private val subscriberName: String) : Observer(subscriberName) {
    override fun update(channelName: String) {
        println("Hey ${subscriberName}! New video published by $channelName")
    }
}