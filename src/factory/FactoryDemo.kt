package factory

import factory.fp.makeFantasyGameLevel
import factory.fp.setDirtTiles
import factory.fp.setGold
import factory.fp.setNoLoot
import factory.fp.setStoneTiles
import factory.fp.setStoneWalls
import factory.fp.setWoodWalls
import factory.fp.spawnImps
import factory.fp.spawnWolves
import factory.oop.ChicagoPizzaStore
import factory.oop.NyPizzaStore
import factory.oop.pizza.PizzaType
import factory.oop.pizza.SimplePizzaFactory

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