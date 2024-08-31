package adapter.oop

import strategy.oop.Duck
import strategy.oop.behaviours.FlyWithWings
import strategy.oop.behaviours.Quack

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