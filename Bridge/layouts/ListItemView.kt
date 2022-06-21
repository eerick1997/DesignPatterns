package layouts

import items.ItemViewModel

abstract class ListItemView(private val itemViewModel: ItemViewModel) {
    abstract fun render()
}