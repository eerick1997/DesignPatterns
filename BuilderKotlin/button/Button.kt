package button

abstract class Button private constructor(
    protected var height: Int? = null,
    protected var width: Int? = null,
    protected var text: String? = null,
    protected var action: String? = null,
    protected var backgroundColor: Color? = null,
    protected var textColor: Color? = null
) {
    constructor(builder: ButtonBuilder) : this(builder.height, builder.width, builder.text, builder.action, builder.backgroundColor, builder.backgroundColor)

    abstract fun render()
    abstract fun onClick()
}