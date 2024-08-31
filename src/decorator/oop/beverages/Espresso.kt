package decorator.oop.beverages

class Espresso(
    override var description: String = "Espresso",
    override var size: Size,
) : Beverage() {
    override fun cost(): Double {
        return when (size) {
            Size.TALL -> 1.99
            Size.GRANDE -> 2.99
            Size.VENTI -> 3.99
        }
    }
}