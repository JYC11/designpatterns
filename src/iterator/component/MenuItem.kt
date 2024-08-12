package iterator.component

class MenuItem(
    val name: String,
    val description: String,
    val vegetarian: Boolean,
    val price: Double,
) : MenuComponent() {
    override fun add(menuComponent: MenuComponent) {
        TODO("Not yet implemented")
    }

    override fun remove(menuComponent: MenuComponent) {
        TODO("Not yet implemented")
    }

    override fun getChild(index: Int): MenuComponent {
        TODO("Not yet implemented")
    }

    override fun print() {
        println("$name, $description, $vegetarian, $price")
    }
}