package main.observers;

import main.interfaces.Observer;
import main.interfaces.Subject;

public class ForecastDisplay implements Observer {
    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForecastDisplay(Subject weatherData) {
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
