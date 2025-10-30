package main;
import main.concrete_strategies.EconomyRide;
import main.concrete_strategies.PoolRide;
import main.concrete_strategies.PremiumRide;
import main.interfaces.IRideStrategy;

public class RideSystemDemo {
    public static void main(String[] args) {
        IRideStrategy poolRide = new PoolRide();
        IRideStrategy economyRide = new EconomyRide();
        IRideStrategy premiumRide = new PremiumRide();

        System.out.println("========================================");
        System.out.println("RIDE BOOKING SYSTEM");
        System.out.println("========================================");

        RideRequest request = new RideRequest(15, 2, "Talgat Sailaubekov");

        System.out.println("\nExample 1: Pool Ride");
        request.setRideStrategy(poolRide);
        request.processRequest();

        System.out.println("\nExample 2: Economy Ride");
        request.setRideStrategy(economyRide);
        request.processRequest();

        System.out.println("\nExample 3: Premium Ride");
        request.setRideStrategy(premiumRide);
        request.processRequest();
    }
}
