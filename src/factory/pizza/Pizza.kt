package factory.pizza

import factory.ingredients.IPizzaIngredientFactory
import factory.ingredients.base.Anchovy
import factory.ingredients.base.Cheese
import factory.ingredients.base.Dough
import factory.ingredients.base.Pepperoni
import factory.ingredients.base.Sauce
import factory.ingredients.base.vegetables.Vegetables

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