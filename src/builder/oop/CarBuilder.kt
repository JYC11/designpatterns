package builder.oop

import builder.oop.carparts.Engine
import builder.oop.carparts.GPSNavigator
import builder.oop.carparts.Transmission
import builder.oop.carparts.TripComputer

class CarBuilder : ICarBuilder {
    private var type: CarType = CarType.SEDAN
    private var seats: Int = 0
    private var engine: Engine = Engine("")
    private var transmission: Transmission = Transmission()
    private var gpsNavigator: GPSNavigator = GPSNavigator()
    private var tripComputer: TripComputer = TripComputer()

    override fun setType(type: CarType): CarBuilder {
        this.type = type
        return this
    }

    override fun setSeats(seats: Int): CarBuilder {
        this.seats = seats
        return this
    }

    override fun setEngine(engine: Engine): ICarBuilder {
        this.engine = engine
        return this
    }

    override fun setTransmission(transmission: Transmission): ICarBuilder {
        this.transmission = transmission
        return this
    }

    override fun setTripComputer(tripComputer: TripComputer): ICarBuilder {
        this.tripComputer = tripComputer
        return this
    }

    override fun setGPSNavigator(gpsNavigator: GPSNavigator): ICarBuilder {
        this.gpsNavigator = gpsNavigator
        return this
    }

    override fun build(): Car {
        return Car(
            type = this.type,
            seats = this.seats,
            engine = this.engine,
            transmission = this.transmission,
            tripComputer = this.tripComputer,
            gpsNavigator = this.gpsNavigator
        )
    }
}