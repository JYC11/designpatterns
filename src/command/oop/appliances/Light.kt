package command.oop.appliances

class Light(
    val name: String
) {
    fun on() {
        println("$name light on")
    }

    fun off() {
        println("$name light off")
    }
}