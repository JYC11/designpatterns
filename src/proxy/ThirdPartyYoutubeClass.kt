package proxy

class ThirdPartyYoutubeClass(
    private val videos: List<YoutubeVideo> = listOf(),
) : IThirdPartyYoutubeLib {
    override fun listVideos(): List<YoutubeVideo> {
        return videos
    }

    override fun getVideoInfo(id: Int): YoutubeVideo {
        return videos[id]
    }
}