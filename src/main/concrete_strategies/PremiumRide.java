package main.concrete_strategies;
import main.interfaces.IRideStrategy;

// One of the concrete strategies

public class PremiumRide implements IRideStrategy {
    public float calculateFare(int distance, int passengers) {
        int baseFare = 500;
        int farePerKm = 50;
        int farePerPassenger = 20;
        return baseFare + (distance * farePerKm) + (passengers * farePerPassenger);
    }

    public String getETA(int distance) {
        int minutes = (int) (distance * 1.5);
        if (minutes < 5) {
            return "within 5 minutes";
        }
        return minutes + " minutes";
    }

    public String getName() {
        return "Premium Ride";
    }
}