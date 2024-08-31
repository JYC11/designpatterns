package command.oop.commands.light

import command.oop.appliances.Light
import command.oop.commands.ICommand

class LightOff(
    private val light: Light
) : ICommand {
    override fun execute() = light.off()

    override fun undo() = light.on()
}