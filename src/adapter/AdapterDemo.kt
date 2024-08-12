package adapter

import strategy.MallardDuck

fun adapterDemo() {
    val turkey = WildTurkey()
    val adapter = TurkeyAdapter(turkey)
    adapter.quack()
    adapter.fly()
}