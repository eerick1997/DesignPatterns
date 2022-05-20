class Singleton private constructor() {
    companion object {
        private var instance: Singleton? = null
        fun getInstance(): Singleton {
            if (instance == null)
                instance = Singleton()
            return instance!!
        }
    }

    fun print() {
        println("This is a message from a singleton object! ${this.hashCode()}")
    }
}