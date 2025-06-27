package theory.state.oop

import theory.state.oop.states.GumballMachineState
import theory.state.oop.states.HasQuarterState
import theory.state.oop.states.NoQuarterState
import theory.state.oop.states.SoldOutState
import theory.state.oop.states.SoldState
import theory.state.oop.states.WinnerState

class GumballMachine(numberGumballs: Int) {
    private var soldOutState: GumballMachineState = SoldOutState(this)
    private var noQuarterState: GumballMachineState = NoQuarterState(this)
    private var hasQuarterState: GumballMachineState = HasQuarterState(this)
    private var soldState: GumballMachineState = SoldState(this)
    private var winnerState: GumballMachineState = WinnerState(this)

    private var state: GumballMachineState
    private var count: Int = 0

    init {
        count = numberGumballs
        state = if (numberGumballs > 0) {
            noQuarterState
        } else {
            soldOutState
        }
    }

    fun insertQuarter() {
        state.insertQuarter()
    }

    fun ejectQuarter() {
        state.ejectQuarter()
    }

    fun turnCrank() {
        state.turnCrank()
        state.dispense()
    }

    fun setState(state: GumballMachineState) {
        this.state = state
    }

    fun releaseBall() {
        println("A gumball comes rolling out the slot...")
        if (count > 0) {
            count -= 1
        }
    }

    fun getNoQuarterState(): GumballMachineState = noQuarterState

    fun getSoldOutState(): GumballMachineState = soldOutState

    fun getHasQuarterState(): GumballMachineState = hasQuarterState

    fun getSoldState(): GumballMachineState = soldState

    fun getWinnerState(): GumballMachineState = winnerState

    fun getCount(): Int {
        return count
    }
}
