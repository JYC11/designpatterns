package observer.oop.subject

import observer.oop.observer.IObserver

class WeatherData(
    private val observers: MutableList<IObserver> = mutableListOf(),
    var temperature: Float = 0.0f,
    var humidity: Float = 0.0f,
    var pressure: Float = 0.0f,
) : ISubject {

    override fun registerObserver(observer: IObserver) {
        observers.add(observer)
    }

    override fun removeObserver(observer: IObserver) {
        observers.remove(observer)
    }

    override fun notifyObservers() {
        for (observer in observers) {
            observer.update()
        }
    }

    fun setMeasurements(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        notifyObservers()
    }
}