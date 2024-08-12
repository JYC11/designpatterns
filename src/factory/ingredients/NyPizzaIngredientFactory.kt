package factory.ingredients

import factory.ingredients.base.Anchovy
import factory.ingredients.base.Cheese
import factory.ingredients.base.Dough
import factory.ingredients.base.Pepperoni
import factory.ingredients.base.Sauce
import factory.ingredients.base.vegetables.Garlic
import factory.ingredients.base.vegetables.Mushroom
import factory.ingredients.base.vegetables.Onion
import factory.ingredients.base.vegetables.RedPepper
import factory.ingredients.base.vegetables.Vegetables
import factory.ingredients.ny.FreshAnchovy
import factory.ingredients.ny.MarinaraSauce
import factory.ingredients.ny.ReggianoCheese
import factory.ingredients.ny.ThinCrustDough

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
}