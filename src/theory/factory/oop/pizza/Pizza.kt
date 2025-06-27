package theory.factory.oop.pizza

import theory.factory.oop.ingredients.IPizzaIngredientFactory
import theory.factory.oop.ingredients.base.Anchovy
import theory.factory.oop.ingredients.base.Cheese
import theory.factory.oop.ingredients.base.Dough
import theory.factory.oop.ingredients.base.Pepperoni
import theory.factory.oop.ingredients.base.Sauce
import theory.factory.oop.ingredients.base.vegetables.Vegetables

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