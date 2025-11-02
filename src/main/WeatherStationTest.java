package main;

import main.concrete_subjects.WeatherData;
import main.observers.CurrentConditionsDisplay;
import main.observers.ForecastDisplay;

public class WeatherStationTest {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        // Simulate changes
        weatherData.setMeasurements(80, 65, 30.4f);
        System.out.println("---");

        weatherData.setMeasurements(82, 70, 29.2f);
        System.out.println("---");

        // Remove forecast and update
        weatherData.removeObserver(forecastDisplay);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
