package builder

import builder.carparts.Engine
import builder.carparts.GPSNavigator
import builder.carparts.Transmission
import builder.carparts.TripComputer

class Car(
    val type: CarType,
    val seats: Int,
    val engine: Engine,
    val transmission: Transmission,
    val gpsNavigator: GPSNavigator,
    val tripComputer: TripComputer
)



