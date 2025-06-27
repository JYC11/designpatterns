package theory.state.oop.states

import theory.state.oop.GumballMachine

class SoldOutState(
    val machine: GumballMachine,
) : GumballMachineState {
    override fun insertQuarter() {
        println("You can't insert a quarter")
    }

    override fun ejectQuarter() {
        println("You can't eject a quarter")
    }

    override fun turnCrank() {
        println("There are no gumballs")
    }

    override fun dispense() {
        println("You can't dispense with a gumball")
    }
}