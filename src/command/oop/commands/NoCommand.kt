package command.oop.commands

class NoCommand : ICommand {
    override fun execute() {
        println("No command")
    }

    override fun undo() {
        println("undoing nothing")
    }
}