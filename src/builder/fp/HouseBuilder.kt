package builder.fp

data class House(
    val livingRooms: Int = 0,
    val bedrooms: Int = 0,
    val bathrooms: Int = 0
)

typealias Builder = (House) -> House

val buildLivingRoom: Builder = { house ->
    house.copy(livingRooms = house.livingRooms + 1)
}

val buildBedroom: Builder = { house ->
    house.copy(bedrooms = house.bedrooms + 1)
}

val buildBathroom: Builder = { house ->
    house.copy(bathrooms = house.bathrooms + 1)
}

fun compose(vararg builders: Builder): Builder = { initialHouse ->
    builders.fold(initialHouse) { house, build -> build(house) }
}