package theory.state

import theory.state.fp.accelerate
import theory.state.fp.decelerate
import theory.state.fp.newCar
import theory.state.oop.GumballMachine

fun main() {
    println("OOP")
    val machine = GumballMachine(numberGumballs = 10)

    for (i in 1..5) {
        machine.insertQuarter()
        machine.turnCrank()
    }

    println("FP")
    val car = newCar()
    var res = accelerate(car, 100)
    if (res.second != null) println(res.second)
    println(res.first)
    res = decelerate(res.first!!, 50)
    if (res.second != null) println(res.second)
    println(res.first)
    res = decelerate(res.first!!, 50)
    if (res.second != null) println(res.second)
    println(res.first)
}