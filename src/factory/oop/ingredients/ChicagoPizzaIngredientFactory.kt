package factory.oop.ingredients

import factory.oop.ingredients.base.Anchovy
import factory.oop.ingredients.base.Cheese
import factory.oop.ingredients.base.Dough
import factory.oop.ingredients.base.Pepperoni
import factory.oop.ingredients.base.Sauce
import factory.oop.ingredients.base.vegetables.Garlic
import factory.oop.ingredients.base.vegetables.Mushroom
import factory.oop.ingredients.base.vegetables.Onion
import factory.oop.ingredients.base.vegetables.RedPepper
import factory.oop.ingredients.base.vegetables.Vegetables
import factory.oop.ingredients.chicago.FrozenAnchovy
import factory.oop.ingredients.chicago.MozzarellaCheese
import factory.oop.ingredients.chicago.PlumTomatoSauce
import factory.oop.ingredients.ny.ThinCrustDough

class ChicagoPizzaIngredientFactory : IPizzaIngredientFactory {
    override fun createDough(): Dough {
        return ThinCrustDough()
    }

    override fun createSauce(): Sauce {
        return PlumTomatoSauce()
    }

    override fun createCheese(): Cheese {
        return MozzarellaCheese()
    }

    override fun createAnchovy(): Anchovy {
        return FrozenAnchovy()
    }

    override fun createVeggies(): List<Vegetables> {
        return listOf(Garlic(), Onion(), Mushroom(), RedPepper())
    }

    override fun createPepperoni(): Pepperoni {
        return Pepperoni()
    }

    override fun toString(): String = "ChicgagoPizzaIngredientFactory"
}