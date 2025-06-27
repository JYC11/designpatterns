package theory.command.oop.commands.ceilingfan

import theory.command.oop.appliances.CeilingFan
import theory.command.oop.commands.ICommand

class CeilingFanOff(
    private val ceilingFan: CeilingFan
) : ICommand {
    override fun execute() = ceilingFan.off()

    override fun undo() = ceilingFan.on()
}