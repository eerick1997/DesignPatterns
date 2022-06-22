import button.PrimaryButton
import button.SecondaryButton

fun main(args: Array<String>) {
    val primaryButton = PrimaryButton.Builder("Click")
        .setWidth(10)
        .setHeight(5)
        .build()

    val secondaryButton = SecondaryButton.Builder()
        .setWidth(10)
        .setHeight(5)
        .build()

    primaryButton.render()
    primaryButton.onClick()

    secondaryButton.render()
    secondaryButton.onClick()
}