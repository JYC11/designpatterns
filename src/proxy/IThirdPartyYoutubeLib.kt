package proxy

interface IThirdPartyYoutubeLib {
    fun listVideos(): List<YoutubeVideo>
    fun getVideoInfo(id: Int): YoutubeVideo
}