package strategy.behaviours

class MuteQuack : IQuackBehaviour {
    override fun quack() {
        println("nothing!")
    }
}