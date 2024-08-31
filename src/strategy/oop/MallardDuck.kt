package strategy.oop

import strategy.oop.behaviours.FlyWithWings
import strategy.oop.behaviours.IFlyBehaviour
import strategy.oop.behaviours.IQuackBehaviour
import strategy.oop.behaviours.Quack

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