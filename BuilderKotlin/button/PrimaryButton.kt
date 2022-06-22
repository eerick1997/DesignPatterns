package button

class PrimaryButton(private val builder: ButtonBuilder) : Button(builder) {
    override fun render() {
        for (i in 0 until width!!) print("-")

        for (i in 0 until height!!) {
            if (i == height!! / 2) println(text) else println()
        }

        for (i in 0 until width!!) print("-")
        println()
    }

    override fun onClick() {
        println("PrimaryButton: $action")
    }

    class Builder(action: String) : ButtonBuilder(action = action) {
        override fun build() = PrimaryButton(this)
    }
}