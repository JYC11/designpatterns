package template

class Coffee : CaffeineBeverage() {
    override fun brew() {
        println("Dripping coffee through filter")
    }

    override fun addCondiments() {
        println("Adding sugar and milk")
    }

    override fun customerWantsCondiments(needCondiment: String): Boolean {
        return needCondiment.lowercase() == "y"
    }
}