package items

import objects.Video

class ViewModelVideo(private val video: Video) : ItemViewModel {
    override fun getTitle(): String {
        return "(VIDEO) ${video.title}"
    }

    override fun getImage(): String {
        return "(VIDEO) ${video.image}"
    }
}