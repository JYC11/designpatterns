package template

abstract class CaffeineBeverage {
    open fun prepareRecipe(needCondiment: String = "y") {
        boilWater()
        brew()
        pourInCup()
        if (customerWantsCondiments(needCondiment)) addCondiments()
    }

    abstract fun brew()

    abstract fun addCondiments()

    open fun boilWater() {
        println("Boil water")
    }

    open fun pourInCup() {
        println("Pour in Cup")
    }

    open fun customerWantsCondiments(needCondiment: String): Boolean {
        return true;
    }
}