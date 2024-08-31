package command.oop

import command.oop.commands.ICommand
import command.oop.commands.NoCommand

class SimpleRemoteControl(
    private var commandHandlers: MutableMap<CommandNames, ICommand> = mutableMapOf(),
    private val noCommand: NoCommand = NoCommand()
) {
    fun execute(commandName: CommandNames) {
        commandHandlers[commandName]?.execute() ?: noCommand.execute()
    }

    fun addCommand(commandName: CommandNames, command: ICommand) {
        commandHandlers[commandName] = command
    }

    fun bulkAddCommands(toAdd: List<Pair<CommandNames, ICommand>>) {
        toAdd.forEach {
            commandHandlers[it.first] = it.second
        }
    }

    fun removeCommand(commandName: CommandNames) {
        commandHandlers.remove(commandName)
    }

    fun bulkRemoveCommands(commandNames: List<CommandNames>) {
        commandHandlers.keys.forEach {
            commandHandlers.remove(it)
        }
    }
}