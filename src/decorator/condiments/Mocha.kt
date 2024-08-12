package decorator.condiments

import decorator.beverages.Beverage
import decorator.beverages.Size

class Mocha(
    override var beverage: Beverage,
    override var size: Size = beverage.size,
) : CondimentDecorator(
    description = beverage.description + ", Mocha",
    beverage = beverage
) {
    override fun cost(): Double {
        return beverage.cost() + when (size) {
            Size.TALL -> 0.2
            Size.GRANDE -> 0.3
            Size.VENTI -> 0.4
        };
    }
}