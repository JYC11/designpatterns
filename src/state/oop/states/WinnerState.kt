package state.oop.states

import state.oop.GumballMachine

class WinnerState(
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
        machine.releaseBall()
        if (machine.getCount() == 0) {
            machine.setState(machine.getSoldOutState())
        } else {
            machine.releaseBall()
            println("You're a a winner! You got 2 gumballs per quarter")
            if (machine.getCount() > 0) {
                machine.setState(machine.getNoQuarterState())
            } else {
                println("Oops, out of gumballs")
                machine.setState(machine.getSoldOutState())
            }
        }
    }
}