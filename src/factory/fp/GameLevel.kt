package factory.fp

typealias SetWalls = () -> Unit
typealias SetFloors = () -> Unit
typealias SetEnemies = () -> Unit
typealias SetLoot = () -> Unit

fun makeGameLevel(
    wallSetter: SetWalls,
    floorSetter: SetFloors,
    enemySetter: SetEnemies,
    lootSetter: SetLoot,
) {
    wallSetter()
    floorSetter()
    enemySetter()
    lootSetter()
}

val setStoneWalls: SetWalls = { println("setting stone walls") }
val setWoodWalls: SetWalls = { println("setting stone walls") }

val setStoneTiles: SetFloors = { println("setting stone floor") }
val setDirtTiles: SetFloors = { println("setting dirt floors") }

val spawnImps: SetEnemies = { println("spawning imps") }
val spawnWolves: SetWalls = { println("spawning wolves") }

val setNoLoot: SetLoot = { println("setting no loot") }
val setGold: SetLoot = { println("setting random amounts of gold") }