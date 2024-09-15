package strategy.fp

typealias BarkStrategy = () -> String

val bark: BarkStrategy = {
    "bark"
}

val woof: BarkStrategy = {
    "woof"
}

val yap: BarkStrategy = {
    "yap"
}

fun dogMakesSound(dogName: String, strategy: BarkStrategy) {
    println("$dogName makes sound ${strategy()}")
}