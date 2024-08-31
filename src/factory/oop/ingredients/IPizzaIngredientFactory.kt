package factory.oop.ingredients

import factory.oop.ingredients.base.Anchovy
import factory.oop.ingredients.base.Cheese
import factory.oop.ingredients.base.Dough
import factory.oop.ingredients.base.Pepperoni
import factory.oop.ingredients.base.Sauce
import factory.oop.ingredients.base.vegetables.Vegetables

interface IPizzaIngredientFactory {
    fun createDough(): Dough
    fun createSauce(): Sauce
    fun createCheese(): Cheese
    fun createAnchovy(): Anchovy
    fun createVeggies(): List<Vegetables>
    fun createPepperoni(): Pepperoni
}