package proxy

data class YoutubeVideo(
    val name: String,
    val destination: String,
    val runTime: Int, // minutes
    val thumbnailUrl: String,
)
