package command.fp

typealias Command = (Int) -> Int

val increment: Command = { num -> num + 1 }

val decrement: Command = { num -> num - 1 }

fun execute(command: Command, value: Int): Int = command(value)