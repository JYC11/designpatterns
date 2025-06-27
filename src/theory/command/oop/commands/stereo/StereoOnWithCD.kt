package theory.command.oop.commands.stereo

import theory.command.oop.appliances.Stereo
import theory.command.oop.commands.ICommand

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