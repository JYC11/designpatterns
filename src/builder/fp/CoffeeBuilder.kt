package builder.fp


fun makeCoffee(
    name: String = "espresso",
    amount: Int = 10,
    water: Int = 100,
    milk: Int? = null,
    sugar: Int? = null,
) {
    val message = "Making $name coffee with:"
    message.plus("\n $amount grams of coffee and $water ml of water")
    milk?.let { message.plus("\n $milk ml of milk") }
    sugar?.let { message.plus("\n $sugar grams of sugar") }
    println(message)
}