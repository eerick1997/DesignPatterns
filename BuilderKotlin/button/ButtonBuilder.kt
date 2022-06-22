package button

abstract class ButtonBuilder protected constructor(
    var height: Int? = null,
    var width: Int? = null,
    var text: String? = null,
    var action: String? = null,
    var backgroundColor: Color? = null,
    var textColor: Color? = null
) {

    fun setHeight(height: Int) = apply { this.height = height }
    fun setWidth(width: Int) = apply { this.width = width }
    fun setText(text: String) = apply { this.text = text }
    fun setAction(action: String) = apply { this.action = action }
    fun setBackgroundColor(backgroundColor: Color) = apply { this.backgroundColor = backgroundColor }
    fun setTextColor(textColor: Color) = apply { this.textColor = textColor }

    abstract fun build() : Button
}