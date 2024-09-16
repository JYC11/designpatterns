package strategy.fp

typealias LockStrategy = () -> Unit
typealias UnlockStrategy = () -> Unit
typealias OpenStrategy = () -> Unit
typealias CloseStrategy = () -> Unit


data class Door(
    val lock: LockStrategy,
    val unlock: UnlockStrategy,
    val open: OpenStrategy,
    val close: CloseStrategy
)

// Locking behaviors
val nonLocking: Pair<LockStrategy, UnlockStrategy> = Pair(
    { println("Door does not lock - ignoring") },
    { println("Door cannot unlock because it cannot lock") }
)

val passwordLocking: Pair<LockStrategy, UnlockStrategy> = Pair(
    { println("Door locked using password!") },
    { println("Door unlocked using password!") }
)

// Opening behaviors
val standardOpening: Pair<OpenStrategy, CloseStrategy> = Pair(
    { println("Pushing door open") },
    { println("Pulling door closed") }
)

val slidingOpening: Pair<OpenStrategy, CloseStrategy> = Pair(
    { println("Sliding door open") },
    { println("Sliding door closed") }
)