package factory.oop.pizza

import factory.oop.ingredients.IPizzaIngredientFactory
import factory.oop.ingredients.base.Anchovy
import factory.oop.ingredients.base.Cheese
import factory.oop.ingredients.base.Dough
import factory.oop.ingredients.base.Pepperoni
import factory.oop.ingredients.base.Sauce
import factory.oop.ingredients.base.vegetables.Vegetables

abstract class Pizza(
    open val name: String,
    open val ingredientFactory: IPizzaIngredientFactory,
    open var dough: Dough? = null,
    open var sauce: Sauce? = null,
    open var cheese: Cheese? = null,
    open var pepperoni: Pepperoni? = null,
    open var vegetables: List<Vegetables>? = null,
    open var anchovy: Anchovy? = null,
) {
    abstract fun prepare()

    fun bake() {
        println("baking $name pizza")
    }

    fun cut() {
        println("cutting $name pizza")
    }

    fun box() {
        println("boxing $name pizza")
    }
}