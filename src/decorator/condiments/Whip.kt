package decorator.condiments

import decorator.beverages.Beverage
import decorator.beverages.Size

class Whip(
    override var beverage: Beverage,
    override var size: Size = beverage.size,
) : CondimentDecorator(
    description = beverage.description + ", Whip",
    beverage = beverage
) {
    override fun cost(): Double {
        return beverage.cost() + when (size) {
            Size.TALL -> 0.3
            Size.GRANDE -> 0.4
            Size.VENTI -> 0.5
        };
    }
}