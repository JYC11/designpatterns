package command.appliances

class Stereo(
) {
    fun on() {
        println("Stereo on")
    }

    fun off() {
        println("Stereo off")
    }

    fun setCD() {
        println("Setting CD")
    }

    fun setDVD() {
        println("Setting DVD")
    }

    fun setRadio() {
        println("Setting Radio")
    }

    fun setVolume(volume: Int) {
        println("Setting Volume $volume")
    }
}