package layouts

import items.ItemViewModel

class ListItemViewJustText(private val itemViewModel: ItemViewModel) : ListItemView(itemViewModel) {
    override fun render() {
        println("----------------------------------------------------------")
        println("Rendering just a title ${itemViewModel.getTitle()}")
        println("----------------------------------------------------------")
    }
}