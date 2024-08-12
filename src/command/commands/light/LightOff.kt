package command.commands.light

import command.appliances.Light
import command.commands.ICommand

class LightOff(
    private val light: Light
) : ICommand {
    override fun execute() = light.off()

    override fun undo() = light.on()
}