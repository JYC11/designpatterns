package factory.fp


data class Wall(
    val material: String,
    val color: String,
    val secretePathCount: Int,
)

data class Floor(
    val material: String,
    val color: String,
    val sound: String,
)

data class Mob(
    val name: String,
    val hp: Double,
    val attack: Double,
    val defense: Double,
    val uniqueLoot: String,
)

data class Loot(
    val name: String,
    val value: Int
)


data class GameLevel(
    var walls: Wall? = null,
    var floors: Floor? = null,
    var mobs: Mob? = null,
    var loot: Loot? = null,
)


typealias WallFactory = (level: GameLevel) -> GameLevel
typealias FloorFactory = (level: GameLevel) -> GameLevel
typealias MobFactory = (level: GameLevel) -> GameLevel
typealias LootFactory = (level: GameLevel) -> GameLevel

typealias GameLevelFactory = (WallFactory, FloorFactory, MobFactory, LootFactory) -> GameLevel

val makeFantasyGameLevel: GameLevelFactory = { wallFactory, floorFactory, mobFactory, lootFactory ->
    var level = GameLevel()
    level = wallFactory(level)
    level = floorFactory(level)
    level = mobFactory(level)
    level = lootFactory(level)
    level
}

val setStoneWalls: WallFactory = { level ->
    GameLevel(
        walls = Wall(
            material = "Stone",
            color = "Grey",
            secretePathCount = 5,
        ),
        floors = level.floors,
        mobs = level.mobs,
        loot = level.loot,
    )
}
val setWoodWalls: WallFactory = { level ->
    GameLevel(
        walls = Wall(
            material = "Wood",
            color = "Brown",
            secretePathCount = 3,
        ),
        floors = level.floors,
        mobs = level.mobs,
        loot = level.loot,
    )
}

val setStoneTiles: FloorFactory = { level ->
    GameLevel(
        walls = level.walls,
        floors = Floor(
            material = "Stone",
            color = "Light Grey",
            sound = "stone_stepping_sound.mp4"
        ),
        mobs = level.mobs,
        loot = level.loot,
    )
}
val setDirtTiles: FloorFactory = { level ->
    GameLevel(
        walls = level.walls,
        floors = Floor(
            material = "Stone",
            color = "Light Brown",
            sound = "dirt_stepping_sound.mp4"
        ),
        mobs = level.mobs,
        loot = level.loot,
    )
}

val spawnImps: MobFactory = { level ->
    GameLevel(
        walls = level.walls,
        floors = level.floors,
        mobs = Mob(
            name = "Imp",
            hp = 30.0,
            attack = 15.0,
            defense = 10.0,
            uniqueLoot = "imp wing"
        ),
        loot = level.loot,
    )
}
val spawnWolves: WallFactory = { level ->
    GameLevel(
        walls = level.walls,
        floors = level.floors,
        mobs = Mob(
            name = "Wolf",
            hp = 20.0,
            attack = 20.0,
            defense = 5.0,
            uniqueLoot = "wolf tooth"
        ),
        loot = level.loot,
    )
}

val setNoLoot: LootFactory = { level ->
    GameLevel(
        walls = level.walls,
        floors = level.floors,
        mobs = level.mobs,
        loot = null,
    )
}
val setGold: LootFactory = { level ->
    GameLevel(
        walls = level.walls,
        floors = level.floors,
        mobs = level.mobs,
        loot = Loot(
            name = "Gold",
            value = 50
        ),
    )
}