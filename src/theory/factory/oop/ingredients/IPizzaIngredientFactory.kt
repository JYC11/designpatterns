package theory.factory.oop.ingredients

import theory.factory.oop.ingredients.base.Anchovy
import theory.factory.oop.ingredients.base.Cheese
import theory.factory.oop.ingredients.base.Dough
import theory.factory.oop.ingredients.base.Pepperoni
import theory.factory.oop.ingredients.base.Sauce
import theory.factory.oop.ingredients.base.vegetables.Vegetables

interface IPizzaIngredientFactory {
    fun createDough(): Dough
    fun createSauce(): Sauce
    fun createCheese(): Cheese
    fun createAnchovy(): Anchovy
    fun createVeggies(): List<Vegetables>
    fun createPepperoni(): Pepperoni
}