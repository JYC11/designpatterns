package theory.factory

import theory.factory.fp.makeFantasyGameLevel
import theory.factory.fp.setDirtTiles
import theory.factory.fp.setGold
import theory.factory.fp.setNoLoot
import theory.factory.fp.setStoneTiles
import theory.factory.fp.setStoneWalls
import theory.factory.fp.setWoodWalls
import theory.factory.fp.spawnImps
import theory.factory.fp.spawnWolves
import theory.factory.oop.ChicagoPizzaStore
import theory.factory.oop.NyPizzaStore
import theory.factory.oop.pizza.PizzaType
import theory.factory.oop.pizza.SimplePizzaFactory

fun main() {
    println("OOP")
    val chicagoPizzaStore = ChicagoPizzaStore(pizzaFactory = SimplePizzaFactory())
    val nyPizzaStore = NyPizzaStore(pizzaFactory = SimplePizzaFactory())

    val chicagoCheesePizza = chicagoPizzaStore.orderPizza(type = PizzaType.CHEESE)
    val nyPepperoniPizza = nyPizzaStore.orderPizza(type = PizzaType.PEPPERONI)
    println(chicagoCheesePizza)
    println(nyPepperoniPizza)

    println("FP")
    val forest = makeFantasyGameLevel(
        setWoodWalls,
        setDirtTiles,
        spawnWolves,
        setNoLoot
    )
    println(forest)
    val dungeon = makeFantasyGameLevel(
        setStoneWalls,
        setStoneTiles,
        spawnImps,
        setGold
    )
    println(dungeon)
}