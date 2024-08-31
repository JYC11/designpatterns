package builder.oop

import builder.oop.carparts.Engine
import builder.oop.carparts.GPSNavigator
import builder.oop.carparts.Transmission
import builder.oop.carparts.TripComputer

interface ICarBuilder {
    fun setType(type: CarType): ICarBuilder
    fun setSeats(seats: Int): ICarBuilder
    fun setEngine(engine: Engine): ICarBuilder
    fun setTransmission(transmission: Transmission): ICarBuilder
    fun setTripComputer(tripComputer: TripComputer): ICarBuilder
    fun setGPSNavigator(gpsNavigator: GPSNavigator): ICarBuilder
    fun build(): Any
}