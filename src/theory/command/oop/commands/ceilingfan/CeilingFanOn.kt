package theory.command.oop.commands.ceilingfan

import theory.command.oop.appliances.CeilingFan
import theory.command.oop.commands.ICommand

class CeilingFanOn(
    private val ceilingFan: CeilingFan
) : ICommand {
    override fun execute() = ceilingFan.on()

    override fun undo() = ceilingFan.off()
}