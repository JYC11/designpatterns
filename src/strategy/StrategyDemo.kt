package strategy

import strategy.fp.Door
import strategy.fp.nonLocking
import strategy.fp.passwordLocking
import strategy.fp.slidingOpening
import strategy.fp.standardOpening
import strategy.oop.MallardDuck
import strategy.oop.RubberDuck

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