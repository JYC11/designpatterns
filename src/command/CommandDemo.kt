package command

import command.appliances.CeilingFan
import command.appliances.Light
import command.appliances.Stereo
import command.commands.MacroCommand
import command.commands.ceilingfan.CeilingFanOff
import command.commands.ceilingfan.CeilingFanOn
import command.commands.ceilingfan.SetCeilingFanSpeedHigh
import command.commands.ceilingfan.SetCeilingFanSpeedLow
import command.commands.ceilingfan.SetCeilingFanSpeedMedium
import command.commands.light.LightOff
import command.commands.light.LightOn
import command.commands.stereo.StereoOff
import command.commands.stereo.StereoOnWithCD

fun commandDemo() {
    val remoteControl = SimpleRemoteControl()
    val livingRoomLight = Light("living room light")
    val ceilingFan = CeilingFan()
    val stereo = Stereo()

    val commandsToAdd = listOf(
        Pair(CommandNames.LIGHT_ON, LightOn(livingRoomLight)),
        Pair(CommandNames.LIGHT_OFF, LightOff(livingRoomLight)),
        Pair(CommandNames.STEREO_ON, StereoOnWithCD(stereo)),
        Pair(CommandNames.STEREO_OFF, StereoOff(stereo)),
        Pair(CommandNames.CEILING_FAN_ON, CeilingFanOn(ceilingFan)),
        Pair(CommandNames.CEILING_FAN_OFF, CeilingFanOff(ceilingFan)),
        Pair(CommandNames.SET_CEILING_FAN_SPEED_HIGH, SetCeilingFanSpeedHigh(ceilingFan)),
        Pair(CommandNames.SET_CEILING_FAN_SPEED_MEDIUM, SetCeilingFanSpeedMedium(ceilingFan)),
        Pair(CommandNames.SET_CEILING_FAN_SPEED_LOW, SetCeilingFanSpeedLow(ceilingFan)),
        Pair(CommandNames.EVERYTHING_ON, MacroCommand(
            listOf(
                LightOn(livingRoomLight),
                StereoOnWithCD(stereo),
                CeilingFanOn(ceilingFan),
            )
        )),
        Pair(CommandNames.EVERYTHING_OFF, MacroCommand(
            listOf(
                LightOff(livingRoomLight),
                StereoOff(stereo),
                CeilingFanOff(ceilingFan),
            )
        )),
    )

    remoteControl.bulkAddCommands(commandsToAdd)

    CommandNames.entries.forEach {
        remoteControl.execute(it)
    }
}