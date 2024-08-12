package facade

import facade.appliances.Amplifier
import facade.appliances.PopcornPopper
import facade.appliances.Projector
import facade.appliances.Screen
import facade.appliances.StreamingPlayer
import facade.appliances.TheaterLights
import facade.appliances.Tuner


fun facadeDemo() {
    val facade = HomeTheaterFacade(
        amplifier = Amplifier(),
        popper = PopcornPopper(),
        projector = Projector(),
        screen = Screen(),
        streamingPlayer = StreamingPlayer(),
        theaterLights = TheaterLights(),
        tuner = Tuner()
    )

    facade.watchMove("Shrek the Third")

    facade.endMovie()
}



