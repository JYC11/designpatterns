package decorator.beverages

abstract class Beverage {
    abstract var description: String
    abstract var size: Size

    abstract fun cost(): Double

    fun display() {
        println("description: $description cost: ${cost()}")
    }
}