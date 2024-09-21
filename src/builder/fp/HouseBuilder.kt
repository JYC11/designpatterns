package builder.fp

data class House(
    val livingRooms: Int = 0,
    val bedrooms: Int = 0,
    val bathrooms: Int = 0
)

typealias Builder = (House) -> House

val buildLivingRoom: Builder = { house ->
    House(
        livingRooms = house.livingRooms + 1,
        bedrooms = house.bedrooms,
        bathrooms = house.bathrooms
    )
}

val buildBedroom: Builder = { house ->
    House(
        livingRooms = house.livingRooms,
        bedrooms = house.bedrooms,
        bathrooms = house.bathrooms + 1
    )
}

val buildBathroom: Builder = { house ->
    House(
        livingRooms = house.livingRooms,
        bedrooms = house.bedrooms,
        bathrooms = house.bathrooms + 1
    )
}

fun compose(vararg builders: Builder): Builder = { initialHouse ->
    builders.fold(initialHouse) { house, build -> build(house) }
}