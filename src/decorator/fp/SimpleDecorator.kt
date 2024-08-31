package decorator.fp

fun originalSpeaker(input: String): String {
    return "cats are cool because they are $input"
}

fun journalist(func: (String) -> String): (String) -> String {
    return { input -> "Dog hating person says this: ${func(input)}" }
}