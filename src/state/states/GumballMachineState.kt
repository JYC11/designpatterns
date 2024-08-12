package state.states

interface GumballMachineState {
    fun insertQuarter()
    fun ejectQuarter()
    fun turnCrank()
    fun dispense()
}