package theory.strategy.oop

import theory.strategy.oop.behaviours.FlyWithWings
import theory.strategy.oop.behaviours.IFlyBehaviour
import theory.strategy.oop.behaviours.IQuackBehaviour
import theory.strategy.oop.behaviours.Quack

class MallardDuck(
    private val quackBehaviour: IQuackBehaviour = Quack(),
    private val flyBehaviour: IFlyBehaviour = FlyWithWings()
) : Duck(
    quackBehaviour = quackBehaviour,
    flyBehaviour = flyBehaviour
) {
    override fun display() {
        println("I am a mallard duck")
    }
}