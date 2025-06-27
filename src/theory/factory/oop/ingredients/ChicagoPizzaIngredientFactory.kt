package theory.factory.oop.ingredients

import theory.factory.oop.ingredients.base.Anchovy
import theory.factory.oop.ingredients.base.Cheese
import theory.factory.oop.ingredients.base.Dough
import theory.factory.oop.ingredients.base.Pepperoni
import theory.factory.oop.ingredients.base.Sauce
import theory.factory.oop.ingredients.base.vegetables.Garlic
import theory.factory.oop.ingredients.base.vegetables.Mushroom
import theory.factory.oop.ingredients.base.vegetables.Onion
import theory.factory.oop.ingredients.base.vegetables.RedPepper
import theory.factory.oop.ingredients.base.vegetables.Vegetables
import theory.factory.oop.ingredients.chicago.FrozenAnchovy
import theory.factory.oop.ingredients.chicago.MozzarellaCheese
import theory.factory.oop.ingredients.chicago.PlumTomatoSauce
import theory.factory.oop.ingredients.ny.ThinCrustDough

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