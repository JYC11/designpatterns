package builder

import builder.fp.makeCoffee
import builder.oop.CarBuilder
import builder.oop.CarType
import builder.oop.carparts.Engine

fun builderDemo() {
    // OOP
    val car = CarBuilder()
        .setType(CarType.SEDAN)
        .setSeats(4)
        .setEngine(Engine("V8"))
        .build()
    println(car)

    // FP
    makeCoffee()
    makeCoffee("latte", 10, 100, 50)
}
