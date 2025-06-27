package theory.builder.oop

import theory.builder.oop.carparts.Engine
import theory.builder.oop.carparts.GPSNavigator
import theory.builder.oop.carparts.Transmission
import theory.builder.oop.carparts.TripComputer

interface ICarBuilder {
    fun setType(type: CarType): ICarBuilder
    fun setSeats(seats: Int): ICarBuilder
    fun setEngine(engine: Engine): ICarBuilder
    fun setTransmission(transmission: Transmission): ICarBuilder
    fun setTripComputer(tripComputer: TripComputer): ICarBuilder
    fun setGPSNavigator(gpsNavigator: GPSNavigator): ICarBuilder
    fun build(): Any
}