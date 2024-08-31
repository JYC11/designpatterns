package factory.oop.pizza.base

import factory.oop.ingredients.IPizzaIngredientFactory
import factory.oop.ingredients.base.Anchovy
import factory.oop.ingredients.base.Cheese
import factory.oop.ingredients.base.Dough
import factory.oop.ingredients.base.Pepperoni
import factory.oop.ingredients.base.Sauce
import factory.oop.ingredients.base.vegetables.Vegetables
import factory.oop.pizza.Pizza

open class PepperoniPizza(
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
        pepperoni = ingredientFactory.createPepperoni()
    }
}