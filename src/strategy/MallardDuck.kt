package strategy

import strategy.behaviours.FlyWithWings
import strategy.behaviours.IFlyBehaviour
import strategy.behaviours.IQuackBehaviour
import strategy.behaviours.Quack

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