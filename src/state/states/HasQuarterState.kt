package state.states

import state.GumballMachine

class HasQuarterState(
    val machine: GumballMachine,
) : GumballMachineState {
    override fun insertQuarter() {
        println("You can't insert another quarter")
    }

    override fun ejectQuarter() {
        println("Quarter returned")
        machine.setState(machine.getNoQuarterState())
    }

    override fun turnCrank() {
        println("You turned a crank")
        val winner = (0..3).random()
        if (winner == 0 && machine.getCount() > 1) {
            machine.setState(machine.getWinnerState())
        } else {
            machine.setState(machine.getSoldState())
        }
    }

    override fun dispense() {
        println("No gumball dispensed")
    }
}