package strategy.oop.behaviours

class FlyNoWay : IFlyBehaviour {
    override fun fly() {
        println("I can't fly")
    }
}