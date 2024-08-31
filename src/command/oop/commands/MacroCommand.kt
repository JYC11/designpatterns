package command.oop.commands

class MacroCommand(
    private val commands: List<ICommand>
) : ICommand {
    override fun execute() {
        commands.forEach { it.execute() }
    }

    override fun undo() {
        commands.forEach { it.undo() }
    }
}