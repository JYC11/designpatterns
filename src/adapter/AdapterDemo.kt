package adapter

import adapter.fp.DomainModel
import adapter.fp.save
import adapter.oop.TurkeyAdapter
import adapter.oop.WildTurkey

fun main() {
    println("OOP")
    val turkey = WildTurkey()
    val adapter = TurkeyAdapter(turkey)
    adapter.quack()
    adapter.fly()

    println("FP")
    val domainModel = DomainModel(1, "fizzbuzz", "foobar")
    save(model = domainModel)
}