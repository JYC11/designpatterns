package strategy.behaviours

class FlyNoWay : IFlyBehaviour {
    override fun fly() {
        println("I can't fly")
    }
}