package command.oop.commands.ceilingfan

import command.oop.appliances.CeilingFan
import command.oop.commands.ICommand

class CeilingFanOff(
    private val ceilingFan: CeilingFan
) : ICommand {
    override fun execute() = ceilingFan.off()

    override fun undo() = ceilingFan.on()
}