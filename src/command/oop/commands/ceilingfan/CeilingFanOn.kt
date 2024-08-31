package command.oop.commands.ceilingfan

import command.oop.appliances.CeilingFan
import command.oop.commands.ICommand

class CeilingFanOn(
    private val ceilingFan: CeilingFan
) : ICommand {
    override fun execute() = ceilingFan.on()

    override fun undo() = ceilingFan.off()
}