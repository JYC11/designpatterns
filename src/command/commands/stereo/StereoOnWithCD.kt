package command.commands.stereo

import command.appliances.Stereo
import command.commands.ICommand

class StereoOnWithCD(
    private val stereo: Stereo
) : ICommand {
    override fun execute() {
        stereo.on()
        stereo.setCD()
        stereo.setVolume(11)
    }

    override fun undo() {
        stereo.off()
    }
}