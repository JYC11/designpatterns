package command.commands.light

import command.appliances.Light
import command.commands.ICommand

class LightOn(
    private val light: Light
) : ICommand {
    override fun execute() = light.on()

    override fun undo() = light.off()
}