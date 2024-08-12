package command.commands.ceilingfan

import command.appliances.CeilingFan
import command.commands.ICommand

class CeilingFanOn(
    private val ceilingFan: CeilingFan
) : ICommand {
    override fun execute() = ceilingFan.on()

    override fun undo() = ceilingFan.off()
}