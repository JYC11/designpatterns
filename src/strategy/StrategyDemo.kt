package strategy

fun strategyDemo() {
    val mallardDuck = MallardDuck()
    val rubberDuck = RubberDuck()

    mallardDuck.fly()
    mallardDuck.quack()

    rubberDuck.fly()
    rubberDuck.quack()
}