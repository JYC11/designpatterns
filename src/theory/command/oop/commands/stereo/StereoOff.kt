package theory.command.oop.commands.stereo

import theory.command.oop.appliances.Stereo
import theory.command.oop.commands.ICommand

class StereoOff(
    private val stereo: Stereo
) : ICommand {
    override fun execute() {
        stereo.off()
    }

    override fun undo() {
        TODO("Not yet implemented")
    }
}