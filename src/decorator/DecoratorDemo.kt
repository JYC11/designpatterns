package decorator

import decorator.beverages.Beverage
import decorator.beverages.DarkRoast
import decorator.beverages.Espresso
import decorator.beverages.HouseBlend
import decorator.beverages.Size
import decorator.condiments.Mocha
import decorator.condiments.Soy
import decorator.condiments.Whip

fun decoratorDemo() {
    val beverage: Beverage = Espresso(size = Size.GRANDE)
    beverage.display()

    var beverage2: Beverage = DarkRoast(size = Size.TALL)
    beverage2 = Mocha(beverage = beverage2)
    beverage2 = Mocha(beverage = beverage2)
    beverage2 = Whip(beverage = beverage2)
    beverage2.display()

    var beverage3: Beverage = HouseBlend(size = Size.VENTI)
    beverage3 = Soy(beverage = beverage3)
    beverage3 = Mocha(beverage = beverage3)
    beverage3 = Whip(beverage = beverage3)
    beverage3.display()
}