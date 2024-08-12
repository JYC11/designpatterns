package iterator.menu

import iterator.MenuItem

interface IMenu {
    fun createIterator(): Iterator<MenuItem>
}