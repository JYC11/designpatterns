package state.oop.states

import state.oop.GumballMachine

class NoQuarterState(
    val machine: GumballMachine,
) : GumballMachineState {
    override fun insertQuarter() {
        println("You inserted a quarter")
        machine.setState(machine.getHasQuarterState())
    }

    override fun ejectQuarter() {
        println("You haven't inserted a quarter")
    }

    override fun turnCrank() {
        println("You turned but there are no quarters")
    }

    override fun dispense() {
        println("You need to pay first")
    }
}