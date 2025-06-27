package theory.command.oop.commands

class NoCommand : ICommand {
    override fun execute() {
        println("No theory.command")
    }

    override fun undo() {
        println("undoing nothing")
    }
}