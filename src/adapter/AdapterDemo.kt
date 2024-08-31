package adapter

import adapter.fp.DomainModel
import adapter.fp.save
import adapter.oop.TurkeyAdapter
import adapter.oop.WildTurkey

fun adapterDemo() {
    // OOP
    val turkey = WildTurkey()
    val adapter = TurkeyAdapter(turkey)
    adapter.quack()
    adapter.fly()

    // FP
    val domainModel = DomainModel(1, "fizzbuzz", "foobar")
    save(model = domainModel)
}