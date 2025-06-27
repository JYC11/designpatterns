package theory.decorator

import theory.decorator.fp.journalist
import theory.decorator.fp.originalSpeaker
import theory.decorator.oop.beverages.Beverage
import theory.decorator.oop.beverages.DarkRoast
import theory.decorator.oop.beverages.Espresso
import theory.decorator.oop.beverages.HouseBlend
import theory.decorator.oop.beverages.Size
import theory.decorator.oop.condiments.Mocha
import theory.decorator.oop.condiments.Soy
import theory.decorator.oop.condiments.Whip

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