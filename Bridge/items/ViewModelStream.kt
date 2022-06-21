package items

import objects.Stream

class ViewModelStream(private val stream: Stream) : ItemViewModel {
    override fun getTitle(): String {
        return "(STREAM) ${stream.title} Currently Viewing ${stream.viewers}"
    }

    override fun getImage(): String {
        return "(STREAM) ${stream.image}"
    }

}