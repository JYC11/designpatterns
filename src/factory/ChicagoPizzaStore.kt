package factory

import factory.pizza.Pizza
import factory.pizza.PizzaType
import factory.pizza.SimplePizzaFactory

class ChicagoPizzaStore(pizzaFactory: SimplePizzaFactory) : PizzaStore(pizzaFactory) {
    override fun createPizza(type: PizzaType): Pizza {
        return pizzaFactory.createChicagoStylePizza(type = type)
    }
}