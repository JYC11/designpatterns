package proxy

fun proxyDemo() {
    val videos: List<YoutubeVideo> = listOf(
        YoutubeVideo("Cats puking", "cat pukes while eating", 4, "catpuke.png"),
        YoutubeVideo("Mr Beast gives away money", "He just gives away money and there is no catch", 20,"mrbeast.png"),
        YoutubeVideo("Paint drying ASMR 2h", "title", 120, "paint.png")
    )
    val youtubeService = ThirdPartyYoutubeClass(videos=videos)
    val youtubeProxy = CachedYoutubeClass(service = youtubeService)
    val manager = YoutubeManager(service = youtubeProxy)
    manager.renderVideoPage(1)
    manager.renderListPanel()
}