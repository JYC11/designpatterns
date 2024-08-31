package state

import state.fp.accelerate
import state.fp.decelerate
import state.fp.newCar
import state.oop.GumballMachine

fun stateDemo() {
    val machine = GumballMachine(numberGumballs = 10)

    for (i in 1..5) {
        machine.insertQuarter()
        machine.turnCrank()
    }

    val car = newCar()
    var newCarState = accelerate(car, 100)
    println(newCarState.first)
    newCarState = decelerate(car, 50)
    println(newCarState.first)
    newCarState = decelerate(car, 50)
    println(newCarState.first)
}