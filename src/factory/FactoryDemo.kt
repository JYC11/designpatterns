package factory

import factory.fp.makeGameLevel
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

fun factoryDemo() {
    // OOP
    val chicagoPizzaStore = ChicagoPizzaStore(pizzaFactory = SimplePizzaFactory())
    val nyPizzaStore = NyPizzaStore(pizzaFactory = SimplePizzaFactory())

    val chicagoCheesePizza = chicagoPizzaStore.createPizza(type = PizzaType.CHEESE)
    val nyPepperoniPizza = nyPizzaStore.createPizza(type = PizzaType.PEPPERONI)
    println(chicagoCheesePizza)
    println(nyPepperoniPizza)

    // FP
    makeGameLevel(
        setStoneWalls,
        setStoneTiles,
        spawnImps,
        setGold
    )
    makeGameLevel(
        setWoodWalls,
        setDirtTiles,
        spawnWolves,
        setNoLoot
    )
}