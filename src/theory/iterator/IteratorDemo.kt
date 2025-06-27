package theory.iterator

import theory.iterator.menu.DinnerMenu
import theory.iterator.menu.PancakeHouseMenu

fun main() {
    val waitress = Waitress(
        dinnerMenu = DinnerMenu(),
        pancakeHouseMenu = PancakeHouseMenu(),
    )
    waitress.printMenu()
}