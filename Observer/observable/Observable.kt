package observable

import observer.Observer

interface Observable {
    fun attach(observer: Observer)
    fun detach(observer: Observer)
    fun notifySubscribers()
}