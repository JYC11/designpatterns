package factory.pizza.ny

import factory.ingredients.IPizzaIngredientFactory
import factory.ingredients.base.Anchovy
import factory.ingredients.base.Cheese
import factory.ingredients.base.Dough
import factory.ingredients.base.Pepperoni
import factory.ingredients.base.Sauce
import factory.ingredients.base.vegetables.Vegetables
import factory.pizza.base.AnchovyPizza

class NyStyleAnchovyPizza(
    name: String,
    ingredientFactory: IPizzaIngredientFactory,
    dough: Dough? = null,
    sauce: Sauce? = null,
    cheese: Cheese? = null,
    pepperoni: Pepperoni? = null,
    vegetables: List<Vegetables>? = null,
    anchovy: Anchovy? = null,
) : AnchovyPizza(name, ingredientFactory, dough, sauce, cheese, pepperoni, vegetables, anchovy)