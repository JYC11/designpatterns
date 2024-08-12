package strategy

import strategy.behaviours.FlyNoWay
import strategy.behaviours.IFlyBehaviour
import strategy.behaviours.IQuackBehaviour
import strategy.behaviours.Squeak

class RubberDuck(
    private val quackBehaviour: IQuackBehaviour = Squeak(),
    private val flyBehaviour: IFlyBehaviour = FlyNoWay()
) : Duck(
    quackBehaviour = quackBehaviour,
    flyBehaviour = flyBehaviour
) {
    override fun display() {
        println("I am a rubber duck")
    }
}