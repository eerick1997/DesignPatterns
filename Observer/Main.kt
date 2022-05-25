import observable.YoutubeChannel
import observer.Subscriber

fun main(args: Array<String>) {
    val bettaTech = YoutubeChannel("BettaTech")
    val xataka = YoutubeChannel("Xataka")
    val subscriber01 = Subscriber("Subscriber01")
    val subscriber02 = Subscriber("Subscriber02")
    val subscriber03 = Subscriber("Subscriber03")
    bettaTech.attach(subscriber01)
    bettaTech.attach(subscriber02)
    xataka.attach(subscriber02)
    xataka.attach(subscriber03)
    bettaTech.postNewVideo("Patrón observer")
    xataka.postNewVideo("Review Sony WH-1000XM4")
}