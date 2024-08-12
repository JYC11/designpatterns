package factory

import factory.pizza.Pizza
import factory.pizza.PizzaType
import factory.pizza.SimplePizzaFactory

abstract class PizzaStore(
    val pizzaFactory: SimplePizzaFactory
) {
    fun orderPizza(type: PizzaType): Pizza {
        return createPizza(type).also {
            it.prepare()
            it.bake()
            it.cut()
            it.box()
        }
    }

    abstract fun createPizza(type: PizzaType): Pizza
}