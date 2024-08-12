package factory.ingredients

import factory.ingredients.base.Anchovy
import factory.ingredients.base.Cheese
import factory.ingredients.base.Dough
import factory.ingredients.base.Pepperoni
import factory.ingredients.base.Sauce
import factory.ingredients.base.vegetables.Vegetables

interface IPizzaIngredientFactory {
    fun createDough(): Dough
    fun createSauce(): Sauce
    fun createCheese(): Cheese
    fun createAnchovy(): Anchovy
    fun createVeggies(): List<Vegetables>
    fun createPepperoni(): Pepperoni
}