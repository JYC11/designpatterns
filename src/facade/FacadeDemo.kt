package facade

import facade.fp.cookRamen
import facade.oop.HomeTheaterFacade
import facade.oop.appliances.Amplifier
import facade.oop.appliances.PopcornPopper
import facade.oop.appliances.Projector
import facade.oop.appliances.Screen
import facade.oop.appliances.StreamingPlayer
import facade.oop.appliances.TheaterLights
import facade.oop.appliances.Tuner


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



