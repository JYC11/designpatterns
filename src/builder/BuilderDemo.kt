package builder

import builder.carparts.Engine

fun builderDemo() {
    val car = CarBuilder()
        .setType(CarType.SEDAN)
        .setSeats(4)
        .setEngine(Engine("V8"))
        .build()
}
