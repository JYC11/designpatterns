package theory.factory.oop

import theory.factory.oop.pizza.Pizza
import theory.factory.oop.pizza.PizzaType
import theory.factory.oop.pizza.SimplePizzaFactory

abstract class PizzaStore(
    val pizzaFactory: SimplePizzaFactory
) {
    fun orderPizza(type: PizzaType): Pizza {
        return this.createPizza(type).also {
            it.prepare()
            it.bake()
            it.cut()
            it.box()
        }
    }

    abstract fun createPizza(type: PizzaType): Pizza
}