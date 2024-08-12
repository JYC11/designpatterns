package command.appliances

class CeilingFan(
    private var speed: CeilingFanSpeeds = CeilingFanSpeeds.OFF,
    var isOn: Boolean = false
) {


    fun on() {
        isOn = true
        speed = CeilingFanSpeeds.MEDIUM
        println("Ceiling fan on")
    }

    fun off() {
        isOn = false
        speed = CeilingFanSpeeds.OFF
        println("Ceiling fan off")
    }

    fun setSpeed(newSpeed: CeilingFanSpeeds) {
        speed = newSpeed
        println("Ceiling fan is on $newSpeed")
    }

    fun getSpeed(): CeilingFanSpeeds {
        println("Ceiling fan speed is $speed")
        return speed
    }
}