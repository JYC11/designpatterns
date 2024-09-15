package observer

import observer.fp.publisher
import observer.oop.observer.CurrentConditionDisplay
import observer.oop.observer.ForecastDisplay
import observer.oop.subject.WeatherData

fun main() {
    println("OOP")
    val weatherData = WeatherData()
    weatherData.registerObserver(
        observer = ForecastDisplay(weatherData),
    )
    weatherData.registerObserver(
        observer = CurrentConditionDisplay(weatherData),
    )
    weatherData.setMeasurements(
        temperature = 27.0f,
        humidity = 20.0f,
        pressure = 40.0f,
    )
    weatherData.setMeasurements(
        temperature = 30.0f,
        humidity = 50.0f,
        pressure = 10.0f,
    )

    println("FP")
    publisher()
}