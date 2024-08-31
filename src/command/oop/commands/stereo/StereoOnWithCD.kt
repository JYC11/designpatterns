package command.oop.commands.stereo

import command.oop.appliances.Stereo
import command.oop.commands.ICommand

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