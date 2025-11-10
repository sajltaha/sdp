package main.concrete_subjects;

import main.interfaces.IObserver;
import main.interfaces.ISubject;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements ISubject {
    private final List<IObserver> observers = new ArrayList<>();
    private float temperature;
    private float humidity;
    private float pressure;

    public void registerObserver(IObserver o) {
        observers.add(o);
    }

    public void removeObserver(IObserver o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (IObserver observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }
}
