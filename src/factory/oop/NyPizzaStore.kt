package factory.oop

import factory.oop.pizza.Pizza
import factory.oop.pizza.PizzaType
import factory.oop.pizza.SimplePizzaFactory

class NyPizzaStore(pizzaFactory: SimplePizzaFactory) : PizzaStore(pizzaFactory) {
    override fun createPizza(type: PizzaType): Pizza {
        return pizzaFactory.createNyStylePizza(type = type)
    }
}