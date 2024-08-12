package decorator.beverages

class HouseBlend(
    override var description: String = "House Blend",
    override var size: Size,
) : Beverage() {
    override fun cost(): Double {
        return when(size) {
            Size.TALL -> 3.99
            Size.GRANDE -> 4.99
            Size.VENTI -> 5.99
        }
    }
}