package theory.builder.oop

import theory.builder.oop.carparts.Engine
import theory.builder.oop.carparts.GPSNavigator
import theory.builder.oop.carparts.Transmission
import theory.builder.oop.carparts.TripComputer

class Car(
    val type: CarType,
    val seats: Int,
    val engine: Engine,
    val transmission: Transmission,
    val gpsNavigator: GPSNavigator,
    val tripComputer: TripComputer
)



