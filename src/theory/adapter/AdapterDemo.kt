package theory.adapter

import theory.adapter.fp.DomainModel
import theory.adapter.fp.jsonLogger
import theory.adapter.fp.makeExternalApiRequest
import theory.adapter.fp.save
import theory.adapter.fp.xmlLogger
import theory.adapter.fp.xmlLoggerAdapter
import theory.adapter.oop.TurkeyAdapter
import theory.adapter.oop.WildTurkey

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
    println("with theory.adapter")
    makeExternalApiRequest(xmlLoggerAdapter(xmlLogger))
}