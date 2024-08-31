package facade.oop.appliances

class Amplifier(
    private var tuner: Tuner? = null,
    private var player: StreamingPlayer? = null,
) {
    fun on() {
        println("Amplifier is on")
    }

    fun off() {
        println("Amplifier is off")
    }

    fun setStreamingPlayer(player: StreamingPlayer) {
        this.player = player
        println("Amplifier setting StreamingPlayer")
    }

    fun setStereoSound() {
        println("Amplifier stereo sound is set")
    }

    fun setSurroundSound() {
        println("Amplifier surround sound is set")
    }

    fun setTuner(tuner: Tuner) {
        this.tuner = tuner
        println("Amplifier setting Tuner")
    }

    fun setVolume(volume: Int) {
        println("Amplifier volume is set to $volume")
    }
}