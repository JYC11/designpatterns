package iterator

import iterator.menu.IMenu

class Waitress(
    private val pancakeHouseMenu: IMenu,
    private val dinnerMenu: IMenu,
) {
    fun printMenu() {
        val pancakeIterator = pancakeHouseMenu.createIterator()
        val dinnerIterator = dinnerMenu.createIterator()
        println("breakfast menus")
        printMenusFromIterator(iterator = pancakeIterator)
        println("dinner menus")
        printMenusFromIterator(iterator = dinnerIterator)
    }

    private fun printMenusFromIterator(iterator: Iterator<MenuItem>) {
        while (iterator.hasNext()) {
            val menu = iterator.next()
            println(menu.toString())
        }
    }
}