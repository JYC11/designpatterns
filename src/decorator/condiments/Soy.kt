package decorator.condiments

import decorator.beverages.Beverage
import decorator.beverages.Size

class Soy(
    override var beverage: Beverage,
    override var size: Size = beverage.size,
) : CondimentDecorator(
    description = beverage.description + ", Soy",
    beverage = beverage
) {
    override fun cost(): Double {
        return beverage.cost() + when (size) {
            Size.TALL -> 0.1
            Size.GRANDE -> 0.2
            Size.VENTI -> 0.3
        };
    }
}