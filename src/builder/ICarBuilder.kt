package builder

import builder.carparts.Engine
import builder.carparts.GPSNavigator
import builder.carparts.Transmission
import builder.carparts.TripComputer

interface ICarBuilder {
    fun setType(type: CarType): ICarBuilder
    fun setSeats(seats: Int): ICarBuilder
    fun setEngine(engine: Engine): ICarBuilder
    fun setTransmission(transmission: Transmission): ICarBuilder
    fun setTripComputer(tripComputer: TripComputer): ICarBuilder
    fun setGPSNavigator(gpsNavigator: GPSNavigator): ICarBuilder
    fun build(): Any
}