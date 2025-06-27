package theory.factory.oop.pizza.base

import theory.factory.oop.ingredients.IPizzaIngredientFactory
import theory.factory.oop.ingredients.base.Anchovy
import theory.factory.oop.ingredients.base.Cheese
import theory.factory.oop.ingredients.base.Dough
import theory.factory.oop.ingredients.base.Pepperoni
import theory.factory.oop.ingredients.base.Sauce
import theory.factory.oop.ingredients.base.vegetables.Vegetables
import theory.factory.oop.pizza.Pizza

open class CheesePizza(
    name: String,
    ingredientFactory: IPizzaIngredientFactory,
    dough: Dough? = null,
    sauce: Sauce? = null,
    cheese: Cheese? = null,
    pepperoni: Pepperoni? = null,
    vegetables: List<Vegetables>? = null,
    anchovy: Anchovy? = null,
) : Pizza(name, ingredientFactory, dough, sauce, cheese, pepperoni, vegetables, anchovy) {
    override fun prepare() {
        println("Preparing $name")
        dough = ingredientFactory.createDough()
        sauce = ingredientFactory.createSauce()
        cheese = ingredientFactory.createCheese()
    }
}