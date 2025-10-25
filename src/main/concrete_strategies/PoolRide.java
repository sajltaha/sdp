package main.concrete_strategies;
import main.interfaces.IRideStrategy;

// One of the concrete strategies

public class PoolRide implements IRideStrategy {
    public float calculateFare(int distance, int passengers) {
        int farePerKm = 15;
        int baseFare = 50;
        float totalFare = baseFare + (distance * farePerKm);
        return totalFare / passengers;
    }

    public String getETA(int distance) {
        int minutes = distance * 3;
        return minutes + " minutes";
    }

    public String getName() {
        return "Pool Ride";
    }
}
