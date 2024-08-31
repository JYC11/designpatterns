package command.oop.commands.light

import command.oop.appliances.Light
import command.oop.commands.ICommand

class LightOn(
    private val light: Light
) : ICommand {
    override fun execute() = light.on()

    override fun undo() = light.off()
}