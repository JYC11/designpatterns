package iterator.menu

import iterator.MenuItem
import iterator.iter.MenuIterator

class DinnerMenu(
    private val maxItems: Int = 6,
    private var numberOfItems: Int = 0,
    var menuItems: MutableList<MenuItem> = mutableListOf(),
) : IMenu {
    init {
        menuItems.addAll(
            listOf(
                MenuItem("steak and potatoes", "chuck steak and russet potatoes", false, 30.0),
                MenuItem("clam chowder", "fresh clams", false, 20.0),
                MenuItem("beer", "lager", false, 7.0),
                MenuItem("lobster bisque", "comes with butter", false, 40.0),
            )
        )
    }

    fun addItem(item: MenuItem) {
        menuItems.add(item)
    }

    override fun createIterator(): MenuIterator {
        return MenuIterator(items = menuItems)
    }
}