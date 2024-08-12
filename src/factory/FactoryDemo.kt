package factory

import factory.pizza.PizzaType
import factory.pizza.SimplePizzaFactory

fun factoryDemo() {
    val chicagoPizzaStore = ChicagoPizzaStore(pizzaFactory = SimplePizzaFactory())
    val nyPizzaStore = NyPizzaStore(pizzaFactory = SimplePizzaFactory())

    val chicagoCheesePizza = chicagoPizzaStore.createPizza(type = PizzaType.CHEESE)
    val nyPepperoniPizza = nyPizzaStore.createPizza(type = PizzaType.PEPPERONI)
    println(chicagoCheesePizza)
    println(nyPepperoniPizza)
}