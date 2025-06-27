package theory.command

import theory.command.fp.decrement
import theory.command.fp.execute
import theory.command.fp.increment
import theory.command.oop.CommandNames
import theory.command.oop.SimpleRemoteControl
import theory.command.oop.appliances.CeilingFan
import theory.command.oop.appliances.Light
import theory.command.oop.appliances.Stereo
import theory.command.oop.commands.MacroCommand
import theory.command.oop.commands.ceilingfan.CeilingFanOff
import theory.command.oop.commands.ceilingfan.CeilingFanOn
import theory.command.oop.commands.ceilingfan.SetCeilingFanSpeedHigh
import theory.command.oop.commands.ceilingfan.SetCeilingFanSpeedLow
import theory.command.oop.commands.ceilingfan.SetCeilingFanSpeedMedium
import theory.command.oop.commands.light.LightOff
import theory.command.oop.commands.light.LightOn
import theory.command.oop.commands.stereo.StereoOff
import theory.command.oop.commands.stereo.StereoOnWithCD

fun main() {
    println("OOP")
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
        Pair(
            CommandNames.EVERYTHING_ON, MacroCommand(
                listOf(
                    LightOn(livingRoomLight),
                    StereoOnWithCD(stereo),
                    CeilingFanOn(ceilingFan),
                )
            )
        ),
        Pair(
            CommandNames.EVERYTHING_OFF, MacroCommand(
                listOf(
                    LightOff(livingRoomLight),
                    StereoOff(stereo),
                    CeilingFanOff(ceilingFan),
                )
            )
        ),
    )

    remoteControl.bulkAddCommands(commandsToAdd)

    for (command in CommandNames.entries) {
        remoteControl.execute(command)
    }

    println("FP")
    var value = 10
    println("Initial value: $value")

    value = execute(increment, value)
    println("After increment: $value")

    value = execute(decrement, value)
    println("After decrement: $value")
}