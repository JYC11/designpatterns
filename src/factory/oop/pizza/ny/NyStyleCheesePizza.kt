package factory.oop.pizza.ny

import factory.oop.ingredients.IPizzaIngredientFactory
import factory.oop.ingredients.base.Anchovy
import factory.oop.ingredients.base.Cheese
import factory.oop.ingredients.base.Dough
import factory.oop.ingredients.base.Pepperoni
import factory.oop.ingredients.base.Sauce
import factory.oop.ingredients.base.vegetables.Vegetables
import factory.oop.pizza.base.CheesePizza

data class NyStyleCheesePizza(
    override val name: String,
    override val ingredientFactory: IPizzaIngredientFactory,
    override var dough: Dough? = null,
    override var sauce: Sauce? = null,
    override var cheese: Cheese? = null,
    override var pepperoni: Pepperoni? = null,
    override var vegetables: List<Vegetables>? = null,
    override var anchovy: Anchovy? = null,
) : CheesePizza(name, ingredientFactory, dough, sauce, cheese, pepperoni, vegetables, anchovy)