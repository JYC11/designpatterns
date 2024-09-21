package facade.oop

import facade.oop.appliances.Amplifier
import facade.oop.appliances.PopcornPopper
import facade.oop.appliances.Projector
import facade.oop.appliances.Screen
import facade.oop.appliances.StreamingPlayer
import facade.oop.appliances.TheaterLights
import facade.oop.appliances.Tuner

class HomeTheaterFacade(
    private val amplifier: Amplifier,
    private val popper: PopcornPopper,
    private val projector: Projector,
    private val screen: Screen,
    private val streamingPlayer: StreamingPlayer,
    private val theaterLights: TheaterLights,
    private val tuner: Tuner,
) {
    fun watchMovie(movie: String) {
        println("Starting movie: $movie")
        popper.on()
        popper.pop()
        theaterLights.dim(10)
        screen.down()
        projector.on()
        projector.wideScreenMode()
        amplifier.on()
        amplifier.setStreamingPlayer(streamingPlayer)
        amplifier.setTuner(tuner)
        amplifier.setVolume(5)
        streamingPlayer.on()
        streamingPlayer.play(movie)
    }

    fun endMovie() {
        println("Ending movie")
        popper.off()
        theaterLights.on()
        screen.up()
        projector.off()
        amplifier.off()
        streamingPlayer.stop()
        streamingPlayer.off()
    }
}