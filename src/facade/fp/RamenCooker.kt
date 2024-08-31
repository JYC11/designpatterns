package facade.fp

fun getPot() = println("getting a pot")
fun putWaterInPot() = println("putting water in pot")
fun boilWater() = println("boil water")
fun getRamen() = println("getting ramen")
fun putNoodlesInPot() = println("putting noodles in pot")
fun putSeasoningInPot() = println("put seasoning in pot")
fun waitForThreeMinutes() = println("wait For 3 minutes")
fun takePotOffFire() = println("taking pot of fire")

fun cookRamen() {
    getPot()
    putWaterInPot()
    boilWater()
    getRamen()
    putNoodlesInPot()
    putSeasoningInPot()
    waitForThreeMinutes()
    takePotOffFire()
}