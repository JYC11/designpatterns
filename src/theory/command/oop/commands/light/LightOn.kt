package theory.command.oop.commands.light

import theory.command.oop.appliances.Light
import theory.command.oop.commands.ICommand

class LightOn(
    private val light: Light
) : ICommand {
    override fun execute() = light.on()

    override fun undo() = light.off()
}