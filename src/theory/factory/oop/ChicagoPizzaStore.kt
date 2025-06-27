package theory.factory.oop

import theory.factory.oop.pizza.Pizza
import theory.factory.oop.pizza.PizzaType
import theory.factory.oop.pizza.SimplePizzaFactory

class ChicagoPizzaStore(pizzaFactory: SimplePizzaFactory) : PizzaStore(pizzaFactory) {
    override fun createPizza(type: PizzaType): Pizza {
        return pizzaFactory.createChicagoStylePizza(type = type)
    }
}