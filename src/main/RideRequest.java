package main;
import main.interfaces.IRideStrategy;

// Context

public class RideRequest {
    private IRideStrategy rideStrategy;
    private final String requestId;
    private final int distance;
    private final int passengers;
    private final String userName;

    public RideRequest(String requestId, int distance, int passengers, String userName) {
        this.requestId = requestId;
        this.distance = distance;
        this.passengers = passengers;
        this.userName = userName;
    }

    public void setRideStrategy(IRideStrategy rideStrategy) {
        this.rideStrategy = rideStrategy;
    }

    public void processRequest() {
        float fare = rideStrategy.calculateFare(distance, passengers);
        String eta = rideStrategy.getETA(distance);
        System.out.println("\n========================================");
        System.out.println("RIDE REQUEST DETAILS");
        System.out.println("========================================");
        System.out.println("Request ID: " + requestId);
        System.out.println("User: " + userName);
        System.out.println("Ride Type: " + rideStrategy.getName());
        System.out.println("----------------------------------------");
        System.out.println("Distance: " + distance + " km");
        System.out.println("Passengers: " + passengers);
        System.out.println("----------------------------------------");
        System.out.println("Fare: " + fare + " ₸");
        System.out.println("ETA: " + eta);
        System.out.println("========================================\n");
    }
}