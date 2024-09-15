package strategy

import strategy.fp.bark
import strategy.fp.dogMakesSound
import strategy.fp.woof
import strategy.fp.yap
import strategy.oop.MallardDuck
import strategy.oop.RubberDuck

fun main() {
    println("OOP")
    val mallardDuck = MallardDuck()
    val rubberDuck = RubberDuck()

    mallardDuck.fly()
    mallardDuck.quack()

    rubberDuck.fly()
    rubberDuck.quack()

    println("FP")
    dogMakesSound("jack russel terrier", bark)
    dogMakesSound("tibetian mastiff", woof)
    dogMakesSound("chihuahua", yap)
}