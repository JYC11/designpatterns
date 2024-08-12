package command.commands.ceilingfan

import command.appliances.CeilingFan
import command.commands.ICommand

class CeilingFanOff(
    private val ceilingFan: CeilingFan
) : ICommand {
    override fun execute() = ceilingFan.off()

    override fun undo() = ceilingFan.on()
}