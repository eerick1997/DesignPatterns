package observable

import observer.Observer

class YoutubeChannel(private val channelName: String) : Observable {
    private val subscribers: MutableSet<Observer> = hashSetOf()

    override fun attach(observer: Observer) {
        subscribers.add(observer)
        println("${observer.name} is now listening this channel!")
    }

    override fun detach(observer: Observer) {
        subscribers.remove(observer)
        println("${observer.name} is not listening this channel anymore!")
    }

    override fun notifySubscribers() {
        subscribers.forEach { subscriber -> subscriber.update(channelName) }
    }

    fun postNewVideo(videoName: String) {
        println("$channelName has posted a new video called: $videoName")
        notifySubscribers()
    }
}