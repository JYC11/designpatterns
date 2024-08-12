package proxy

class YoutubeManager(
    private val service: IThirdPartyYoutubeLib
) {
    fun renderVideoPage(id: Int) {
        service.getVideoInfo(id)
        // render video
    }

    fun renderListPanel() {
        service.listVideos()
        // render list panel
    }
}