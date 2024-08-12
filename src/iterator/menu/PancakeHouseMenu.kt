package iterator.menu

import iterator.MenuItem
import iterator.iter.MenuIterator

class PancakeHouseMenu(
    private val maxItems: Int = 6,
    private var numberOfItems: Int = 0,
    var menuItems: MutableList<MenuItem> = mutableListOf(),
) : IMenu {
    init {
        menuItems.addAll(
            listOf(
                MenuItem("pancake", "standard pancake", false, 10.0),
                MenuItem("waffles", "standard waffle", false, 10.0),
                MenuItem("coffee", "black coffee", false, 3.0),
                MenuItem("bacon and eggs", "bacon and eggs", false, 15.0),
            )
        )
    }

    fun addItem(item: MenuItem) {
        menuItems.add(item)
    }

    override fun createIterator(): MenuIterator {
        return MenuIterator(items=menuItems)
    }
}