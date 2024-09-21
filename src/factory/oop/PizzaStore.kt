package factory.oop

import factory.oop.pizza.Pizza
import factory.oop.pizza.PizzaType
import factory.oop.pizza.SimplePizzaFactory

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