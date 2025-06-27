package theory.builder

import theory.builder.fp.Builder
import theory.builder.fp.House
import theory.builder.fp.buildBathroom
import theory.builder.fp.buildBedroom
import theory.builder.fp.buildLivingRoom
import theory.builder.fp.compose
import theory.builder.oop.CarBuilder
import theory.builder.oop.CarType
import theory.builder.oop.carparts.Engine

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
