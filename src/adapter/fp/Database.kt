package adapter.fp


data class DomainModel(
    val id: Long,
    val thing: String,
    val otherThing: String
    // imagine there is stuff not needed to be saved
)

data class DatabaseModel(
    val id: Long,
    val thing: String,
)

fun saveToPostgres(model: DatabaseModel) {
    println("Saving $model")
}

fun save(model: DomainModel) {
    saveToPostgres(
        model = DatabaseModel(
            id = model.id,
            thing = model.thing,
        )
    )
}

