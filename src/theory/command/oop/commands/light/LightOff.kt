package theory.command.oop.commands.light

import theory.command.oop.appliances.Light
import theory.command.oop.commands.ICommand

class LightOff(
    private val light: Light
) : ICommand {
    override fun execute() = light.off()

    override fun undo() = light.on()
}