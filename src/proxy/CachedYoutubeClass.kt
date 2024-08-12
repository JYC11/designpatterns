package proxy

class CachedYoutubeClass(
    private val service: IThirdPartyYoutubeLib,
    private var listCache: List<YoutubeVideo>? = null,
    private var videoCache: YoutubeVideo? = null,
) : IThirdPartyYoutubeLib {
    override fun listVideos(): List<YoutubeVideo> {
        if (listCache == null) {
            listCache = service.listVideos()
        }
        return listCache!!
    }

    override fun getVideoInfo(id: Int): YoutubeVideo {
        if (videoCache == null) {
            videoCache = service.getVideoInfo(id=id)
        }
        return videoCache!!
    }
}