package strategy.oop.behaviours

class MuteQuack : IQuackBehaviour {
    override fun quack() {
        println("nothing!")
    }
}