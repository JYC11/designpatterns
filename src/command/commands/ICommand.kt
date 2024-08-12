package command.commands

interface ICommand {
    fun execute()
    fun undo()
}