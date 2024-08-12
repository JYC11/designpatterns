package iterator

import iterator.menu.DinnerMenu
import iterator.menu.PancakeHouseMenu

fun iteratorDemo(){
    val waitress = Waitress(
        dinnerMenu = DinnerMenu(),
        pancakeHouseMenu = PancakeHouseMenu(),
    )
    waitress.printMenu()
}