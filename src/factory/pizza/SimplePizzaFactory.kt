package factory.pizza


import factory.ingredients.ChicagoPizzaIngredientFactory
import factory.ingredients.NyPizzaIngredientFactory
import factory.pizza.chicago.ChicagoStyleAnchovyPizza
import factory.pizza.chicago.ChicagoStyleCheesePizza
import factory.pizza.chicago.ChicagoStylePepperoniPizza
import factory.pizza.chicago.ChicagoStyleVeggiePizza
import factory.pizza.ny.NyStyleAnchovyPizza
import factory.pizza.ny.NyStyleCheesePizza
import factory.pizza.ny.NyStylePepperoniPizza
import factory.pizza.ny.NyStyleVeggiePizza

class SimplePizzaFactory {

    fun createNyStylePizza(type: PizzaType): Pizza {
        val ingredientFactory = NyPizzaIngredientFactory()
        return when (type) {
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
    }

    fun createChicagoStylePizza(type: PizzaType): Pizza {
        val ingredientFactory = ChicagoPizzaIngredientFactory()
        return when (type) {
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
    }
}