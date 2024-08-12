package observer

import observer.observer.CurrentConditionDisplay
import observer.observer.ForecastDisplay
import observer.subject.WeatherData

fun observerDemo() {
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
}