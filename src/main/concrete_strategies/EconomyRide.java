package main.concrete_strategies;
import main.interfaces.IRideStrategy;

// One of the concrete strategies

public class EconomyRide implements IRideStrategy {
    public float calculateFare(int distance, int passengers) {
        int baseFare = 100;
        int farePerKm = 20;
        int farePerPassenger = 10;
        return baseFare + (distance * farePerKm) + (passengers * farePerPassenger);
    }

    public String getETA(int distance) {
        int minutes = distance * 2;
        if (minutes < 10) {
            return "within 10 minutes";
        }
        return minutes + " minutes";
    }

    public String getName() {
        return "Economy Ride";
    }
}
