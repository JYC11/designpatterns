package theory.factory.oop.pizza


import theory.factory.oop.ingredients.ChicagoPizzaIngredientFactory
import theory.factory.oop.ingredients.NyPizzaIngredientFactory
import theory.factory.oop.pizza.chicago.ChicagoStyleAnchovyPizza
import theory.factory.oop.pizza.chicago.ChicagoStyleCheesePizza
import theory.factory.oop.pizza.chicago.ChicagoStylePepperoniPizza
import theory.factory.oop.pizza.chicago.ChicagoStyleVeggiePizza
import theory.factory.oop.pizza.ny.NyStyleAnchovyPizza
import theory.factory.oop.pizza.ny.NyStyleCheesePizza
import theory.factory.oop.pizza.ny.NyStylePepperoniPizza
import theory.factory.oop.pizza.ny.NyStyleVeggiePizza

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