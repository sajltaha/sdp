package main.observers;

import main.interfaces.IObserver;
import main.interfaces.ISubject;

public class ForecastDisplay implements IObserver {
    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForecastDisplay(ISubject weatherData) {
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }

    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather!");
        } else if (currentPressure == lastPressure) {
            System.out.println("Same as before");
        } else {
            System.out.println("Rainy weather ahead");
        }
    }
}
