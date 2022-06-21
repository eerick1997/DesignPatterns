import items.ItemViewModel
import items.ViewModelStream
import items.ViewModelVideo
import layouts.ListItemView
import layouts.ListItemViewJustText
import layouts.ListItemViewWithThumbnail
import objects.Stream
import objects.Video

fun main(args: Array<String>) {
    val viewModelVideo = ViewModelVideo(Video("Design patterns", "Design patterns image"))
    val viewModelStream = ViewModelStream(Stream("Design patterns", 1000, "Design patterns image"))
    val listItemViewJustTextVideo = ListItemViewJustText(viewModelVideo)
    val listItemViewJustTextStream = ListItemViewJustText(viewModelStream)
    val listItemViewWithThumbnailVideo = ListItemViewWithThumbnail(viewModelVideo)
    val listItemViewWithThumbnailStream = ListItemViewWithThumbnail(viewModelStream)
    val items = arrayOf<ListItemView>(listItemViewJustTextVideo, listItemViewJustTextStream, listItemViewWithThumbnailVideo, listItemViewWithThumbnailStream)
    items.forEach { item -> item.render() }
}