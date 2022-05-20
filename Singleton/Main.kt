fun main(args: Array<String>) {
    val singleton1 = Singleton.getInstance()
    val singleton2 = Singleton.getInstance()
    singleton1.print()
    singleton2.print()

    // With Kotlin we can use an object instead of a class and the behaviour is the same that using a singleton
    val singleton3 = SingletonUsingKotlin
    val singleton4 = SingletonUsingKotlin
    singleton3.print()
    singleton4.print()
}