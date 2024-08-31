package command.oop.commands.ceilingfan

import command.oop.appliances.CeilingFan
import command.oop.appliances.CeilingFanSpeeds
import command.oop.commands.ICommand

class SetCeilingFanSpeedLow(
    private val ceilingFan: CeilingFan
) : ICommand {
    private var prevSpeed: CeilingFanSpeeds? = null

    override fun execute() {
        if (!ceilingFan.isOn) ceilingFan.on()
        prevSpeed = ceilingFan.getSpeed()
        ceilingFan.setSpeed(CeilingFanSpeeds.LOW)
    }

    override fun undo() {
        prevSpeed?.let {
            ceilingFan.off()
            ceilingFan.setSpeed(it)
        }
    }
}