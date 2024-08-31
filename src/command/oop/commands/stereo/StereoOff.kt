package command.oop.commands.stereo

import command.oop.appliances.Stereo
import command.oop.commands.ICommand

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