package facade.appliances

class TheaterLights {
    fun on() {
        println("TheaterLights are on")
    }

    fun off() {
        println("TheaterLights are off")
    }

    fun dim(level: Int) {
        println("TheaterLights are dimmed to $level")
    }

    override fun toString(): String {
        return "TheaterLights"
    }
}