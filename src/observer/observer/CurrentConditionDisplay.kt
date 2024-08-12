package observer.observer

import observer.subject.WeatherData

class CurrentConditionDisplay(
    private var weatherData: WeatherData
) : IObserver, IDisplayElement {
    private var temperature: Float = 0.0F
    private var humidity: Float = 0.0F

    init {
        weatherData.registerObserver(this)
    }

    override fun update() {
        this.temperature = weatherData.temperature
        this.humidity = weatherData.humidity
        display()
    }

    override fun display() {
        println("Current conditions $temperature Celsius and $humidity% humidity")
    }
}