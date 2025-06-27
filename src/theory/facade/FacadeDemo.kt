package theory.facade

import theory.facade.fp.cookRamen
import theory.facade.oop.HomeTheaterFacade
import theory.facade.oop.appliances.Amplifier
import theory.facade.oop.appliances.PopcornPopper
import theory.facade.oop.appliances.Projector
import theory.facade.oop.appliances.Screen
import theory.facade.oop.appliances.StreamingPlayer
import theory.facade.oop.appliances.TheaterLights
import theory.facade.oop.appliances.Tuner


fun main() {
    println("OOP")
    val facade = HomeTheaterFacade(
        amplifier = Amplifier(),
        popper = PopcornPopper(),
        projector = Projector(),
        screen = Screen(),
        streamingPlayer = StreamingPlayer(),
        theaterLights = TheaterLights(),
        tuner = Tuner()
    )

    facade.watchMovie("Shrek the Third")

    facade.endMovie()

    println("FP")
    cookRamen()
}



