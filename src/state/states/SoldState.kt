package state.states

import state.GumballMachine

class SoldState(
    val machine: GumballMachine,
) : GumballMachineState {
    override fun insertQuarter() {
        println("Please wait, we already are giving you a gumball")
    }

    override fun ejectQuarter() {
        println("Sorry, you already turned the crank")
    }

    override fun turnCrank() {
        println("Turning twice doesn't get you another gumball")
    }

    override fun dispense() {
        machine.releaseBall()
        if (machine.getCount() > 0) {
            machine.setState(machine.getNoQuarterState())
        } else {
            println("Oops, out of gumballs")
            machine.setState(machine.getSoldOutState())
        }
    }
}