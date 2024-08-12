package command.commands.stereo

import command.appliances.Stereo
import command.commands.ICommand

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