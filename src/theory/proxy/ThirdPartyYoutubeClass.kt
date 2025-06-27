package theory.proxy

class ThirdPartyYoutubeClass(
    private val videos: List<YoutubeVideo> = listOf(),
) : IThirdPartyYoutubeLib {
    override fun listVideos(): List<YoutubeVideo> {
        return videos // making actual http calls
    }

    override fun getVideoInfo(id: Int): YoutubeVideo {
        return videos[id] // making actual http calls
        // we don't like it because it's slow and can fail
    }
}