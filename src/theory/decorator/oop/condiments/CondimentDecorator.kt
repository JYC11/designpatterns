package theory.decorator.oop.condiments

import theory.decorator.oop.beverages.Beverage

abstract class CondimentDecorator(
    override var description: String,
    open var beverage: Beverage
) : Beverage() {

    override fun cost(): Double {
        TODO("Not yet implemented")
    }
}