package factory.fp


data class GameLevel(
    var walls: String? = null,
    var floors: String? = null,
    var enemies: String? = null,
    var loot: String? = null,
)


typealias SetWalls = (level: GameLevel) -> GameLevel
typealias SetFloors = (level: GameLevel) -> GameLevel
typealias SetEnemies = (level: GameLevel) -> GameLevel
typealias SetLoot = (level: GameLevel) -> GameLevel

typealias GameLevelMaker = (SetWalls, SetFloors, SetEnemies, SetLoot) -> GameLevel

val makeFantasyGameLevel: GameLevelMaker = { wallSetter, floorSetter, enemySetter, lootSetter ->
    var level = GameLevel()
    level = wallSetter(level)
    level = floorSetter(level)
    level = enemySetter(level)
    level = lootSetter(level)
    level
}

val setStoneWalls: SetWalls = { level ->
    GameLevel(
        walls = "stone",
        floors = level.floors,
        enemies = level.enemies,
        loot = level.loot,
    )
}
val setWoodWalls: SetWalls = { level ->
    GameLevel(
        walls = "wood",
        floors = level.floors,
        enemies = level.enemies,
        loot = level.loot,
    )
}

val setStoneTiles: SetFloors = { level ->
    GameLevel(
        walls = level.walls,
        floors = "stone",
        enemies = level.enemies,
        loot = level.loot,
    )
}
val setDirtTiles: SetFloors = { level ->
    GameLevel(
        walls = level.walls,
        floors = "dirt",
        enemies = level.enemies,
        loot = level.loot,
    )
}

val spawnImps: SetEnemies = { level ->
    GameLevel(
        walls = level.walls,
        floors = level.floors,
        enemies = "imp",
        loot = level.loot,
    )
}
val spawnWolves: SetWalls = { level ->
    GameLevel(
        walls = level.walls,
        floors = level.floors,
        enemies = "wolf",
        loot = level.loot,
    )
}

val setNoLoot: SetLoot = { level ->
    GameLevel(
        walls = level.walls,
        floors = level.floors,
        enemies = level.enemies,
        loot = null,
    )
}
val setGold: SetLoot = { level ->
    GameLevel(
        walls = level.walls,
        floors = level.floors,
        enemies = level.enemies,
        loot = "gold",
    )
}