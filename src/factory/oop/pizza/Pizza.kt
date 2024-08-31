package factory.oop.pizza

import factory.oop.ingredients.IPizzaIngredientFactory
import factory.oop.ingredients.base.Anchovy
import factory.oop.ingredients.base.Cheese
import factory.oop.ingredients.base.Dough
import factory.oop.ingredients.base.Pepperoni
import factory.oop.ingredients.base.Sauce
import factory.oop.ingredients.base.vegetables.Vegetables

abstract class Pizza(
    val name: String,
    val ingredientFactory: IPizzaIngredientFactory,
    var dough: Dough? = null,
    var sauce: Sauce? = null,
    var cheese: Cheese? = null,
    var pepperoni: Pepperoni? = null,
    var vegetables: List<Vegetables>? = null,
    var anchovy: Anchovy? = null,
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