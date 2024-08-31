package state.oop.states

interface GumballMachineState {
    fun insertQuarter()
    fun ejectQuarter()
    fun turnCrank()
    fun dispense()
}