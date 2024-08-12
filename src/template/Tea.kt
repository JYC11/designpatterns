package template

class Tea : CaffeineBeverage() {
    override fun brew() {
        println("Steeping teaBag")
    }

    override fun addCondiments() {
        println("Adding lemon")
    }
}