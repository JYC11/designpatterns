package state

fun stateDemo() {
    val machine = GumballMachine(numberGumballs = 10)

    for (i in 1..5) {
        machine.insertQuarter()
        machine.turnCrank()
    }
}