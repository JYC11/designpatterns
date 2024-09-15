package factory.oop.pizza


import factory.oop.ingredients.ChicagoPizzaIngredientFactory
import factory.oop.ingredients.NyPizzaIngredientFactory
import factory.oop.pizza.chicago.ChicagoStyleAnchovyPizza
import factory.oop.pizza.chicago.ChicagoStyleCheesePizza
import factory.oop.pizza.chicago.ChicagoStylePepperoniPizza
import factory.oop.pizza.chicago.ChicagoStyleVeggiePizza
import factory.oop.pizza.ny.NyStyleAnchovyPizza
import factory.oop.pizza.ny.NyStyleCheesePizza
import factory.oop.pizza.ny.NyStylePepperoniPizza
import factory.oop.pizza.ny.NyStyleVeggiePizza

class SimplePizzaFactory {

    fun createNyStylePizza(type: PizzaType): Pizza {
        val ingredientFactory = NyPizzaIngredientFactory()
        val pizza = when (type) {
            PizzaType.CHEESE -> NyStyleCheesePizza(
                name = "NY cheese pizza",
                ingredientFactory = ingredientFactory,
            )

            PizzaType.PEPPERONI -> NyStylePepperoniPizza(
                name = "NY Pepperoni pizza",
                ingredientFactory = ingredientFactory,
            )

            PizzaType.ANCHOVY -> NyStyleAnchovyPizza(
                name = "NY Anchovy pizza",
                ingredientFactory = ingredientFactory,
            )

            PizzaType.VEGGIE -> NyStyleVeggiePizza(
                name = "NY Veggie pizza",
                ingredientFactory = ingredientFactory,
            )
        }
        pizza.prepare()
        return pizza
    }

    fun createChicagoStylePizza(type: PizzaType): Pizza {
        val ingredientFactory = ChicagoPizzaIngredientFactory()
        val pizza = when (type) {
            PizzaType.CHEESE -> ChicagoStyleCheesePizza(
                name = "Chicago cheese pizza",
                ingredientFactory = ingredientFactory,
            )

            PizzaType.PEPPERONI -> ChicagoStylePepperoniPizza(
                name = "Chicago pepperoni pizza",
                ingredientFactory = ingredientFactory,
            )

            PizzaType.ANCHOVY -> ChicagoStyleAnchovyPizza(
                name = "Chicago anchovy pizza",
                ingredientFactory = ingredientFactory,
            )

            PizzaType.VEGGIE -> ChicagoStyleVeggiePizza(
                name = "Chicago veggie pizza",
                ingredientFactory = ingredientFactory,
            )
        }
        pizza.prepare()
        return pizza
    }
}