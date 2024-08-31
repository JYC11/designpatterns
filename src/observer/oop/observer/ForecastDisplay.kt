package observer.oop.observer

import observer.oop.subject.WeatherData

class ForecastDisplay(
    private var weatherData: WeatherData
) : IObserver, IDisplayElement {
    private var lastPressure: Float = 0.0F
    private var currentPressure: Float = 29.92F

    init {
        weatherData.registerObserver(this)
    }

    override fun update() {
        lastPressure = currentPressure;
        currentPressure = weatherData.pressure
        display()
    }

    override fun display() {
        println("current pressure $currentPressure, previous pressure $lastPressure")
    }
}