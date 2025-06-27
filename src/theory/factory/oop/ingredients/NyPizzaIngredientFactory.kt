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
import theory.factory.oop.ingredients.ny.FreshAnchovy
import theory.factory.oop.ingredients.ny.MarinaraSauce
import theory.factory.oop.ingredients.ny.ReggianoCheese
import theory.factory.oop.ingredients.ny.ThinCrustDough

class NyPizzaIngredientFactory : IPizzaIngredientFactory {
    override fun createDough(): Dough {
        return ThinCrustDough()
    }

    override fun createSauce(): Sauce {
        return MarinaraSauce()
    }

    override fun createCheese(): Cheese {
        return ReggianoCheese()
    }

    override fun createAnchovy(): Anchovy {
        return FreshAnchovy()
    }

    override fun createVeggies(): List<Vegetables> {
        return listOf(Garlic(), Onion(), Mushroom(), RedPepper())
    }

    override fun createPepperoni(): Pepperoni {
        return Pepperoni()
    }

    override fun toString(): String = "NyPizzaIngredientFactory"
}