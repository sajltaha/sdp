package main;
import main.concrete_strategies.EconomyRide;
import main.concrete_strategies.PoolRide;
import main.concrete_strategies.PremiumRide;

public class RideSystemDemo {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("RIDE BOOKING SYSTEM");
        System.out.println("========================================");
        RideRequest request = new RideRequest(15, 2, "Talgat Sailaubekov");
        System.out.println("\nExample 1: Pool Ride");
        request.setRideStrategy(new PoolRide());
        request.processRequest();
        System.out.println("\nExample 2: Economy Ride");
        request.setRideStrategy(new EconomyRide());
        request.processRequest();
        System.out.println("\nExample 3: Premium Ride");
        request.setRideStrategy(new PremiumRide());
        request.processRequest();
    }
}
