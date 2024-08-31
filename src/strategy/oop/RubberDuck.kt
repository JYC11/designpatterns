package strategy.oop

import strategy.oop.behaviours.FlyNoWay
import strategy.oop.behaviours.IFlyBehaviour
import strategy.oop.behaviours.IQuackBehaviour
import strategy.oop.behaviours.Squeak

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