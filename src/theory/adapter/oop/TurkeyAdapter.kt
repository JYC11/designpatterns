package theory.adapter.oop

import theory.strategy.oop.Duck
import theory.strategy.oop.behaviours.FlyWithWings
import theory.strategy.oop.behaviours.Quack

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