package strategy

import strategy.behaviours.IFlyBehaviour
import strategy.behaviours.IQuackBehaviour

abstract class Duck(
    private val quackBehaviour: IQuackBehaviour,
    private val flyBehaviour: IFlyBehaviour
) {
    open fun quack() {
        quackBehaviour.quack()
    }

    open fun fly() {
        flyBehaviour.fly()
    }

    open fun display() {}
}