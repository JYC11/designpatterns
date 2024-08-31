package adapter.oop

class WildTurkey : Turkey() {
    override fun gobble() {
        println("Gobble gobble")
    }

    override fun fly() {
        println("Fly a little")
    }
}