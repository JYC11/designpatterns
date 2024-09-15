package decorator

import decorator.fp.journalist
import decorator.fp.originalSpeaker
import decorator.oop.beverages.Beverage
import decorator.oop.beverages.DarkRoast
import decorator.oop.beverages.Espresso
import decorator.oop.beverages.HouseBlend
import decorator.oop.beverages.Size
import decorator.oop.condiments.Mocha
import decorator.oop.condiments.Soy
import decorator.oop.condiments.Whip

fun main() {
    println("OOP")
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

    println("FP")
    val newsArticle: (String) -> String = journalist(::originalSpeaker)
    println(newsArticle("fluffy"))
}