package command.commands.ceilingfan

import command.appliances.CeilingFan
import command.appliances.CeilingFanSpeeds
import command.appliances.Light
import command.commands.ICommand

class SetCeilingFanSpeedHigh(
    private val ceilingFan: CeilingFan
) : ICommand {
    private var prevSpeed: CeilingFanSpeeds? = null

    override fun execute() {
        if(!ceilingFan.isOn) ceilingFan.on()
        prevSpeed = ceilingFan.getSpeed()
        ceilingFan.setSpeed(CeilingFanSpeeds.HIGH)
    }

    override fun undo() {
        prevSpeed?.let {
            ceilingFan.off()
            ceilingFan.setSpeed(it)
        }
    }
}