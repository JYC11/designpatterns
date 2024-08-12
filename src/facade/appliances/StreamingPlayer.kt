package facade.appliances

class StreamingPlayer {
    fun on() {
        println("StreamingPlayer is on")
    }

    fun off() {
        println("StreamingPlayer is off")
    }

    fun pause() {
        println("StreamingPlayer is paused")
    }

    fun play(movie: String) {
        println("StreamingPlayer is playing $movie")
    }

    fun setSurroundAudio() {
        println("StreamingPlayer surround audio is set")
    }

    fun setTwoChannelAudio() {
        println("StreamingPlayer two-channel audio is set")
    }

    fun stop() {
        println("StreamingPlayer is stopped")
    }
}