package theory.iterator.menu

import theory.iterator.MenuItem

interface IMenu {
    fun createIterator(): Iterator<MenuItem>
}