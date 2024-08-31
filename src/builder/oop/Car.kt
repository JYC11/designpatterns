package builder.oop

import builder.oop.carparts.Engine
import builder.oop.carparts.GPSNavigator
import builder.oop.carparts.Transmission
import builder.oop.carparts.TripComputer

class Car(
    val type: CarType,
    val seats: Int,
    val engine: Engine,
    val transmission: Transmission,
    val gpsNavigator: GPSNavigator,
    val tripComputer: TripComputer
)



