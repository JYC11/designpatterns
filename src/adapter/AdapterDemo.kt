package adapter

import adapter.fp.DomainModel
import adapter.fp.jsonLogger
import adapter.fp.makeExternalApiRequest
import adapter.fp.save
import adapter.fp.xmlLogger
import adapter.fp.xmlLoggerAdapter
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

    println("just using json logger")
    makeExternalApiRequest(jsonLogger)
    println("with adapter")
    makeExternalApiRequest(xmlLoggerAdapter(xmlLogger))
}