package theory.command.oop.commands.ceilingfan

import theory.command.oop.appliances.CeilingFan
import theory.command.oop.appliances.CeilingFanSpeeds
import theory.command.oop.commands.ICommand

class SetCeilingFanSpeedMedium(
    private val ceilingFan: CeilingFan
) : ICommand {
    private var prevSpeed: CeilingFanSpeeds? = null

    override fun execute() {
        if (!ceilingFan.isOn) ceilingFan.on()
        prevSpeed = ceilingFan.getSpeed()
        ceilingFan.setSpeed(CeilingFanSpeeds.MEDIUM)
    }

    override fun undo() {
        prevSpeed?.let {
            ceilingFan.off()
            ceilingFan.setSpeed(it)
        }
    }
}