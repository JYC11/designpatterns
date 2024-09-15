package state.fp

sealed class Car {
    abstract val speed: Long

    data class Stopped(
        override val speed: Long,
    ) : Car()

    data class Accelerating(
        override val speed: Long,
    ) : Car()

    data class Decelerating(
        override val speed: Long,
    ) : Car()
}

data class CarError(val message: String = "")

fun newCar(): Car = Car.Stopped(0L)

fun accelerate(car: Car, speed: Long): Pair<Car?, CarError?> {
    return when (car) {
        is Car.Accelerating -> Pair(Car.Accelerating(car.speed + speed), null)
        is Car.Decelerating -> Pair(Car.Accelerating(car.speed + speed), null)
        is Car.Stopped -> Pair(Car.Accelerating(car.speed + speed), null)
    }
}


fun decelerate(car: Car, speed: Long): Pair<Car?, CarError?> {
    return when (car) {
        is Car.Accelerating -> Pair(Car.Decelerating(car.speed - speed), null)
        is Car.Decelerating -> {
            if (car.speed - speed == 0L) {
                return Pair(Car.Stopped(0L), null)
            } else {
                return Pair(Car.Decelerating(car.speed - speed), null)
            }
        }

        is Car.Stopped -> Pair(null, CarError("Car already stopped"))
    }
}