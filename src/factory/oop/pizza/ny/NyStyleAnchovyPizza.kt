package factory.oop.pizza.ny

import factory.oop.ingredients.IPizzaIngredientFactory
import factory.oop.ingredients.base.Anchovy
import factory.oop.ingredients.base.Cheese
import factory.oop.ingredients.base.Dough
import factory.oop.ingredients.base.Pepperoni
import factory.oop.ingredients.base.Sauce
import factory.oop.ingredients.base.vegetables.Vegetables
import factory.oop.pizza.base.AnchovyPizza

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