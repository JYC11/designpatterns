package iterator.iter

import iterator.MenuItem


class MenuIterator(
    private val items: MutableList<MenuItem> = mutableListOf(),
    private var position: Int = 0
) : Iterator<MenuItem> {
    override fun hasNext(): Boolean {
        return position < items.size
    }

    override fun next(): MenuItem {
        val menuItem = items[position]
        position += 1
        return menuItem
    }
}