package theory.factory.oop.pizza.ny

import theory.factory.oop.ingredients.IPizzaIngredientFactory
import theory.factory.oop.ingredients.base.Anchovy
import theory.factory.oop.ingredients.base.Cheese
import theory.factory.oop.ingredients.base.Dough
import theory.factory.oop.ingredients.base.Pepperoni
import theory.factory.oop.ingredients.base.Sauce
import theory.factory.oop.ingredients.base.vegetables.Vegetables
import theory.factory.oop.pizza.base.AnchovyPizza

data class NyStyleAnchovyPizza(
    override val name: String,
    override val ingredientFactory: IPizzaIngredientFactory,
    override var dough: Dough? = null,
    override var sauce: Sauce? = null,
    override var cheese: Cheese? = null,
    override var pepperoni: Pepperoni? = null,
    override var vegetables: List<Vegetables>? = null,
    override var anchovy: Anchovy? = null,
) : AnchovyPizza(name, ingredientFactory, dough, sauce, cheese, pepperoni, vegetables, anchovy)