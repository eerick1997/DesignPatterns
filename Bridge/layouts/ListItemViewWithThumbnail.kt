package layouts

import items.ItemViewModel

class ListItemViewWithThumbnail(private val itemViewModel: ItemViewModel) : ListItemView(itemViewModel) {
    override fun render() {
        println("----------------------------------------------------------")
        println("Here we have a thumbnail: ${itemViewModel.getImage()}")
        println("${itemViewModel.getTitle()}")
        println("----------------------------------------------------------")
    }
}