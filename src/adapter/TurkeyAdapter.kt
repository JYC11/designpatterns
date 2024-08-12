package adapter

import strategy.Duck
import strategy.behaviours.FlyWithWings
import strategy.behaviours.Quack

class TurkeyAdapter(
    private val turkey: Turkey
) : Duck(Quack(), FlyWithWings()) {
    override fun quack() {
        turkey.gobble()
    }

    override fun fly() {
        turkey.fly()
    }
}