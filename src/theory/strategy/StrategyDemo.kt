package theory.strategy

import theory.strategy.fp.Door
import theory.strategy.fp.nonLocking
import theory.strategy.fp.passwordLocking
import theory.strategy.fp.slidingOpening
import theory.strategy.fp.standardOpening
import theory.strategy.oop.MallardDuck
import theory.strategy.oop.RubberDuck

fun main() {
    println("OOP")
    val mallardDuck = MallardDuck()
    val rubberDuck = RubberDuck()

    mallardDuck.fly()
    mallardDuck.quack()

    rubberDuck.fly()
    rubberDuck.quack()

    println("FP")
    val closetDoor = Door(
        lock = nonLocking.first,
        unlock = nonLocking.second,
        open = standardOpening.first,
        close = standardOpening.second,
    )
    println("closet door")
    closetDoor.open()
    closetDoor.close()
    closetDoor.lock()
    closetDoor.unlock()

    val upgradedDoor = Door(
        lock = slidingOpening.first,
        unlock = slidingOpening.second,
        open = passwordLocking.first,
        close = passwordLocking.second,
    )
    println("upgraded door")
    upgradedDoor.open()
    upgradedDoor.close()
    upgradedDoor.lock()
    upgradedDoor.unlock()
}