package command.fp

typealias Command = (Int) -> Int

val increment: Command = { it + 1 }

val decrement: Command = { it - 1 }

fun execute(command: Command, value: Int): Int = command(value)