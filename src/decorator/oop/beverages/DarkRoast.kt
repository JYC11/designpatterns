package decorator.oop.beverages

class DarkRoast(
    override var description: String = "DarkRoast",
    override var size: Size,
) : Beverage() {
    override fun cost(): Double {
        return when (size) {
            Size.TALL -> 2.50
            Size.GRANDE -> 3.50
            Size.VENTI -> 4.50
        }
    }
}