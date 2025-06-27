package theory.strategy.oop

import theory.strategy.oop.behaviours.FlyNoWay
import theory.strategy.oop.behaviours.IFlyBehaviour
import theory.strategy.oop.behaviours.IQuackBehaviour
import theory.strategy.oop.behaviours.Squeak

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