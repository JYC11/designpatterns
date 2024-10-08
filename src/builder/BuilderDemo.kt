package builder

import builder.fp.Builder
import builder.fp.House
import builder.fp.buildBathroom
import builder.fp.buildBedroom
import builder.fp.buildLivingRoom
import builder.fp.compose
import builder.oop.CarBuilder
import builder.oop.CarType
import builder.oop.carparts.Engine

fun main() {
    println("OOP")
    val car = CarBuilder()
        .setType(CarType.SEDAN)
        .setSeats(4)
        .setEngine(Engine("V8"))
        .build()
    println(car)

    println("FP")
    val build: Builder = compose(
        buildLivingRoom,
        buildBedroom,
        buildBedroom,
        buildBathroom
    )
    val house = build(House())
//    buildLivingRoom(House())
//    buildBedroom(buildLivingRoom(House()))
//    buildBedroom(buildBedroom(buildLivingRoom(House())))
//    buildBathroom(buildBedroom(buildBedroom(buildLivingRoom(House()))))
    println(house)
}
