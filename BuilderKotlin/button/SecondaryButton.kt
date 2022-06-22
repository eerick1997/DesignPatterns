package button

class SecondaryButton(builder: Builder) : Button(builder) {

    override fun render() {
        for (i in 0 until width!!) print("~")

        for (i in 0 until height!!) {
            if (i == height!! / 2) println(text) else println()
        }

        for (i in 0 until width!!) print("~")
        println()
    }

    override fun onClick() {
        println("SecondaryButton: $action")
    }

    class Builder : ButtonBuilder() {
        override fun build() = SecondaryButton(this)

    }
}